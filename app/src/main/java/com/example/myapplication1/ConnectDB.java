package com.example.myapplication1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ConnectDB extends SQLiteOpenHelper {
    private SQLiteDatabase db;
    private List<Student> students = new ArrayList<>();

    public ConnectDB(Context context) {
        super(context, "School", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table students(id int primary key autoIncrement, name varchar(20), surname varchar(20), age int, classroom varchar(20))");
        this.db = db;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public List<Student> read() {

        Cursor c = this.db.query("students", null, null, null, null, null, null);
        Student student = null;

        List<Student> list = new LinkedList<>();

        if (c.moveToNext()) {

            student = new Student(c.getString(0), c.getString(2), c.getInt(3), c.getString(4), c.getInt(0));
        }
        list.add(student);
        return (List<Student>) student;
    }

    public void add(String name, String surname, String classroom, String school) {
        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("surname", surname);
        values.put("classroom", classroom);
        values.put("school", school);
        db.insert("school", null, values);
    }
}
