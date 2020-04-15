package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double v;
	Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj wartość zmiennej x: ");
        double x = wejscie.nextDouble();
        System.out.println("podaj wartość zmiennej y: ");
        double y = wejscie.nextDouble();
        System.out.println("podaj wartość zmiennej z: ");
        double z = wejscie.nextDouble();

        v = (4 * x - y)/(3 * (z * z + 1));
        System.out.println("Wartość wyrażenia wynosi: " + v);
    }
}
