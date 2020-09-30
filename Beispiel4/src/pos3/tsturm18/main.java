/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos3.tsturm18;

import java.util.Scanner;

/**
 *
 * @author timst
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public String rechnermenue = "Choose calculator:\n"
            + "1 - Relational calculator\n"
            + "2 - Vector calculator\n"
            + "3 - Complex calculator\n"
            + "4 - Exit program\n"
            + "> ";
    public String rechenart = "Choose operation:\n"
            + "1 - add\n"
            + "2 - subtract\n"
            + "3 - multiply\n"
            + "4 - divide\n"
            + "5 - enter numbers again\n"
            + "> ";

    public AbstractCalculator rechner;
    public Number x = new Number();
    public Number y = new Number();

    public static void main(String[] args) {
        main calculator = new main();
        while (true) {
            calculator.rechnerAuswählen();
        }
    }

    public void rechnerAuswählen() {
        System.out.print(rechnermenue);
        int auswahl = 0;
        Scanner scanner = new Scanner(System.in, "Windows-1252");
        auswahl = Integer.parseInt(scanner.nextLine());

        switch (auswahl) {
            case 1:
                rechner = new RelationalCalculator();
                setNumbers();
                break;
            case 2:
                rechner = new VectorCalculator();
                setNumbers();
                break;
            case 3:
                rechner = new ComplexCalculator();
                setNumbers();
                break;
            case 4:
                System.exit(0);
            default:
                break;
        }
    }

    public void setNumbers() {
        Scanner scanner = new Scanner(System.in, "Windows-1252");
        System.out.println("Enter number x a>");
        x.setA(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter number x b>");
        x.setB(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter number y a>");
        y.setA(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter number y b>");
        y.setB(Double.parseDouble(scanner.nextLine()));
        RechenartAuswahl();
    }

    public void RechenartAuswahl() {
        System.out.print(rechenart);
        int auswahl = 0;
        Scanner scanner = new Scanner(System.in, "Windows-1252");
        auswahl = Integer.parseInt(scanner.nextLine());

        switch (auswahl) {
            case 1:
                printLoesung(rechner.add(x, y));
                break;
            case 2:
                printLoesung(rechner.subtract(x, y));
                break;
            case 3:
                printLoesung(rechner.multiply(x, y));
                break;
            case 4:
                printLoesung(rechner.divide(x, y));
                break;
            case 5:
                setNumbers();
                break;
            default:
                break;
        }
    }

    private static void printLoesung(Number loesung) {
        System.out.println("-----------------\n"
                + "Solution:\n"
                + "a = " + loesung.getA() + "\n"
                + "b = " + loesung.getB() + "\n"
                + "-----------------");
    }

}
