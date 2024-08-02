package riwi.filtro.persistence.Imodel;

import riwi.filtro.persistence.CRUD.Delete;
import riwi.filtro.persistence.CRUD.Read;
import riwi.filtro.persistence.CRUD.ReadAll;
import riwi.filtro.persistence.CRUD.Update;

public interface IModelCoder extends Read<>, ReadAll<>, Update<>, Delete<>, {
}
