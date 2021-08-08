package modelo;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Comuna;

public class ComunaDAO { // inico clase ComunaDAO

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Comuna c = new Comuna();

    // creacion metodo listar
    public List listar() {// inicio listar

        List<Comuna> datos = new ArrayList<>();
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement("select * from comuna");
            rs = ps.executeQuery();
            while (rs.next()) {// inicio while
                Comuna c = new Comuna();
                c.setCOM_ID(rs.getInt(1));
                c.setCOM_NOMBRE(rs.getString(2));
                c.setCOM_ESTADO(true);
                datos.add(c);
            }// fin while

        } catch (Exception e) {
        }

        return datos;

    }// fin listar

    // creacion metodo agregar
    public int Guardar (Comuna cc) {// inicio clase Guardar
        int r = 0;
        String sql = "insert into comuna (COM_ID,COM_NOMBRE,COM_ESTADO) values (?,?,?))";

        try {
            conectar = (Conexion) conectar.getConnection();
            ps = con.prepareStatement(sql);
            // ps.setString(1, cc.getCOM_ID());
            ps.setString(2, cc.getCOM_NOMBRE());
            // ps.setString(3, cc.setCOM_ESTADO(true));
            r = ps.executeUpdate();
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
        }
        return r;

    }// fin clase Guardar

    // metodo actualizar
    public int Actualizar(Comuna cc) {//inicio actualizar
        int r = 0;
        String sql = "update comuna set COM_NOMBRE WHERE COM_ID=?";

        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cc.getCOM_NOMBRE());
            ps.setInt(1, cc.COM_ID);
            r = ps.executeUpdate();
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }

        } catch (Exception e) {

        }
        return r;
    }//fin actualizar

    public int Delete(int COM_ID) {//inicio clase delete
        int r = 0;
        String sql = "delete from comuna where COM_ID=" + COM_ID;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }

        return r;

    }//fin clase delete

}// fin  clase ComunaDAO
