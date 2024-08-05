package riwi.filtro.entitie;

public class VacancyEntity {

    private int id;
    private String title;
    private String status;
    private int id_Company;
    private String description;
    private String technology;


    public VacancyEntity() {
    }

    public VacancyEntity(String description, int id, int id_Company, String status, String technology, String title) {
        this.description = description;
        this.id = id;
        this.id_Company = id_Company;
        this.status = status;
        this.technology = technology;
        this.title = title;
    }

    public VacancyEntity(String description, int id_Company, String status, String technology, String title) {
        this.description = description;
        this.id_Company = id_Company;
        this.status = status;
        this.technology = technology;
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Company() {
        return id_Company;
    }

    public void setId_Company(int id_Company) {
        this.id_Company = id_Company;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

