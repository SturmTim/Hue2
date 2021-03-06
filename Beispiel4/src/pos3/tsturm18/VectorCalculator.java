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
public class VectorCalculator extends AbstractCalculator {

    public VectorCalculator() {
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
                    loesung.setA(x.getA() * y.getB() - y.getA() * x.getB());
                    return loesung;
                },
                (x, y) -> {
                    Number loesung = new Number();
                    loesung.setA(x.getA() * y.getA() + x.getB() * y.getB());
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
