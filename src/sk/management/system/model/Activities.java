/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sk.management.system.model;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Activities {
    private int id;
    private String name;
    private double funds;
    private Date date;
    private String task;

    public Activities(int id, String name, double funds, Date date, String task) {
        this.id = id;
        this.name = name;
        this.funds = funds;
        this.date = date;
        this.task = task;
    }

    public Activities(String name, double funds, Date date, String task) {
        this.name = name;
        this.funds = funds;
        this.date = date;
        this.task = task;
    }

    public Activities() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
    
}
