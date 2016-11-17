package edu.fje.clot.sudoku.bean;

import android.support.annotation.NonNull;

import java.util.Date;

/**
 * Created by becari on 17/11/2016.
 */

public class Score implements Comparable {
    private int _id = -1;
    private int _value = 0;
    private Date _date = new Date();

    public Score() { }
    public Score(int value) {
        this();
        setValue(value);
    }
    public Score(int id, int value) {
        this(value);
        setId(id);
    }
    public Score(int id, int value, Date date) {
        this(id, value);
        setDate(date);
    }

    public int getId() {
        return _id;
    }
    public void setId(int id) {
        _id = id;
    }
    public int getValue() {
        return _value;
    }
    public void setValue(int value) {
        _value = value;
    }
    public Date getDate() {
        return _date;
    }
    public void setDate(Date date) {
        _date = date;
    }

    @Override
    public int compareTo(@NonNull Object obj) {
        if(!(obj instanceof Score)) return -1;
        return getValue() - ((Score) obj).getValue();
    }
    @Override
    public boolean equals(@NonNull Object obj) {
        if(!(obj instanceof Score)) return false;
        return getId() == ((Score) obj).getId();
    }
}