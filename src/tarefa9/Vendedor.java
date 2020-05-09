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
public class Vendedor extends Empregado {

    private String tlfM;
    private String areaVenta;
    private String porcentaxeVendas;
    private final float INCREMENTO = 10 / 100;
    private String matricula;
    private String marca;
    private String modelo;

    ArrayList<String> lista;

    public Vendedor() {
    }

    public Vendedor(String tlfM, String areaVenta, String porcentaxeVendas, String matricula, String marca, String modelo, String nome, String apelidos, String DNI, String direccion, int anosAntiguedade, String tlf, float salario, Empregado supervisor) {
        super(nome, apelidos, DNI, direccion, anosAntiguedade, tlf, salario, supervisor);
        this.tlfM = tlfM;
        this.areaVenta = areaVenta;
        this.porcentaxeVendas = porcentaxeVendas;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getTlfM() {
        return tlfM;
    }

    public void setTlfM(String tlfM) {
        this.tlfM = tlfM;
    }

    public String getAreaVenta() {
        return areaVenta;
    }

    public void setAreaVenta(String areaVenta) {
        this.areaVenta = areaVenta;
    }

    public String getPorcentaxeVendas() {
        return porcentaxeVendas;
    }

    public void setPorcentaxeVendas(String porcentaxeVendas) {
        this.porcentaxeVendas = porcentaxeVendas;
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
                + "Telefono mobil: " + tlfM + "\n"
                + "Area de menta: " + areaVenta + "\n"
                + "Porcentaxe de venta (comisions): " + porcentaxeVendas + "\n"
                + "COCHE \n"
                + "Matricula: " + matricula + "\n"
                + "Marca: " + marca + "\n"
                + "Modelo: " + modelo + "\n"
                + "Posto: vendedor";
    }

    public void darDeAlta(ArrayList<String> lista) {
        lista.add(Datos.pedirString("Nome cliente: "));
    }

    public void darDeBaixa(ArrayList<String> lista) {
        String borrar = Datos.pedirString("Nome do cliente a dar de baixa: ");
        lista.remove(borrar);
    }

    public void cambiarCoche() {
        setMatricula(Datos.pedirString("Nova matricula: "));
        setMarca(Datos.pedirString("Nova marca: "));
        setModelo(Datos.pedirString("Novo modelo: "));
    }

}
