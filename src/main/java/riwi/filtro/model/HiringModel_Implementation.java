package riwi.filtro.model;

import riwi.filtro.entitie.HiringEntity;
import riwi.filtro.persistence.Imodel.IModelHiring;
import riwi.filtro.persistence.Imodel.IModelVacancy;

import java.util.List;

public class HiringModel_Implementation implements IModelHiring{

    @Override
    public boolean create(HiringEntity objeto) {
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
