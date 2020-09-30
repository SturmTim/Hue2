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
public class RelationalCalculator extends AbstractCalculator {

    public RelationalCalculator() {
        super(
                (x, y) -> {
                    Number loesung = new Number();
                    double a;
                    double b;
                    if (x.getB() != y.getB()) {
                        a = x.getA() * y.getB() + y.getA() * x.getB();
                        b = x.getB() * y.getB();
                    } else {
                        a = x.getA() + y.getA();
                        b = x.getB();
                    }
                    loesung.setA(a);
                    loesung.setB(b);
                    return loesung;
                },
                (x, y) -> {
                    Number loesung = new Number();
                    double a;
                    double b;
                    if (x.getB() != y.getB()) {
                        a = x.getA() * y.getB() - y.getA() * x.getB();
                        b = x.getB() * y.getB();
                    } else {
                        a = x.getA() - y.getA();
                        b = x.getB();
                    }
                    loesung.setA(a);
                    loesung.setB(b);
                    return loesung;
                },
                (x, y) -> {
                    Number loesung = new Number();
                    loesung.setA(x.getA() * y.getA());
                    loesung.setB(x.getB() * y.getB());
                    return loesung;
                },
                (x, y) -> {
                    Number loesung = new Number();
                    loesung.setA(x.getA() * y.getB());
                    loesung.setB(x.getB() * y.getA());
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
