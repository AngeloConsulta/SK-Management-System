/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sk.management.system.model;

/**
 *
 * @author Administrator
 */
public class Transaction {
    private int id;
    private String type;
    private String description;
    private double amount;


    public Transaction(int id, String type, String description, double amount) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.amount = amount;
    }

    public Transaction(String type, String description, double amount) {
        this.type = type;
        this.description = description;
        this.amount = amount;
    }

    public Transaction() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

   
    
}
