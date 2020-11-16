package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numar contract: ");
        String numarContract = scanner.next();
        System.out.println("Numar minute: ");
        int numarMinute = scanner.nextInt();

        Sammy sammy = new Sammy(numarContract, numarMinute);
        System.out.println("Numar ore: " + sammy.getNumarOre());
        System.out.println("Numar minute: " + sammy.getNumarMinute());
        int minuteSuplimentare = (numarMinute - (sammy.getNumarOre() * 60));
        System.out.println("Minute suplimentare: " +minuteSuplimentare);
        System.out.println("Pret ora: " + sammy.getPret());
        System.out.println("Pret total: " + (sammy.getNumarOre() * sammy.getPret() + minuteSuplimentare * 1));
    }
}
