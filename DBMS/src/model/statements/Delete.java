package model.statements;

import java.text.ParseException;

import controller.DBMS;
import util.App;
import util.Regex;
import util.RegexEvaluator;

public class Delete extends Query {

    private boolean isAll;
    private String tableIdentifier;

    public Delete() {
        super();
        this.isAll = false;
    }

    private boolean checkRegex(String s) {
        String[] groups = RegexEvaluator.evaluate(s, Regex.PARSE_WITH_DELETE_ALL);
        if (App.checkForExistence(groups)) {
            this.isAll = App.checkForExistence(groups[1]);
            this.extractTable(groups[2].trim());
        }
        return false;
    }

    private void extractTable(String s) {
        this.tableIdentifier = s.trim();
    }

    public String getTableIdentifier() {
        return this.tableIdentifier;
    }

    public boolean isAll() {
        return this.isAll;
    }
    
    @Override
    public void addClause(Clause clause) {
        super.addClause(clause);
        if (clause instanceof Where && this.isAll) {
            throw new RuntimeException("Syntax Error");
        }
    }

    @Override
    public void parse(String s) throws ParseException {
        if (!App.checkForExistence(s) || !this.checkRegex(s))
            throw new ParseException("Invalid", 0);
    }

    @Override
    public void execute(DBMS dbms) throws RuntimeException {
        dbms.deleteFromTable(this.getTableIdentifier());
    }
    
}
