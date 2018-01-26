package com.example.khansaahsan.Model;

/**
 * Created by Khansa Ahsan on 1/23/2018.
 */

public class Record {
    private int id;
    private String oprnd1;
    private String oprnd2;
    private String operation;
    private String result;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOprnd1() {
        return oprnd1;
    }

    public void setOprnd1(String oprnd1) {
        this.oprnd1 = oprnd1;
    }

    public String getOprnd2() {
        return oprnd2;
    }

    public void setOprnd2(String oprnd2) {
        this.oprnd2 = oprnd2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
