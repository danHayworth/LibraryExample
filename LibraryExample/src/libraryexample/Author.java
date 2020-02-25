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
public class Author {
    
    private String name;
    private String year_born;
    
    public Author (String name, String year_born){
        this.name = name;
        this.year_born = year_born;
    }
    @Override
    public String toString(){
        return "Author Details:\nName: " + name + "\nBirth Year: " + year_born; 
    }
    
}
