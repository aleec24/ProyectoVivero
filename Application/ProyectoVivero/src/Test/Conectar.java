package Test;
 
import static Test.Test01.cn;
import static Test.Test01.rs;
import static Test.Test01.s;
import java.sql.Connection;
import java.sql.DriverManager;

 
public class Conectar {
      
    public Connection getConexion(){
       
       try {
      
            //Para conectarnos a nuestra base de datos
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            // Establecemos los valores de cadena de conexión, usuario y contraseña
            cn = DriverManager.getConnection(url, "Manager", "1234");
            //Para ejecutar la consulta
            s = cn.createStatement();
            //Ejecutamos la consulta y los datos lo almacenamos en un ResultSet
             rs = s.executeQuery("select * from Cliente");
        
            rs.close();
            cn.close();
       } catch (Exception ex) {
        ex.printStackTrace();
       }
        return cn;
    }
}