package main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bean.*;
import database.*;

public class UtentiDAO
{
Connection currentCon = null;
ResultSet rs = null;

public void registration(Utenti bean, ConnectionManager conn) throws SQLException{
    String cognome=bean.getCognome();
    String nome=bean.getNome();
    String username=bean.getUsername();
    String password=bean.getPassword();
    String tel = bean.getTelefono();
    String insert = "INSERT INTO "
                    +"UTENTI(cognome,nome,username,password,tipo_utente,telefono) "
                    +"VALUES('"+cognome+"','"+nome+"','"+username+"','"+password+"','guest','"+tel+"')";
    System.out.println("Query: "+insert);
    currentCon=conn.getConnection();
    Statement stmt = null;
    try{
        stmt=currentCon.createStatement();
        stmt.executeUpdate(insert); //per fare una insert 
    }catch(SQLException err){
        System.out.println("Eccezione: "+err);
    }
    
    stmt.close();
    currentCon.close();
}

    public void delete(String username, ConnectionManager conn) throws SQLException{
        String del = "DELETE FROM utenti where username='"+username+"'";
        currentCon=conn.getConnection();
        Statement stmt = null;
        try{
            stmt=currentCon.createStatement();
            stmt.executeUpdate(del);
        }
        catch(SQLException err){
            System.out.println("Eccezione: "+err);
        }
        stmt.close();
        currentCon.close();
    }

}