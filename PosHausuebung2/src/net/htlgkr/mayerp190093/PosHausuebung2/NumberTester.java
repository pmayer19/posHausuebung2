/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.mayerp190093.PosHausuebung2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mayer
 */
public class NumberTester {

    String filename;
    Numbertest oddTester;
    Numbertest primeTester;
    Numbertest palindromeTester;

    public NumberTester(String filename) {
        this.filename = filename;
    }

    public void setOddEvenTester(Numbertest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(Numbertest primeTester) {
        this.primeTester = this.primeTester;
    }

    public void setPalindromeTester(Numbertest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {
        Numbertest oddTest = (n) -> (n % 2) == 0;
        setOddEvenTester(oddTest);

        Numbertest primeTest = (n) -> {
            boolean b = false;
            for (int i = 2; i < n; i++) {
                if (i != 1 && i != n && n % i == 0) {
                    b = false;
                } else {
                    b = true;
                }

            }
            return b;
        };
        setPrimeTester(primeTest);

        Numbertest palindromeTest = (n) -> {
            boolean b = false;
            String numbers = String.valueOf(n);
            String empty = "";
            for (int i = numbers.length(); i >= 0; i--) {
                empty = empty + numbers.charAt(i);
            }
            if (empty.equals(numbers)) {
                b = true;
            }
            return b;
        };
        setPalindromeTester(palindromeTest);

        final File file = new File(filename);
        try (final BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine();
            String line = br.readLine();
            while (line != null) {

                String[] input = line.split("\\s+");
                if (Integer.parseInt(input[0]) == 1) {
                    if (oddTester.testNumber(Integer.parseInt(input[1])) == true) {
                        System.out.println("EVEN");

                    } else {
                        System.out.println("ODD");

                    }

                } else if (Integer.parseInt(input[0]) == 2) {
                    if (primeTester.testNumber(Integer.parseInt(input[1])) == true) {
                        System.out.println("PRIME");

                    } else {
                        System.out.println("NOT PRIME");

                    }

                } else if (Integer.parseInt(input[0]) == 3) {
                    if (palindromeTester.testNumber(Integer.parseInt(input[1])) == true) {
                        System.out.println("PALINDROME");

                    } else {
                        System.out.println("NOT PALINDROM");

                    }
                }

                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
