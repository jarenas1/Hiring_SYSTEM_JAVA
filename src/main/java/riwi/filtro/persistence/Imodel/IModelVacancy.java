package riwi.filtro.persistence.Imodel;

import riwi.filtro.entitie.VacancyEntity;
import riwi.filtro.persistence.CRUD.*;

public interface IModelVacancy extends Create<VacancyEntity>, ReadAll<VacancyEntity>, Read<String,VacancyEntity>, Update<VacancyEntity>, Delete<String> {
}
