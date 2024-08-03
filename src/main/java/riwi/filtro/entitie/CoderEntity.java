package riwi.filtro.entitie;

public class CoderEntity {

    private int id;

    private String name;

    private String lastName;

    private int cohrte;

    private String cv;

    private String document;

    private String technology;

    private String clan;

    //CONSTRUCTORS


    public CoderEntity() {
    }

    public CoderEntity(int id, String name, String lastName, int cohrte, String cv, String document, String technology, String clan) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.cohrte = cohrte;
        this.cv = cv;
        this.document = document;
        this.technology = technology;
        this.clan = clan;
    }

    public CoderEntity(String name, String lastName, int cohrte, String cv, String document, String technology, String clan) {
        this.name = name;
        this.lastName = lastName;
        this.cohrte = cohrte;
        this.cv = cv;
        this.document = document;
        this.technology = technology;
        this.clan = clan;
    }

    //getters-setters


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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCohrte() {
        return cohrte;
    }

    public void setCohrte(int cohrte) {
        this.cohrte = cohrte;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }
}
