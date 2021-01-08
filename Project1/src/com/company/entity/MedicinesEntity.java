package com.company.entity;

import java.sql.Date;

public class MedicinesEntity {
    private int CODE;
    private String NAME;
    private int NUM;
    private int PRICE;
    private Date EXPDATE;
    public int getCODE() {
        return CODE;
    }

    public void setCODE(int CODE) {
        this.CODE = CODE;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getNUM() {
        return NUM;
    }

    public void setNUM(int NUM) {
        this.NUM = NUM;
    }

    public int getPRICE() {
        return PRICE;
    }

    public void setPRICE(int PRICE) {
        this.PRICE = PRICE;
    }

    public Date getEXPDATE() {
        return EXPDATE;
    }

    public void setEXPDATE(Date EXPDATE) {
        this.EXPDATE = EXPDATE;
    }


}
