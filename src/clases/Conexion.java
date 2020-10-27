package clases;

import java.sql.*;

public class Conexion {
    
    /*
        Se cambio el "gestor" de base de datos 
        de XAMPP  a MySql WORKBENCH
    */

    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ds", "root", "");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexión local\n"
                    + "error de tipo: " + e);
        }
        return null;
    }
    
}
