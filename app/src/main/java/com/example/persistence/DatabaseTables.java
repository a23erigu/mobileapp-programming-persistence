package com.example.persistence;

public class DatabaseTables {
    static class Plant {

        static final String TABLE_NAME = "plant";
        static final String COLUMN_NAME_ID = "id";
        static final String COLUMN_NAME_NAME = "name";
        static final String COLUMN_NAME_POISONLEVEL = "poisonLevel";

    }

    static final String SQL_CREATE_TABLE_PLANT =
            // "CREATE TABLE mountain (id INTEGER PRIMARY KEY, name TEXT, height INT)"
            "CREATE TABLE " + Plant.TABLE_NAME + " (" +
                    Plant.COLUMN_NAME_ID + " INTEGER PRIMARY KEY," +
                    Plant.COLUMN_NAME_NAME + " TEXT," +
                    Plant.COLUMN_NAME_POISONLEVEL + " INT)";

    static final String SQL_DELETE_TABLE_PLANT =
            // "DROP TABLE IF EXISTS mountain"
            "DROP TABLE IF EXISTS " + Plant.TABLE_NAME;
}
