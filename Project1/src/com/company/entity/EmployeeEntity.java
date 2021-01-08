package com.company.entity;

public class EmployeeEntity {
    private long MELLICODE;
    private String NAME;
    private String FAMILY;
    private long PHONENUM;
    private String CITY;
    private String STREET;
    private String ALLEY;
    private String USERNAME;
    private String PASSWORD;

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }


    public long getMELLICODE() {
        return MELLICODE;
    }

    public void setMELLICODE(long MELLICODE) {
        this.MELLICODE = MELLICODE;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getFAMILY() {
        return FAMILY;
    }

    public void setFAMILY(String FAMILY) {
        this.FAMILY = FAMILY;
    }

    public long getPHONENUM() {
        return PHONENUM;
    }

    public void setPHONENUM(long PHONENUM) {
        this.PHONENUM = PHONENUM;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getSTREET() {
        return STREET;
    }

    public void setSTREET(String STREET) {
        this.STREET = STREET;
    }

    public String getALLEY() {
        return ALLEY;
    }

    public void setALLEY(String ALLEY) {
        this.ALLEY = ALLEY;
    }

    public int getPELAKNUM() {
        return PELAKNUM;
    }

    public void setPELAKNUM(int PELAKNUM) {
        this.PELAKNUM = PELAKNUM;
    }

    private int PELAKNUM;
}
