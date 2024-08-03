package riwi.filtro.persistence.Imodel;

import riwi.filtro.entitie.CoderEntity;
import riwi.filtro.persistence.CRUD.*;

public interface IModelCoder extends Read<String,CoderEntity>, ReadAll<CoderEntity>, Update<CoderEntity>, Delete<String>, Create<CoderEntity> {
}
