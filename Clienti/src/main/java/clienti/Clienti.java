/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienti;

/**
 *
 * @author luqmanasghar
 */
public class Clienti {
    public static void main(String args[]) throws Exception{
    
        String path = "/Users/luqmanasghar/Desktop/text file";
        Parser parser = new Parser();
        parser.readFromFile(path);
    }
}
