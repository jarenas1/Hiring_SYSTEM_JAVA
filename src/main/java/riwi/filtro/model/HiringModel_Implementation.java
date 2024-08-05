package riwi.filtro.model;

import riwi.filtro.entitie.HiringEntity;
import riwi.filtro.persistence.Imodel.IModelHiring;
import riwi.filtro.persistence.Imodel.IModelVacancy;
import riwi.filtro.persistence.connectiondb.ConnectionDB;
import riwi.filtro.tools.status1;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
            ps.setString(4, status1.ACTIVO.name());

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
        String query = 
        return false;
    }

    @Override
    public List<HiringEntity> read(String dato) {
        return null;
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
