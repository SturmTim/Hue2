/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos3.tsturm18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        File file =new File(pfad);
        
        if(!file.isFile()){
            System.exit(0);
        }
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            String zeile = "";
            zeile = br.readLine();
            int zeilenZahl = Integer.parseInt(zeile);
            setOddEvenTester( number -> (number%2) == 1 );
            setPrimeTester(number -> {
            PrimeTesting primeTesting =new PrimeTesting();
            return primeTesting.isPrime(number);
            });
            setPalindromeTester(number -> {
            String original = Integer.toString(number);
            String reverseString = "";
                for (int i = original.length()-1; i >= 0; i--) {
                    reverseString+=original.charAt(i);
                }
            if(reverseString.equals(original)){
                return true;
            }else{
                return false;
            }
            });
            do
            {
                zeile=br.readLine();
                String[] s = zeile.split(" ");
                if(s.length==2){
                    switch (Integer.parseInt(s[0])){
                        case 1: if(oddTester.testNumber(Integer.parseInt(s[1]))){
                            System.out.println("ODD");
                        }else{
                            System.out.println("EVEN");
                        }
                            break;
                        case 2:if(primeTester.testNumber(Integer.parseInt(s[1]))){
                            System.out.println("PRIME");
                        }else{
                            System.out.println("NO PRIME");
                        }
                            break;
                        case 3:if(palindromeTester.testNumber(Integer.parseInt(s[1]))){
                            System.out.println("PALINDROME");
                        }else{
                            System.out.println("NO PALINDROME");
                        }
                            break;
                        default: System.out.println("Keine Akzeptierte Zahl");
                    }
                }
                else{
                    System.out.println("Nich genügend Zahlen in dieser Zeile");
                }
            }
            while (zeile != null);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
