/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.mayerp190093.PosHausuebung2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author mayer
 */
public class NumberTester {

    String filename;
    Numbertest oddTester;
    Numbertest primeTester;
    Numbertest palindromeTester;

    public static void main(String[] args) {
        NumberTester nu = new NumberTester("number.txt");
        Numbertest oddTest = (n) -> (n % 2) == 0;
        nu.setOddEvenTester(oddTest);

        Numbertest primeTest = (n) -> {
            boolean b = true;
            for (int i = 2; i < n; i++) {
                if (i % n == 0) {
                    b = false;
                }
            }
            return b;
        };
        nu.setPrimeTester(primeTest);
        Numbertest palindromeTest = (n) -> {
            boolean b = false;
            String numbers = String.valueOf(n);
            String empty = "";
            for (int i = numbers.length(); i >= 0; i--) {
                empty += numbers.charAt(i);
            }
            if (empty.equals(numbers)) {
                b = true;
            }
            return b;
        };
        nu.setPalindromeTester(palindromeTest);
    }

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
        BufferedReader br = new BufferedReader();
    }

}
