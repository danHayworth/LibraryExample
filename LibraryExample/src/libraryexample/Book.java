/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryexample;

/**
 *
 * @author CPP_Curriculum
 */
public class Book {
    
    private String ISBN;
    private String book_title;
    private String author;
    private String publish_year;
    
    public Book (String ISBN, String book_title, String author, String publish_year) {
        this.ISBN = ISBN;
        this.book_title = book_title;
        this.author = author;
        this.publish_year = publish_year;
    }
    public Book (String book_title, String author, String publish_year){
        this.ISBN = "1234567892";
        this.book_title = book_title;
        this.author = author;
        this.publish_year = publish_year;
    }
    
    //Extra Task 2
    @Override
    public String toString(){
        return "Book Information:\n" + book_title + 
                " by " + author; 
    }
}
