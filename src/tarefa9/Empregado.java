/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa9;

/**
 *
 * @author Josemolamazo
 */
public class Empregado {

    private String nome;
    private String apelidos;
    private String dni;
    private String direccion;
    private int anosAntiguedade;
    private String tlf;
    private float salario;
    private Empregado supervisor;

    public Empregado() {
    }

    public Empregado(String nome, String apelidos, String DNI, String direccion, int anosAntiguedade, String tlf, float salario, Empregado supervisor) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.dni = DNI;
        this.direccion = direccion;
        this.anosAntiguedade = anosAntiguedade;
        this.tlf = tlf;
        this.salario = salario;
        this.supervisor = supervisor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAnosAntiguedade() {
        return anosAntiguedade;
    }

    public void setAnosAntiguedade(int anosAntiguedade) {
        this.anosAntiguedade = anosAntiguedade;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Empregado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empregado supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return "DATOS EMPREGADO: \n"
                + "Nome: " + nome + "\n"
                + "Apelido: " + apelidos + "\n"
                + "DNI: " + dni + "\n"
                + "Direccion: " + direccion + "\n"
                + "Anos de antiguedade: " + anosAntiguedade + "\n"
                + "Telefono: " + tlf + "\n"
                + "Salario: " + salario + "\n"
                + "Supervisor: " + supervisor;
    }

    public String cambiarSupervisor(Empregado supervisor) {
        this.supervisor = supervisor;
        return "Cambio efectuado";
    }

    public void incrementoSalario() {

    }
}
