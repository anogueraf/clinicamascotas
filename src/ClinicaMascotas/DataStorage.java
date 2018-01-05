package ClinicaMascotas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataStorage {

    private List<Mascotas> mascotas;

    public DataStorage() {
        this.mascotas = new ArrayList<>();

    }

    public List<Mascotas> getMascotas() {
        return mascotas;

    }

    public void addMascotas(Mascotas p) {
        Connection con = null;
        PreparedStatement st = null;
        try {

            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:Mascotas.sqlite");

            st = con.prepareStatement("INSERT INTO Mascotas (nombrePropietario,"
                    + "nombreMascota,numeroChip,sexo,edad,especie,raza,dolencia,observaciones) VALUES (?,?,?,?,?,?,?,?,?)");
            st.setString(1, p.getNombrePropietario());
            st.setString(2, p.getNombreMascota());
            st.setInt(3, p.getNumeroChip());
            st.setInt(4, p.getSexo() == Sexo.Macho ? 0 : 1); 
            st.setInt(5, p.getEdad());
            st.setString(6, p.getEspecie());
            st.setString(7, p.getRaza());
            st.setString(8, p.getDolencia());
            st.setString(9, p.getObservaciones());
            
            st.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataStorage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataStorage.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                st.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataStorage.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void updateMascotas(Mascotas p) {

        Connection con = null;
        PreparedStatement st = null;
        try {

            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:Mascotas.sqlite");

            st = con.prepareStatement("UPDATE Mascotas SET nombrePropietario=?,nombreMascota=?,"
                    + "numeroChip=?,sexo=?,edad=?,especie=?,raza=?,dolencia=?,observaciones=? WHERE id=?");
            
            st.setString(1, p.getNombrePropietario());
            st.setString(2, p.getNombreMascota());
            st.setInt(3, p.getNumeroChip());
            st.setInt(4, p.getSexo() == Sexo.Macho ? 0 : 1); 
            st.setInt(5, p.getEdad());
            st.setString(6, p.getEspecie());
            st.setString(7, p.getRaza());
            st.setString(8, p.getDolencia());
            st.setString(9, p.getObservaciones());
            st.setInt(10, p.getId());
            st.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataStorage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataStorage.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                st.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataStorage.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void deleteMascotas(Mascotas p) {

        Connection con = null;
        PreparedStatement st = null;
        try {

            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:Mascotas.sqlite");

            st = con.prepareStatement("DELETE FROM  Mascotas WHERE id=?");
            st.setInt(1, p.getId());
            st.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataStorage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataStorage.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                st.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataStorage.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void readMascotas() {
        Connection con = null;
        PreparedStatement st = null;
        try {

            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:Mascotas.sqlite");

            st = con.prepareStatement("SELECT * FROM Mascotas");
            ResultSet rs = st.executeQuery();
            this.mascotas.clear();
            while (rs.next()) {

                Sexo s;
                if (rs.getInt("sexo") == 0) {
                    s = Sexo.Macho;

                } else {
                    s = Sexo.Hembra;
                }

                Mascotas p = new Mascotas (rs.getInt("id"),rs.getString("nombrePropietario")
                        ,rs.getString("nombreMascota"),rs.getInt("numeroChip"),s,rs.getInt("edad")
                        ,rs.getString("especie"),rs.getString("raza"),rs.getString("dolencia")
                        ,rs.getString("observaciones"));
                        
                this.mascotas.add(p);

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataStorage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataStorage.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                st.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataStorage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
