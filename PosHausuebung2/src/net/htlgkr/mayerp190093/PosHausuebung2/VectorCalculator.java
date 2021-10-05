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
public class VectorCalculator extends AbstractCalculator {

    public VectorCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, subtract, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        Number c = new Number();
        add = (x, y) -> {
            double aa = a.getA() + b.getA();
            double bb = a.getB() + b.getB();
            c.setA(aa);
            c.setB(bb);
            return c;
        };
        return c;
    }

    @Override
    public Number subtract(Number a, Number b) {
        Number c = new Number();
        subtract = (x, y) -> {
            double aa = a.getA() - b.getA();
            double bb = a.getB() - a.getB();
            c.setA(aa);
            c.setB(bb);
            return c;
        };
        return c;
    }

    @Override
    public Number multiply(Number a, Number b) {
        Number c = new Number();
        multiply = (x, y) -> {
            double aa = a.getA() * b.getA();
            double bb = a.getB() * a.getB();
            c.setA(aa);
            c.setB(bb);
            return c;
        };
        return c;
    }

    @Override
    public Number divide(Number a, Number b) {
        Number c = new Number();
        divide = (x, y) -> {
            double neuZaehler = a.getA() * b.getB();
            double neuNenner = a.getB() * b.getA();
            c.setA(neuZaehler);
            c.setB(neuNenner);
            return c;
        };
        return c;
    }

}
