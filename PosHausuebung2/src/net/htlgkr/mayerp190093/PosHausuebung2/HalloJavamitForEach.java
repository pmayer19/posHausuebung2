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

        Consumer<String> consumer = (String s) -> System.out.println(s);

    }
}
