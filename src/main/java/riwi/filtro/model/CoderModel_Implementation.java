package riwi.filtro.model;

import riwi.filtro.entitie.CoderEntity;
import riwi.filtro.persistence.Imodel.IModelCoder;
import riwi.filtro.persistence.connectiondb.ConnectionDB;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CoderModel_Implementation implements IModelCoder {
    @Override
    public boolean create(CoderEntity objeto) {

        //ABRIMOS CONECCION
        Connection con = ConnectionDB.conectar();

        //CREAMOS EL PS
        PreparedStatement ps;

        //QUERY
        String query = "INSERT INTO coder (nombre,aellidos,cohrte,cv,documento,tecnologia,clan) VALUES (?,?,?,?,?,?,?);";

        //EJECUTAMOS:

        try {
            ps = con.prepareStatement(query);

            //AÑADIMOS VALORES DEL OBJETO ENTRANTE
            ps.setString(1,objeto.getName());
            ps.setString(2,objeto.getLastName());
            ps.setInt(3,objeto.getCohrte());
            ps.setString(4,objeto.getCv());
            ps.setString(5,objeto.getDocument());
            ps.setString(6,objeto.getTechnology());
            ps.setString(7,objeto.getClan());

            //EJECUTAMOS
            ps.execute();
            return true;

            /*SI DESEARAMOS DEVOLVER EL ID PARA AÑADIRLO AL OBJETO ASI COMO HACE ANTONY, DEBEMOS AÑADIR LO SIGIUIENTE AL
            * PS EN LA PRIMERA LINEA DEL TRY:
            * PreparedStatement PS = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            *
            * TABIEN INICIALMENTE DEBEMOS INICIALIZAR EL RESULSET, Y AL MOMENTO DE EJECUTAR LA QUERY CON EXECUTEQUERY()
            *
            * LUEGO CON EL NEXT, VAOS A TOMAR EL RESULSET Y CON UN IF, LE ASIGNAMOS EL ID AL OBJETO
            *
            *   if (rs.next()){
                objet.setId(result.getInt("id")); TRAEMOS EL ID Y LO ASIGNAMOS AL OBJETO QUE ENTRA
            }
            *
            * POR ULTIMO NO PODEMOS OLVIDAR HACER UN RETURN PERO DEL OBJETO, Y TAMBIEN DECIR EN EL METODO QUE VAMOS A DEVOLVER UN OBJETO*/

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo crear el coder");
        }finally {
            ConnectionDB.cerrar();
        }
        return false;
    }

    @Override
    public boolean delete(String identidicador) {
        Connection con = ConnectionDB.conectar();
        PreparedStatement ps;

        String query = "DELETE FROM coder WHERE documento = ?;";

        try {
            ps = con.prepareStatement(query);

            ps.setString(1,identidicador);
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("No se pudo eliminar el coder");
        }finally {
            ConnectionDB.cerrar();
        }
        return false;
    }

    @Override
    public List<CoderEntity> read(String dato) {
        List<CoderEntity> coders = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
        Connection con = ConnectionDB.conectar();

        String query = "SELECT * FROM coder WHERE clan = ? OR tecnologia = ?";

        try {
            ps = con.prepareStatement(query);

            ps.setString(1,dato);
            ps.setString(2,dato);

            rs = ps.executeQuery();

            while (rs.next()){
                CoderEntity coder = new CoderEntity(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellidos"), rs.getInt("cohrte"), rs.getString("cv"), rs.getString("documento"), rs.getString("tecnologia"), rs.getString("clan"));
                coders.add(coder);
            }
        }catch (Exception e){
            System.out.println("No se pudieron traer los coders de "+dato);
        }finally {
            ConnectionDB.cerrar();
        }
        return coders;
    }

    @Override
    public List<CoderEntity> readInt(Integer numero) {
    List<CoderEntity> coders = new ArrayList<>();
    PreparedStatement ps;
    ResultSet rs;
    Connection con = ConnectionDB.conectar();
    String query = "SELECT * FROM coder WHERE cohrte = ?";


    try {
        ps = con.prepareStatement(query);

        ps.setInt(1,numero);

        rs = ps.executeQuery();

        while (rs.next()){
            CoderEntity coder = new CoderEntity(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellidos"), rs.getInt("cohrte"), rs.getString("cv"), rs.getString("documento"), rs.getString("tecnologia"), rs.getString("clan"));
            coders.add(coder);
        }
    }catch (Exception e){
        System.out.println("No se pudieron treaer los coders de la cohrte "+numero);
    }finally {
        ConnectionDB.cerrar();
    }
        return coders;
    }


    @Override
    public List<CoderEntity> readAll() {
        List<CoderEntity> coders = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = ConnectionDB.conectar();
        String query = "SELECT * FROM coder";


        try {
            ps = con.prepareStatement(query);

            rs = ps.executeQuery();

            while (rs.next()){
                CoderEntity coder = new CoderEntity(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellidos"), rs.getInt("cohrte"), rs.getString("cv"), rs.getString("documento"), rs.getString("tecnologia"), rs.getString("clan"));
                coders.add(coder);
            }
        }catch (Exception e){
            System.out.println("No se pudieron treaer los coder");
        }finally {
            ConnectionDB.cerrar();
        }
        return coders;
    }

    @Override
    public boolean update(CoderEntity objeto) {
        PreparedStatement ps;
        Connection con = ConnectionDB.conectar();
        String query = "UPDATE coder SET nombre = ?, apellidos = ?, documento = ?, tecnologia = ?, clan = ?, cohrte = ?, cv = ? WHERE id = ?;";

        try {

            ps = con.prepareStatement(query);

            ps.setString(1,objeto.getName());
            ps.setString(2,objeto.getLastName());
            ps.setString(3,objeto.getDocument());
            ps.setString(4,objeto.getTechnology());
            ps.setString(5,objeto.getClan());
            ps.setInt(6,objeto.getCohrte());
            ps.setString(7, objeto.getCv());
            ps.setInt(8,objeto.getId());

            ps.execute();
            return true;

        }catch (Exception e){
            System.out.println("No se pudo actualizar el coder");
        }finally {
            ConnectionDB.cerrar();
        }
        return false;
    }
}
