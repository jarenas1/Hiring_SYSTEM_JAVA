package riwi.filtro.model;

import riwi.filtro.entitie.CoderEntity;
import riwi.filtro.persistence.Imodel.IModelCoder;

import java.util.List;

public class CoderModel_Implementation implements IModelCoder {
    @Override
    public boolean create(CoderEntity objeto) {
        return false;
    }

    @Override
    public boolean delete(String identidicador) {
        return false;
    }

    @Override
    public List<CoderEntity> read(String dato) {
        return null;
    }

    @Override
    public List<CoderEntity> readAll() {
        return null;
    }

    @Override
    public boolean update(CoderEntity objeto) {
        return false;
    }
}
