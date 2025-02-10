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
public class User {
    private int user_id;
    private String user_name;
    private Date user_dob;
    private String user_gender;
    private String user_address;
    private String user_contact;
    private String user_username;
    private String user_pass;
    private String user_role;

    public User(int user_id, String user_name, Date user_dob, String user_gender, String user_address, String user_contact, String user_username, String user_pass, String user_role) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_dob = user_dob;
        this.user_gender = user_gender;
        this.user_address = user_address;
        this.user_contact = user_contact;
        this.user_username = user_username;
        this.user_pass = user_pass;
        this.user_role = user_role;
    }

    public User(String user_name, Date user_dob, String user_gender, String user_address, String user_contact, String user_username, String user_pass, String user_role) {
        this.user_name = user_name;
        this.user_dob = user_dob;
        this.user_gender = user_gender;
        this.user_address = user_address;
        this.user_contact = user_contact;
        this.user_username = user_username;
        this.user_pass = user_pass;
        this.user_role = user_role;
    }
    

    public User(String user_username, String user_pass, String user_role) {
        this.user_username = user_username;
        this.user_pass = user_pass;
        this.user_role = user_role;
    }

    public User() {
    }

   

    
    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    
        
    
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Date getUser_dob() {
        return user_dob;
    }

    public void setUser_dob(Date user_dob) {
        this.user_dob = user_dob;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getUser_contact() {
        return user_contact;
    }

    public void setUser_contact(String user_contact) {
        this.user_contact = user_contact;
    }

    public String getUser_username() {
        return user_username;
    }

    public void setUser_username(String user_username) {
        this.user_username = user_username;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }
    
    
    
}
