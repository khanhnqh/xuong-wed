/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.model;

/**
 *
 * @author PC
 */
public class Book {
    private String ID;
    private String tilte;
    private String Price;

    public Book() {
    }

    public Book(String ID, String tilte, String Price) {
        this.ID = ID;
        this.tilte = tilte;
        this.Price = Price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTilte() {
        return tilte;
    }

    public void setTilte(String tilte) {
        this.tilte = tilte;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Book{" + "ID=" + ID + ", tilte=" + tilte + ", Price=" + Price + '}';
    }
    
}
