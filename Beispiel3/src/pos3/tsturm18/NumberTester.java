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
            setOddEvenTester( (i) -> (i%2) == 1 );
            
            do
            {
                zeile=br.readLine();
                String[] s = zeile.split(" ");
                if(s.length==2){
                    switch (Integer.parseInt(s[0])){
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
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
