/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos3.tsturm18;

/**
 *
 * @author timst
 */
public class ComplexCalculator extends AbstractCalculator {

    public ComplexCalculator() {
        super(
                (x, y) -> {
                    Number loesung = new Number();
                    loesung.setA(x.getA() + y.getA());
                    loesung.setB(x.getB() + y.getB());
                    return loesung;
                },
                (x, y) -> {
                    Number loesung = new Number();
                    loesung.setA(x.getA() - y.getA());
                    loesung.setB(x.getB() - y.getB());
                    return loesung;
                },
                (x, y) -> {
                    Number loesung = new Number();
                    loesung.setA(x.getA() * y.getA() + x.getB() * y.getB());
                    loesung.setB(x.getA() * y.getB() + x.getB() * y.getA());
                    return loesung;
                },
                (x, y) -> {
                    Number loesung = new Number();
                    double dividieren = Math.pow(y.getA(), 2) + Math.pow(y.getB(), 2);
                    loesung.setA((x.getA() * y.getA() + x.getB() * y.getB()) / dividieren);
                    loesung.setB((x.getB() * y.getA() - x.getA() * y.getB()) / dividieren);
                    return loesung;
                });
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
