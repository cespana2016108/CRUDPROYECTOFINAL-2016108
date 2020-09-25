package configuration;

import java.sql.Connection;
import java.sql.DriverManager;

// Implementacion de Archivos de Configuracion
    public class Conexion {
        Connection conexion;

        public Conexion(){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBProyecto2020?useSSL=false","root","root");
            }catch(Exception e){
                e.printStackTrace();
                System.out.println("La conexión no se pudo establecer" + e);
            }
        }

    public Connection getConnection(){
        return conexion;
    }
}
