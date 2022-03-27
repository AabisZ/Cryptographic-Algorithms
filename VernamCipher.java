/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vernamcipher;

/**
 *
 * @author Aabis - PC
 */
public class VernamCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int k[]={6,5,1,4,3,2,1,11,4,11,4,9,8,5};
        encryption(k,"hello world");
        decryption(k,"njmpr\"xzvwh"); 
        
        
    }
     static void encryption(int k[], String pt){
        
        
        //int key = k;
        String plain_text = pt;
        char[] myList = new char[plain_text.length()];
        
        for (int i=0;i<plain_text.length();i++){
        
        char ch = plain_text.charAt(i);
        int ascii = ch;
        //System.out.println(ascii);
        
        int e=ascii + k[i];
        //int e= (x)%26;
        
        //System.out.println(e);
        
        char c=(char)e;
        
        
        myList[i] = c;
            
    }
        System.out.println();
        for (int j=0;j<plain_text.length();j++){
            System.out.print(myList[j]);
            //System.out.println(k[j]);
        }
        
    }
    
    static void decryption(int k[],String ct){
        //int key = k;
        String cipher_text = ct;
        char[] myList = new char[cipher_text.length()];
        
        for (int i=0;i<cipher_text.length();i++){
        
        char ch = cipher_text.charAt(i);
        int ascii = ch;
        //System.out.println(ascii);
        
        int e= ascii - k[i];
        
        
        char c=(char)e;
        
        
        myList[i] = c;
            
    }
        System.out.println();
        for (int j=0;j<cipher_text.length();j++){
            System.out.print(myList[j]);
        }
    }
}
