/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.mayerp190093.PosHausuebung2;

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
        oddTester = (n) -> (n % 2) == 0;

        primeTester = (n) -> {
            boolean b = true;
            for (int i = 2; i < n; i++) {
                if (i % n == 0) {
                    b = false;
                }
            }
            return b;
        };

        palindromeTester = (n) -> {
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
    }

}
