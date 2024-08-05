package riwi.filtro.model;

import riwi.filtro.entitie.HiringEntity;
import riwi.filtro.persistence.Imodel.IModelHiring;
import riwi.filtro.persistence.Imodel.IModelVacancy;
import riwi.filtro.persistence.connectiondb.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class HiringModel_Implementation implements IModelHiring{

    @Override
    public boolean create(HiringEntity objeto) {
        PreparedStatement ps;
        Connection con = ConnectionDB.conectar();
        String query = "INSERT INTO contratacion(coder_id, vacante_id, salario, estado, fecha_aplicacion) VALUES (?,?,?,?,?);";

        return false;
    }

    @Override
    public boolean delete(Integer identidicador) {
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
