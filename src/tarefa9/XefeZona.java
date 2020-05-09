/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa9;

import java.util.ArrayList;
import librerias.Datos;

/**
 *
 * @author Josemolamazo
 */
public class XefeZona extends Empregado {

    private String despacho;
    private Secretario secretario;
    private final float INCREMENTO = 20 / 100;
    private String matricula;
    private String marca;
    private String modelo;

    ArrayList<String> lista;

    public XefeZona() {
    }

    public XefeZona(String despacho, Secretario secretario, String matricula, String marca, String modelo, String nome, String apelidos, String DNI, String direccion, int anosAntiguedade, String tlf, float salario, Empregado supervisor) {
        super(nome, apelidos, DNI, direccion, anosAntiguedade, tlf, salario, supervisor);
        this.despacho = despacho;
        this.secretario = secretario;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   
    public float incrementarSalario() {
        float incremento = super.getSalario() * INCREMENTO * super.getAnosAntiguedade();
        super.setSalario(super.getSalario() + incremento);
        return super.getSalario();
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Despacho: " + despacho + "\n"
                + "Secretario: " + secretario + "\n"
                + "COCHE \n"
                + "Matricula: " + matricula + "\n"
                + "Marca: " + marca + "\n"
                + "Modelo: " + modelo + "\n"
                + "Posto: xefe de zona";
    }

    public void cambiarSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public void cambiarCoche() {
        setMatricula(Datos.pedirString("Nova matricula: "));
        setMarca(Datos.pedirString("Nova marca: "));
        setModelo(Datos.pedirString("Novo modelo: "));
    }

    public void darDeAlta(ArrayList<String> lista) {
        lista.add(Datos.pedirString("Nome vendedor: "));
    }

    public void darDeBaixa(ArrayList<String> lista) {
        String borrar = Datos.pedirString("Vendedor a dar de baixa: ");
        lista.remove(borrar);
    }
}
