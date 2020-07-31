/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;

/**
 *
 * @author Khai
 */
public class Book {
    private int ID;
    private String Name;
    private String author;
    private double price;

    public Book() {
    }

    public Book(int ID, String Name, String author, double price) {
        this.ID = ID;
        this.Name = Name;
        this.author = author;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "ID=" + ID + ", Name=" + Name + ", author=" + author + ", price=" + price + '}';
    }
    
    
}
