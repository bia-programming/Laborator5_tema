package com.company;

import java.util.Scanner;


public class Main {
    public final static int pretOaspete = 35;
    public final static int valoareLimita = 50;

    public static void main(String[] args) {
        Eveniment eveniment = new Eveniment(numarEveniment(), numarInvitati(), pretOaspete);

        System.out.println("Numarul evenimentului: " + eveniment.getNumarEveniment());
        System.out.println("Numar invitati: " + eveniment.getNumarInvitati());
        System.out.println("Pret/ oaspete: " + pretOaspete);
        System.out.println("Pret total: " + eveniment.getNumarInvitati()*pretOaspete);

        if(eveniment.getNumarInvitati()>=valoareLimita)
            System.out.println("Este un eveniment mare");
        else
            System.out.println("Nu este un eveniment mare");
    }

    static int numarInvitati() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numar invitati: ");
        int invitati = scanner.nextInt();
        return invitati;
    }

    static int numarEveniment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numar eveniment: ");
        int numarEveniment = scanner.nextInt();
        return numarEveniment;
    }
}
