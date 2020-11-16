package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Sammy demo = new Sammy(numarContract(), numarInvitati());

        System.out.println("Numarul de ore: " + demo.getNumarOre());
        System.out.println("Numar minute: " + demo.getNumarMinute());
        int minuteSuplimentare = (demo.getNumarMinute() - (demo.getNumarOre() * 60));
        System.out.println("Minute suplimentare: " +minuteSuplimentare);
        System.out.println("Pret ora: " + demo.getPret());
        System.out.println("Pret total: " + (demo.getNumarOre() * demo.getPret() + minuteSuplimentare * 1));
    }

    static int numarInvitati() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numar minute: ");
        int minute = scanner.nextInt();
        return minute;
    }

    static int numarContract() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numar contract: ");
        int numarContract = scanner.nextInt();
        return numarContract;
    }
}
