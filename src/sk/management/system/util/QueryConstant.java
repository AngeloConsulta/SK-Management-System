/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sk.management.system.util;

/**
 *
 * @author Administrator
 */
public interface QueryConstant  {
    //user 
    //Transacion
     String TRANS_ADD = "INSERT INTO tbltrans (trans_type, trans_description, trans_amount)VALUES(?,?,?) "; // CREATE TRANSACTION
     String TRANS_UPDATE = "UPDATE tbltrans SET trans_type = ?, trans_description = ?, trans_amount = ? WHERE trans_id = ?";//TRANSACTION UPDATE
     String TRANS_ARCHIVE = "UPDATE tbltrans SET archive = 1 WHERE trans_id = ?"; //ARCHIVING TRANSACTION DATA
     String TRANS_VIEWACTIVE = "SELECT * FROM tbltrans WHERE archive = 0";
}
