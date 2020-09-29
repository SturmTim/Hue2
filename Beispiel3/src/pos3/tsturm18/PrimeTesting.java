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
    
    
    public boolean isPrime(int p) {
        notprime.add(1);
        for (int i = 2; i <= p; i++) {
            if (isPrime(i) == false) {
                notprime.add(i);
            } else {
                isprime.add(i);
                for (int j = i * i; j <= p; j = j + i) {
                    notprime.add(j);
                }
            }
        }
        return !notprime.contains(p);
    }
}
