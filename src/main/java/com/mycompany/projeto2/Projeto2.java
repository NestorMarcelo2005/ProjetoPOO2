/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto2;

/**
 *
 * @author Leand
 */
public class Projeto2 {

   private Floresta floresta;
    private Pedreira pedreira;
    private Menus menus;
    public static void imprimirMapa(char[][] mapa) {
        int comprimento = mapa.length;
        int largura = mapa[0].length;

        System.out.print("   "); 
        for (int col = 0; col < largura; col++) {
            System.out.printf("%3d ", col);
        }
        System.out.println();

        for (int linha = 0; linha < comprimento; linha++) {
            System.out.printf("%3d ", linha); 
            for (int col = 0; col < largura; col++) {
                System.out.print(" " + mapa[linha][col] + "  ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int largura = 30;
        int comprimento = 30;
        Menus menus = new Menus();
        Mapa mapa = new Mapa(largura, comprimento);
        Floresta floresta = new Floresta(largura, comprimento);
        Pedreira pedreira = new Pedreira(largura, comprimento);
        mapa.insereCidadesRandom(50);
        System.out.println("A-Agua");
        System.out.println("P-Pedreira");
        System.out.println("F-Floresta");
        System.out.println("X-Terreno vazio");
        System.out.println("Mapa");
        imprimirMapa(mapa.getMapa());
        System.out.println("Quantidade total de madeira: " + floresta.getMadeira());
        System.out.println("Quantidade total de pedra: " + pedreira.getPedra());
        System.out.println(menus.ImprimirMenu());
    }
}
