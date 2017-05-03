/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
public class Dados {

    private int valor;

    public void tirar() {
        valor = 1 + (int) (Math.random() * 12);

    }

    public void Impri() {
        System.out.println("El valor del dado es " + valor + " ");
    }

    public int devolver() {

        return valor;
    }
}
