package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int silnia = 1;
	Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba = wejscie.nextInt();
        for (int i = 2; i <= liczba; i++)
        {
            silnia *= i;
        }
        System.out.println("Silnia dla liczby " + liczba + " wynosi " + silnia);

        }
    }

