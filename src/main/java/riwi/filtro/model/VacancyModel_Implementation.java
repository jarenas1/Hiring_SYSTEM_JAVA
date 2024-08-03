package riwi.filtro.model;

import riwi.filtro.entitie.VacancyEntity;
import riwi.filtro.persistence.Imodel.IModelVacancy;

import java.util.List;

public class VacancyModel_Implementation implements IModelVacancy {
    @Override
    public boolean create(VacancyEntity objeto) {
        return false;
    }

    @Override
    public boolean delete(String identidicador) {
        return false;
    }

    @Override
    public List<VacancyEntity> read(String dato) {
        return null;
    }

    @Override
    public List<VacancyEntity> readAll() {
        return null;
    }

    @Override
    public boolean update(VacancyEntity objeto) {
        return false;
    }
}
