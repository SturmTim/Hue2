/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos3.tsturm18;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tsturm18
 */
public class PrimeTesting {

    List<Integer> isprime = new ArrayList<>();
    List<Integer> notprime = new ArrayList<>();

    public PrimeTesting() {
    }

    public boolean isPrime(int number) {
        notprime.add(1);
        for (int i = 2; i <= number; i++) {
            if (!notprime.contains(i) == false) {
                notprime.add(i);
            } else {
                isprime.add(i);
                for (int j = i * i; j <= number; j = j + i) {
                    notprime.add(j);
                }
            }
        }
        return isprime.contains(number);
    }
}
