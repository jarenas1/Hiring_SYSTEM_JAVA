package riwi.filtro.model;

import riwi.filtro.entitie.HiringEntity;
import riwi.filtro.persistence.Imodel.IModelHiring;
import riwi.filtro.persistence.Imodel.IModelVacancy;
import riwi.filtro.persistence.connectiondb.ConnectionDB;
import riwi.filtro.tools.status1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HiringModel_Implementation implements IModelHiring{

    @Override
    public boolean create(HiringEntity objeto) {
        PreparedStatement ps;
        Connection con = ConnectionDB.conectar();
        String query = "INSERT INTO contratacion(coder_id, vacante_id, salario, estado) VALUES (?,?,?,?);";

        try {
            ps = con.prepareStatement(query);

            //AÑADIMOS LOS VALORES

            ps.setInt(1,objeto.getIdCoder());
            ps.setInt(2,objeto.getIdVacant());
            ps.setDouble(3,objeto.getSalary());
            ps.setString(4, objeto.getStatusHiring().name());

            ps.execute();
            System.out.println("contratacion creada");
            return true;
        }catch (Exception e){
            System.out.println("No se ha podido crear la contratacion  "+e.getMessage());
        }finally {
            ConnectionDB.cerrar();
        }
        return false;
    }

    @Override
    public boolean delete(Integer identidicador) {
        PreparedStatement ps;
        Connection con = ConnectionDB.conectar();
        String query = "DELETE FROM contratacion WHERE id = ?";

        try {
            ps = con.prepareStatement(query);

            ps.setInt(1,identidicador);
            ps.execute();
            System.out.println("contratacion eliminada");
        }catch (SQLException e){
            System.out.println("No se pudo eliminar la contratacion");
        }
        return false;
    }

    @Override
    public List<HiringEntity> read(Integer dato) {
        List<HiringEntity> contrataciones = new ArrayList<>();
        Connection con = ConnectionDB.conectar();
        PreparedStatement ps;
        ResultSet rs;
        String query = "Select * from contratacion WHERE id = ?";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, dato);

            rs = ps.executeQuery();

            while (rs.next()){
                //TRAEMOS EL ENUM DE MYSQL Y LO VOLVEMOS A ENUM DE JAVA
                String stats = rs.getString("estado");
                status1 statsString = status1.valueOf(stats);
                HiringEntity hiringEntity = new HiringEntity(statsString,rs.getInt("vacante_id"),rs.getInt("coder_id"),rs.getDouble("salario"),rs.getString("fecha_aplicacion"));
                contrataciones.add(hiringEntity);
            }

        }catch (Exception e){
            System.out.println("No se pudieron traer las contrataciones  "+e.getMessage());
        }
        return contrataciones;
    }

    @Override
    public List<HiringEntity> readAll() {
        return null;
    }

    @Override
    public boolean update(HiringEntity objeto) {
        return false;
    }
}
