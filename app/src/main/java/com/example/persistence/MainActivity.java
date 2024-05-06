package com.example.persistence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private SQLiteDatabase database;
    private DatabaseHelper databaseHelper;
    private Button readButton;
    private Button writeButton;
    private EditText nameAdd;
    private EditText poisonLevelAdd;
    private EditText colorAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper = new DatabaseHelper(this);
        database = databaseHelper.getWritableDatabase();

        readButton = findViewById(R.id.readButton);
        writeButton = findViewById(R.id.writeButton);

        nameAdd = findViewById(R.id.editView1);
        poisonLevelAdd = findViewById(R.id.editView2);
        colorAdd = findViewById(R.id.editView3);

        writeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContentValues values = new ContentValues();
                values.put(DatabaseTables.Plant.COLUMN_NAME_NAME, nameAdd.getText().toString());
                values.put(DatabaseTables.Plant.COLUMN_NAME_POISONLEVEL, poisonLevelAdd.getText().toString());
                values.put(DatabaseTables.Plant.COLUMN_NAME_COLOR, colorAdd.getText().toString());
                database.insert(DatabaseTables.Plant.TABLE_NAME, null, values);
                nameAdd.setText("");
                poisonLevelAdd.setText("");
                colorAdd.setText("");
            }
        });


    }
}
