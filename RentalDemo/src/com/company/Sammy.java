package com.company;

public class Sammy {
    public final static int pretOra = 40;
    public final static int minuteOra = 60;
    private int numarContract;
    private int numarOre;
    private int numarMinute;
    private int pret;

    public Sammy(int numarContract,int numarMinute) {
        this.numarContract = numarContract;
        this.numarMinute = numarMinute;
    }

    public int getNumarContract() {
        return numarContract;
    }

    public int getNumarOre() {
        return numarMinute/minuteOra;
    }

    public void setNumarContract(int numarContract) {
        this.numarContract = numarContract;
    }

    public int getPret() {
        return pretOra;
    }

    public int getNumarMinute() {
        return numarMinute;
    }

    public void setNumarMinute(int numarMinute) {
        this.numarMinute = numarMinute;
    }
}
