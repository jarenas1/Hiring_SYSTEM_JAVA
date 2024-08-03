package riwi.filtro.entitie;

public class CompanyEntity {

    private int id;
    private String name;
    private String ubication;

    public CompanyEntity() {
    }

    public CompanyEntity(int id, String name, String ubication) {
        this.id = id;
        this.name = name;
        this.ubication = ubication;
    }

    public CompanyEntity(String name, String ubication) {
        this.name = name;
        this.ubication = ubication;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }
}
