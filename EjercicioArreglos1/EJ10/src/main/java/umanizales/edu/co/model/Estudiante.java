package umanizales.edu.co.model;

public class Estudiante {
    private String cedula;
    private int sexo; // 1 - Masculino, 2 - Femenino
    private int trabaja; // 1 - Si trabaja, 2 - No trabaja
    private int sueldo;

    public Estudiante(String cedula, int sexo, int trabaja, int sueldo) {
        this.cedula = cedula;
        this.sexo = sexo;
        this.trabaja = trabaja;
        this.sueldo = sueldo;
    }

    // Getters y Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(int trabaja) {
        this.trabaja = trabaja;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
