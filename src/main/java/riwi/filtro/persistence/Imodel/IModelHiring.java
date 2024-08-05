package riwi.filtro.persistence.Imodel;

import riwi.filtro.entitie.HiringEntity;
import riwi.filtro.persistence.CRUD.*;

public interface IModelHiring extends Create<HiringEntity>, ReadAll<HiringEntity>, Read<Integer,HiringEntity>, Update<HiringEntity>, Delete<Integer> {
}
