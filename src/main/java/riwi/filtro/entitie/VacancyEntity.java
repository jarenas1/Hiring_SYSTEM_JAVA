package riwi.filtro.entitie;

public class VacancyEntity {

    private int id;
    private String title;
    private String status;
    private int idCompany;

    public VacancyEntity() {
    }

    public VacancyEntity(int id, String title, String status, int idCompany) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.idCompany = idCompany;
    }

    public VacancyEntity(String title, String status, int idCompany) {
        this.title = title;
        this.status = status;
        this.idCompany = idCompany;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }
}
