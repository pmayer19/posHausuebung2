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
        return add.calc(a, b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        return subtract.calc(a, b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return multiply.calc(a, b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return divide.calc(a, b);
    }

}
