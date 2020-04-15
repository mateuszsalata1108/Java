package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba = wejscie.nextInt();
        if (liczba %2 == 0)
        {
            System.out.println("Liczba jest parzysta");
        }
        else
        {
            System.out.println("Liczba jest nieparzysta");
        }
    }
}
