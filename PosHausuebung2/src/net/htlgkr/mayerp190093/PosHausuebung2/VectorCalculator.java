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

    @Override
    public Number add(Number a, Number b) {
        Number c = new Number();
        add = (x, y) -> {
            double aa = a.getA() + b.getA();
            double bb = a.getB() + a.getB();
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
        divide = (x, y) -> {
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

    }

}
