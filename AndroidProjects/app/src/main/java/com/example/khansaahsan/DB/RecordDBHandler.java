package com.example.khansaahsan.DB;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.EditText;

import com.example.khansaahsan.Model.Record;

import java.util.ArrayList;

/**
 * Created by Wajeeh Ahsan on 1/23/2018.
 */

public class RecordDBHandler extends SQLiteOpenHelper {

    public RecordDBHandler(Context context)
    {
        super(context,"Record.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {

        String query = "CREATE TABLE IF NOT EXISTS RECORD (ID INTEGER PRIMARY KEY AUTOINCREMENT , OPERAND1 FLOAT, OPERATOR TEXT, OPERAND2 FLOAT, RESULT TEXT);";

        db.execSQL(query);

        //db.execSQL("CREATE TABLE RECORD (ID INTEGER PRIMARY KEY AUTOINCREMENT, OPERAND1 INTEGER, OPERATOR TEXT, OPERAND2 INTEGER, RESULT TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        /*db.execSQL("DROP TABLE IF EXISTS RECORD");
        onCreate(db);*/
    }

    public void insert(Float first, String operation, Float second, Float result)
    {
        ContentValues cv = new ContentValues();
        cv.put("OPERAND1",first);
        cv.put("OPERATOR",operation);
        cv.put("OPERAND2",second);
        cv.put("Result",result);
        this.getWritableDatabase().insertOrThrow("RECORD","",cv);
    }
    public ArrayList<Record> read()
    {
        ArrayList<Record> localList= new ArrayList<>();
        Cursor cursor = this.getReadableDatabase().rawQuery("SELECT * FROM RECORD",null);
        cursor.moveToFirst();

        if(cursor !=null)
        {
            if(cursor.getCount() > 0)
            {
              int counter = cursor.getCount();
              int i =0;
              while(i < counter)
              {
                  Record _refRecord = new Record();

                  int operand1Index = cursor.getColumnIndex("OPERAND1");
                  int operand2Index = cursor.getColumnIndex("OPERAND2");
                  int resultIndex   = cursor.getColumnIndex("RESULT");
                  int operatorIndex = cursor.getColumnIndex("OPERATOR");

                  _refRecord.setOperation(cursor.getString(operatorIndex));
                  _refRecord.setResult(cursor.getString(resultIndex));
                  _refRecord.setOprnd1(cursor.getString(operand1Index));
                  _refRecord.setOprnd2(cursor.getString(operand2Index));

                  localList.add(_refRecord);

                  i++;
                  cursor.moveToNext();
              }

            }
        }

        return localList;
    }

    public  void delete()
    {
        this.getWritableDatabase().delete("RECORD",null,null);
    }
}
