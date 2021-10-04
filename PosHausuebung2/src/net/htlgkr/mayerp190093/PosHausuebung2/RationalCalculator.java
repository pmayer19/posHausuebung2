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
public class RationalCalculator extends AbstractCalculator {

    @Override
    public Number add(Number a, Number b) {
        Number c = new Number();
        add = (x, y) -> {
            double neuZaehler = a.getA() * b.getB() + b.getA() * a.getB();
            double neuNenner = a.getB() * b.getB();
            c.setA(neuZaehler);
            c.setB(neuNenner);
            return c;
        };
        return c;
    }

    @Override
    public Number subtract(Number a, Number b) {
        Number c = new Number();
        subtract = (x, y) -> {
            double neuZaehler = a.getA() * b.getB() - b.getA() * a.getB();
            double neuNenner = a.getB() * b.getB();
            c.setA(neuZaehler);
            c.setB(neuNenner);
            return c;
        };
        return c;
    }

    @Override
    public Number multiply(Number a, Number b) {
        Number c = new Number();
        subtract = (x, y) -> {
            double neuZaehler = a.getA() * b.getA();
            double neuNenner = a.getB() * b.getB();
            c.setA(neuZaehler);
            c.setB(neuNenner);
            return c;
        };
        return c;
    }

    @Override
    public Number divide(Number a, Number b) {
        Number c = new Number();
        subtract = (x, y) -> {
            double neuZaehler = a.getA() * b.getB();
            double neuNenner = a.getB() * b.getA();
            c.setA(neuZaehler);
            c.setB(neuNenner);
            return c;
        };
        return c;
    }

}
