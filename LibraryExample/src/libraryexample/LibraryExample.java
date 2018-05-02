/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryexample;

import java.util.ArrayList;

/**
 *
 * @author CPP_Curriculum
 */
public class LibraryExample {
    
    private static ArrayList objectList = new ArrayList();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    }
    
    public static void printList(ArrayList list){
        for (Object o: list){
            System.out.println(o + "\n");
        }
    }
    
}
