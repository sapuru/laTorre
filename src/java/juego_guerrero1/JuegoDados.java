/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
public class JuegoDados {
    
    private Dados die1, die2, die3;
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


    public JuegoDados() {

        die1 = new Dados();
        die2 = new Dados();
        die3 = new Dados();

    }

    public void jugar() {

        die1.tirar();
        die1.Impri();
        die2.tirar();
        die2.Impri();
        die3.tirar();
        die3.Impri();
        System.out.println();

        if (die1.devolver() <= die2.devolver() && die1.devolver() >= die3.devolver()) {
            System.out.println("Gano");
        } else {
            System.out.println("Perdio");
        }

    }

    public static void main(String[] args) {

        JuegoDados d = new JuegoDados();
        d.jugar();

    }

}
