package com.company;

public class CarlyCatering {
    private String numarEveniment;
    private int numarInvitati;
    private int pret;

    public CarlyCatering(String numarEveniment, int numarInvitati, int pret) {
        this.numarEveniment = numarEveniment;
        this.numarInvitati = numarInvitati;
        this.pret = pret;
    }

    public String getNumarEveniment() {
        return numarEveniment;
    }

    public void setNumarEveniment(String numarEveniment) {
        this.numarEveniment = numarEveniment;
    }

    public int getNumarInvitati() {
        return numarInvitati;
    }

    public void setNumarInvitati(int numarInvitati) {
        this.numarInvitati = numarInvitati*pret;
    }
}
