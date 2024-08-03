package riwi.filtro.persistence.Imodel;

import riwi.filtro.entitie.HiringEntity;
import riwi.filtro.entitie.VacancyEntity;
import riwi.filtro.persistence.CRUD.*;

public interface IModelVacabt extends Create<VacancyEntity>, ReadAll<VacancyEntity>, Read<String,VacancyEntity>, Update<VacancyEntity>, Delete<String> {
}
