/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos3.tsturm18;

/**
 *
 * @author tsturm18
 */
public class NumberTester {

    String pfad;
    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;

    public NumberTester(String pfad) {
        this.pfad = pfad;
    }
    
    public void setOddEvenTester (NumberTest oddTester){
        this.oddTester =oddTester;
    }
    
    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }
    public void setPalindromeTester(NumberTest palindromeTester){
        this.palindromeTester = palindromeTester;
    }
    public void testFile(){
        
    }
}
