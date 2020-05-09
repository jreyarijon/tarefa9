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
public class Secretario extends Empregado {

    private String despacho;
    private String fax;
    private final float INCREMENTO = 5 / 100;

    public Secretario() {
    }

    public Secretario(String despacho, String fax, String nome, String apelidos, String DNI, String direccion, int anosAntiguedade, String tlf, float salario, Empregado supervisor) {
        super(nome, apelidos, DNI, direccion, anosAntiguedade, tlf, salario, supervisor);
        this.despacho = despacho;
        this.fax = fax;
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
                + "Fax: " + fax + "\n"
                + "Posto: secretario";
    }

}
