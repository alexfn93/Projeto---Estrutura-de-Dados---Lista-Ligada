/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.*;

import programa_listaligada.ListaLigada;
import programa_listaligada.No;

/**
 *
 * @author alexf
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String arg[]) {

        ListaLigada realLista = new ListaLigada();

        int i;

        double num;

        for (i = 1; i <= 5; i++) {

            num = Double.parseDouble(JOptionPane.showInputDialog("digite um número real"));

            realLista.InserirFinal(new No(num));

        }

        realLista.MostrarLista();

        System.exit(0);

    }

}
