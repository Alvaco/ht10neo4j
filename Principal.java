/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Ana lucia 
 */
public class Principal {
    public static void main (String[] args){
        /*try {
        Connection con = DriverManager.getConnection("jdbc:neo4j:bolt://localhost", "neo4j","neo4j1");
        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery("MATCH (n:User) RETURN n.name");
            while (rs.next()) {
                System.out.println(rs.getString("n.name"));
            }
        }
        con.close();
        
         }catch (Exception ex){
            System.out.println("AAA");
        }*/
        
        Gui miGui=new Gui();
        
        
        Conexion miCon=new Conexion();
        Paciente e1=new Paciente("Luis","cancer",21);
        Doctor e2= new Doctor("Dr.Douglas","cirujano", "30080908","Pilar", "2pm"); 
        //miCon.crearHospital(r1);
        //miCon.crearPaciente(e1);
        //miCon.crearPaciente(e2);
        //miCon.crearpacienter(e1, e2);
        //miCon.crearDoctor(e1, r1);
        //miCon.deletePaciente(e2);
        
        //miCon.Recomendar(e1);
        miCon.Recomendar(e1);
        
       
    }
}
