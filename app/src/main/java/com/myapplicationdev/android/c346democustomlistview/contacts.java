package com.myapplicationdev.android.c346democustomlistview;

public class contacts {
    private String name;
    private int countryCode;
    private int phoneNum;
    private char gender;

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public contacts(String name, int countryCode, int phoneNum, char gender) {
        this.name = name;
        this.countryCode = countryCode;
        this.phoneNum = phoneNum;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }
}
