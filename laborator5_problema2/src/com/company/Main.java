package com.company;

import java.util.Scanner;

public class Main {
    public final static int pretOaspete = 35;
    public final static int valoareLimita = 50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numar invitati: ");
        int nrInvitati = scanner.nextInt();
        System.out.println("Numar eveniment: ");
        String numarEveniment = scanner.next();
        CarlyCatering carlyCatering = new CarlyCatering(numarEveniment, nrInvitati, pretOaspete);

        System.out.println("Numar invitati: " + carlyCatering.getNumarInvitati());
        System.out.println("Pret/ oaspete: " + pretOaspete);
        carlyCatering.setNumarInvitati(nrInvitati);
        System.out.println("Pret total: " + carlyCatering.getNumarInvitati());
        System.out.println("Numar eveniment: " + carlyCatering.getNumarEveniment());

        if (nrInvitati >= valoareLimita)
            System.out.println("Eveniment mare");
        else
            System.out.println("Nu este un eveniment mare");

    }
}
