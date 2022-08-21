package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtils {

    static Connection conn = null;
    static Statement st = null;
    static ResultSet rs = null;

    static String bd = "orcl";
    static String login = "Manager";
    static String password = "1234";
    static String url = "jdbc:oracle:thin:@localhost:1521:orcl";

    public static Connection Enlace(Connection conn) throws SQLException {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(url, login, password);
        } catch (ClassNotFoundException e) {
            System.out.print("Clase no encontrada");
        }
        return conn;
    }

    public static Statement sta(Statement st) throws SQLException {
        conn = Enlace(conn);
        st = conn.createStatement();
        return st;
    }

    public static ResultSet EnlEst(ResultSet rs) throws SQLException {
        st = sta(st);
        rs = st.executeQuery("select * from Cliente");
        return rs;
    }

}
