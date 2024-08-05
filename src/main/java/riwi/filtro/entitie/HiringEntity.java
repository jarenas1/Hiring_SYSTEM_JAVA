package riwi.filtro.entitie;

public class HiringEntity {

    private int id;
    private String statusHiring;
    private int idVacant;
    private int idCoder;
    private double salary;

    public HiringEntity() {
    }

    public HiringEntity(int id, String statusHiring, int idVacant, int idCoder, double salary) {
        this.id = id;
        this.statusHiring = statusHiring;
        this.idVacant = idVacant;
        this.idCoder = idCoder;
        this.salary = salary;
    }

    public HiringEntity(String statusHiring, int idVacant, int idCoder, double salary) {
        this.statusHiring = statusHiring;
        this.idVacant = idVacant;
        this.idCoder = idCoder;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatusHiring() {
        return statusHiring;
    }

    public void setStatusHiring(String statusHiring) {
        this.statusHiring = statusHiring;
    }

    public int getIdVacant() {
        return idVacant;
    }

    public void setIdVacant(int idVacant) {
        this.idVacant = idVacant;
    }

    public int getIdCoder() {
        return idCoder;
    }

    public void setIdCoder(int idCoder) {
        this.idCoder = idCoder;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
