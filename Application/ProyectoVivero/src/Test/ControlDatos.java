/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author Ale
 */
public class ControlDatos {
  private Conectar conectar;
    private ModeloDatos modelo;
    private Connection con;
     
    public ControlDatos(){
        conectar = new Conectar();
        modelo = new ModeloDatos();
    }

public void insertar(int id, String nombre, String primerapellido, String cedula, String telefono, String correo){
      PreparedStatement ps;
        String sql;
        modelo.setId(id);
        modelo.setNombre(nombre);
        modelo.setPrimerapellido(primerapellido);
        modelo.setCedula(cedula);
        modelo.setTelefono(telefono);
        modelo.setCorreo(correo);
        try{
            con = conectar.getConexion();
            sql = "INSERT INTO \"MANAGER\".\"CLIENTE\" (IDCLIENTE, NOMBRE, PRIMERAPELLIDO, CEDULA, TELEFONO, CORREOELECTRONICO) values(?,?,?,?,?,?)";
             
           
            ps = con.prepareStatement(sql);
            ps.setInt(1, modelo.getId());
            ps.setString(2, modelo.getNombre());
            ps.setString(3, modelo.getPrimerapellido());
            ps.setString(4, modelo.getCedula());
            ps.setString(5, modelo.getTelefono());
            ps.setString(6, modelo.getCorreo());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
}


}
