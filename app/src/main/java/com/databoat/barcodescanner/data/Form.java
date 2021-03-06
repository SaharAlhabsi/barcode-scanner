package com.databoat.barcodescanner.data;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "data" , foreignKeys = @ForeignKey(entity = User.class,
parentColumns = "name",
        childColumns = "name_id"
))

public class Form {
    @PrimaryKey(autoGenerate = true)
    private int idst;
    private String name_id;
    private String perusal_previous;
    private String perusal_current;
    private String perusal;
    private String idst_type;
    private String consumption;
    private String note;

    public int getIdst() {
        return idst;
    }

    public void setIdst(int idst) {
        this.idst = idst;
    }

    public String getName_id() {
        return name_id;
    }

    public void setName_id(String name_id) {
        this.name_id = name_id;
    }

    public String getPerusal_previous() {
        return perusal_previous;
    }

    public void setPerusal_previous(String perusal_previous) {
        this.perusal_previous = perusal_previous;
    }

    public String getPerusal_current() {
        return perusal_current;
    }

    public void setPerusal_current(String perusal_current) {
        this.perusal_current = perusal_current;
    }

    public String getPerusal() {
        return perusal;
    }

    public void setPerusal(String perusal) {
        this.perusal = perusal;
    }

    public String getIdst_type() {
        return idst_type;
    }

    public void setIdst_type(String idst_type) {
        this.idst_type = idst_type;
    }

    public String getConsumption() {
        return consumption;
    }

    public void setConsumption(String consumption) {
        this.consumption = consumption;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
