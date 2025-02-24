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
public class Youth {
    private int youth_id;
    private String youth_name;
    private String youth_gender;
    private int youth_age;
    private Date youth_dob;
    private String youth_address;

    public Youth(int youth_id, String youth_name, String youth_gender, int youth_age, Date youth_dob, String youth_address) {
        this.youth_id = youth_id;
        this.youth_name = youth_name;
        this.youth_gender = youth_gender;
        this.youth_age = youth_age;
        this.youth_dob = youth_dob;
        this.youth_address = youth_address;
    }

    public Youth(String youth_name, String youth_gender, int youth_age, Date youth_dob, String youth_address) {
        this.youth_name = youth_name;
        this.youth_gender = youth_gender;
        this.youth_age = youth_age;
        this.youth_dob = youth_dob;
        this.youth_address = youth_address;
    }

    public Youth() {
    }

    public int getYouth_id() {
        return youth_id;
    }

    public void setYouth_id(int youth_id) {
        this.youth_id = youth_id;
    }

    public String getYouth_name() {
        return youth_name;
    }

    public void setYouth_name(String youth_name) {
        this.youth_name = youth_name;
    }

    public String getYouth_gender() {
        return youth_gender;
    }

    public void setYouth_gender(String youth_gender) {
        this.youth_gender = youth_gender;
    }

    public int getYouth_age() {
        return youth_age;
    }

    public void setYouth_age(int youth_age) {
        this.youth_age = youth_age;
    }

    public Date getYouth_dob() {
        return youth_dob;
    }

    public void setYouth_dob(Date youth_dob) {
        this.youth_dob = youth_dob;
    }

    public String getYouth_address() {
        return youth_address;
    }

    public void setYouth_address(String youth_address) {
        this.youth_address = youth_address;
    }
    
    
}
