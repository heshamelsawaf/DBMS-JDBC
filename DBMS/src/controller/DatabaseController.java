package controller;

import model.DatabaseHelper;
import model.statements.Query;

public class DatabaseController implements DBMS {
    private DBMSController dbmsController;
    private DatabaseHelper dbHelper;

    public DatabaseController(DBMSController dbmsController) {
        this.dbmsController = dbmsController;
        dbHelper = new DatabaseHelper(this);
    }

    public DatabaseHelper getHelper() {
        return dbHelper;
    }

    @Override
    public void create(Query query) {

    }

    @Override
    public void drop(Query query) {

    }

    @Override
    public void insertIntoTable(Query query) {

    }

    @Override
    public void updateTable(Query query) {

    }

    @Override
    public void selectFromTable(Query query) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteFromTable(Query query) {

    }

}
