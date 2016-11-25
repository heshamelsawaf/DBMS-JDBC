package controller;

import java.util.List;

import model.statements.Clause;

public interface DBMS {

    public boolean createDatabase(String databaseName);

    public boolean createTable(String tableName, List<String> colNames, List<Class<?>> types);

    public boolean dropTable(String tableName);

    public boolean dropDatabase(String databaseName);

    public boolean insertIntoTable(String tableName, List<String> colNames, List<Object> values);

    public boolean insertIntoTable(String tableName, List<Object> values);

    public boolean selectFromTable(String tableName, List<String> colNames, List<Clause> clauses);

    public boolean updateTable(String tableName, List<String> colNames, List<Object> values,
            List<Clause> clauses);

    public boolean deleteFromTable(String tableName, List<String> colNames, List<Object> values,
            List<Clause> clauses);
}
