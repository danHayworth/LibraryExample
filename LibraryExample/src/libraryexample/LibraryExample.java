/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryexample;

import java.util.ArrayList;
import java.util.List;

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
       
       Author author1 = new Author("Peter Gossage", "1956");
       Author author2 = new Author("George Washington", "1922");
       Author author3 = new Author("Dan Zephir", "1945");
       Book book1 = new Book("0143309293", "Maui and Other Maori Legends: 8 Classic Tales of Aotearoa", "Peter Gossage", "2016");
       Book book2 = new Book("0143309294", "All about what's new", "George washington", "2013");
       Book book3 = new Book("0143309295", "The third book of Eli", "Dan Zephir", "2011");
       objectList.add(author1);
       objectList.add(book1);
       objectList.add(author2);
       objectList.add(book2);
       objectList.add(author3);
       objectList.add(book3);
       //Extra Task 1
       Book book4 = new Book("The colour of magic", "Terry Pratchet", "1983");
       Book book5 = new Book("The light Fantastic", "Terry Pratchet", "1986");
       objectList.add(book4);
       objectList.add(book5);
       
       printList(objectList);
    }
    
    public static void printList(ArrayList list){
        for (Object o: list){
            System.out.println(o + "\n");
        }
    }
    
}
