/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po3.tsturm18;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tsturm18
 */
public class HalloJavamitForEach {
    
    List<String> l ;

    public HalloJavamitForEach() {
        l=new ArrayList<>();
        l.add("seas");
        l.add("seas2");
        l.add("seas3");
    }
    
    public void print(){
        for (String string : l) {
            System.out.println(string);
        }
    }
    
    
    
}
    
    

