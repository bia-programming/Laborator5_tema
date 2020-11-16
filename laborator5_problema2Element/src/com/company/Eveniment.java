package com.company;

public class Eveniment {
    private int numarEveniment;
    private int numarInvitati;
    private int pret;

    public Eveniment(int numarEveniment, int numarInvitati, int pret) {
        this.numarEveniment = numarEveniment;
        this.numarInvitati = numarInvitati;
        this.pret = pret;
    }

    public int getNumarEveniment() {
        return numarEveniment;
    }

    public void setNumarEveniment(int numarEveniment) {
        this.numarEveniment = numarEveniment;
    }

    public int getNumarInvitati() {
        return numarInvitati;
    }

    public void setNumarInvitati(int numarInvitati) {
        this.numarInvitati = numarInvitati;
    }

}
