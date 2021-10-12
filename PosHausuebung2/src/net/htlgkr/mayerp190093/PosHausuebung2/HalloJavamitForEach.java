/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.mayerp190093.PosHausuebung2;

import java.awt.BorderLayout;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 *
 * @author mayer
 */
public class HalloJavamitForEach {

    public static void main(String[] args) {
        List<String> liste = new ArrayList<String>(Arrays.asList());
        liste.add("Enes");
        liste.add("Fabi");
        liste.add("Krits");
        for (String string : liste) {
            System.out.println(string);
        }

        liste.forEach((String s) -> System.out.println(s));

        liste.forEach(System.out::print);

        Consumer<String> consumer = (String s) -> System.out.println(s);

        NumberTester nu = new NumberTester("number.txt");
        nu.testFile();
        Scanner sc = new Scanner(System.in);

        Number.CalculationOperation addRational = (x, y) -> {
            Number c = new Number();
            double neuZaehler = x.getA() * y.getB() + y.getA() * x.getB();
            double neuNenner = x.getB() * y.getB();
            c.setA(neuZaehler);
            c.setB(neuNenner);
            return c;
        };

        Number.CalculationOperation subtractRational = (x, y) -> {
            Number c = new Number();
            double neuZaehler = x.getA() * y.getB() - y.getA() * x.getB();
            double neuNenner = x.getB() * y.getB();
            c.setA(neuZaehler);
            c.setB(neuNenner);
            return c;
        };

        Number.CalculationOperation multiplyRational = (x, y) -> {
            Number c = new Number();
            double neuZaehler = x.getA() * y.getA();
            double neuNenner = x.getB() * y.getB();
            c.setA(neuZaehler);
            c.setB(neuNenner);
            return c;
        };

        Number.CalculationOperation divideRational = (x, y) -> {
            Number c = new Number();
            double neuZaehler = x.getA() * y.getB();
            double neuNenner = x.getB() * y.getA();
            c.setA(neuZaehler);
            c.setB(neuNenner);
            return c;
        };

        RationalCalculator r = new RationalCalculator(addRational, subtractRational, multiplyRational, divideRational);

        Number.CalculationOperation addVector = (x, y) -> {
            Number c = new Number();
            double aa = x.getA() + y.getA();
            double bb = x.getB() + y.getB();
            c.setA(aa);
            c.setB(bb);
            return c;
        };

        Number.CalculationOperation subtractVector = (x, y) -> {
            Number c = new Number();
            double aa = x.getA() - y.getA();
            double bb = x.getB() - y.getB();
            c.setA(aa);
            c.setB(bb);
            return c;
        };

        Number.CalculationOperation multiplyVector = (x, y) -> {
            Number c = new Number();
            double aa = x.getA() * y.getA();
            double bb = x.getB() * y.getB();
            c.setA(aa);
            c.setB(bb);
            return c;
        };

        Number.CalculationOperation divideVector = (x, y) -> {
            Number c = new Number();
            double neuZaehler = x.getA() * y.getB();
            double neuNenner = x.getB() * y.getA();
            c.setA(neuZaehler);
            c.setB(neuNenner);
            return c;
        };

        VectorCalculator v = new VectorCalculator(addVector, subtractVector, multiplyVector, divideVector);

        Number.CalculationOperation addComplex = (x, y) -> {
            Number c = new Number();
            double aa = x.getA() + y.getA();
            double bb = x.getB() + y.getB();
            c.setA(aa);
            c.setB(bb);
            return c;
        };

        Number.CalculationOperation subtractComplex = (x, y) -> {
            Number c = new Number();
            double aa = x.getA() * y.getA();
            double bb = x.getB() * x.getB();
            c.setA(aa);
            c.setB(bb);
            return c;
        };

        Number.CalculationOperation multiplyComplex = (x, y) -> {
            Number c = new Number();
            double aa = x.getA() * y.getA();
            double bb = x.getB() * y.getB();
            c.setA(aa);
            c.setB(bb);
            return c;
        };

        Number.CalculationOperation divideComplex = (x, y) -> {
            Number c = new Number();
            double neuZaehler = x.getA() * y.getB();
            double neuNenner = x.getB() * y.getA();
            c.setA(neuZaehler);
            c.setB(neuNenner);
            return c;
        };

        ComplexCalculator c = new ComplexCalculator(addComplex, subtractComplex, multiplyComplex, divideComplex);

        int eing = 0;
        double eing1 = 0;
        double eing2 = 0;
        double eing3 = 0;
        double eing4 = 0;
        int eing5 = 0;
        do {
            System.out.println("1...Relational Calculator");
            System.out.println("2...Vector calculator");
            System.out.println("3...Complex calculator");
            System.out.println("4...Exit program");
            eing = Integer.parseInt(sc.nextLine());
            AbstractCalculator a = null;
            switch (eing) {
                case 1:
                    a = r;
                    break;
                case 2:
                    a = v;
                    break;
                case 3:
                    a = c;
                    break;
            }
            Number n1 = new Number();
            Number n2 = new Number();
            Number erg = new Number();

            System.out.println("Enter number x a:");
            eing1 = Double.parseDouble(sc.nextLine());
            System.out.println("Enter number x b:");
            eing2 = Double.parseDouble(sc.nextLine());
            System.out.println("Enter number y a:");
            eing3 = Double.parseDouble(sc.nextLine());
            System.out.println("Enter number y b:");
            eing4 = Double.parseDouble(sc.nextLine());
            n1.setA(eing1);
            n1.setB(eing2);
            n2.setA(eing3);
            n2.setB(eing4);

            console();
            eing5 = Integer.parseInt(sc.nextLine());
            switch (eing5) {
                case 1:
                    erg = a.add(n1, n2);
                    System.out.println(erg.getA());
                    System.out.println(erg.getB());
                    break;
                case 2:
                    erg = a.subtract(n1, n2);
                    System.out.println(erg.getA());
                    System.out.println(erg.getB());
                    break;
                case 3:
                    erg = a.multiply(n1, n2);
                    System.out.println(erg.getA());
                    System.out.println(erg.getB());
                    break;
                case 4:
                    erg = a.divide(n1, n2);
                    System.out.println(erg.getA());
                    System.out.println(erg.getB());
                    break;

            }
        } while (eing != 4);
    }

    public static void console() {
        System.out.println("1...add");
        System.out.println("2...subtract");
        System.out.println("3...multiply");
        System.out.println("4...divide");
    }
}
