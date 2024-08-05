package riwi.filtro.entitie;

public class HiringEntity {

    private int id;
    private Enum statusHiring;
    private int idVacant;
    private int idCoder;
    private double salary;
    private String date;

    public HiringEntity() {
    }

    public HiringEntity(int id, Enum statusHiring, int idVacant, int idCoder, double salary, String date) {
        this.id = id;
        this.statusHiring = statusHiring;
        this.idVacant = idVacant;
        this.idCoder = idCoder;
        this.salary = salary;
        this.date = date;
    }

    public HiringEntity(Enum statusHiring, int idVacant, int idCoder, double salary, String date) {
        this.statusHiring = statusHiring;
        this.idVacant = idVacant;
        this.idCoder = idCoder;
        this.salary = salary;
        this.date = date;
    }

    public HiringEntity(int idCoder, int idVacant, double salary, Enum statusHiring) {
        this.idCoder = idCoder;
        this.idVacant = idVacant;
        this.salary = salary;
        this.statusHiring = statusHiring;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Enum getStatusHiring() {
        return statusHiring;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
