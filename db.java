
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shaon
 */
public class db {
        private Connection con;
        private Statement st;
        private ResultSet rs;
        public void con(){
            try{
                Class.forName("com.mysql.jbdc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/conn?zeroDateTimeBehavior=convertToNull","root"," ");
                st=con.createStatement();
                JOptionPane.showMessageDialog(null,"Connected");
                
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex+"Error");
            }
        }
        
    public static void main(String[] args) {
        db d =new db();
        d.con();
    
    }
}
