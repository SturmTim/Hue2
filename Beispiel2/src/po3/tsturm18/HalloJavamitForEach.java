/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po3.tsturm18;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author tsturm18
 */
public class HalloJavamitForEach {
    
    List<String> testList ;
    
    public static void main(String[] args) {
        HalloJavamitForEach h =new HalloJavamitForEach();
        h.print();
    }

    public HalloJavamitForEach() {
        testList=new ArrayList<>();
        testList.add("seas");
        testList.add("seas2");
        testList.add("seas3");
    }
    
    public void print(){
        for (String string : testList) {
            System.out.println(string);
        }
        
        testList.forEach((string) -> {
            System.out.println(string);
        });
        
        testList.forEach(System.out::println);
        
        Consumer<String> consumer = (String s) -> System.out.println(s);
        testList.forEach(consumer);
    }
    
    
    
    
    
    
}
    
    

