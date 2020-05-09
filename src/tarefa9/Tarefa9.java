/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa9;

import java.util.ArrayList;

/**
 *
 * @author Josemolamazo
 */
public class Tarefa9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Secretario sec = new Secretario("Despacho 1", "987654321", "Pablo", "Perez Perez", "12345678E", "C/ Vigo", 4, "981000000", 700, null);
        Vendedor ven = new Vendedor("678000000", "Urbanizacion Hola", "68%", "89j-3455", "Audi", "A5", "Paula", "Lopez Lopez", "67887655R", "C/ Hola", 2, "981444333", 850, null);
        XefeZona xefe = new XefeZona("Despacho 2", sec, "89P-I073", "BMW", "i4", "Brais", "Diaz Diaz", "12345678M", "C/Polonia", 1, "981234432", 1000, null);
        ArrayList<String> listaClientes = new ArrayList();
        ArrayList<String> listaVen = new ArrayList();
        
        sec.toString();
        sec.incrementarSalario();
        
        ven.toString();
        ven.incrementarSalario();
        ven.darDeAlta(listaClientes);
        ven.darDeBaixa(listaClientes);
        ven.cambiarCoche();
        
        xefe.toString();
        xefe.incrementoSalario();
        xefe.cambiarCoche();
        xefe.cambiarSecretario(sec);
        xefe.darDeAlta(listaVen);
        xefe.darDeBaixa(listaVen);
    }

}
