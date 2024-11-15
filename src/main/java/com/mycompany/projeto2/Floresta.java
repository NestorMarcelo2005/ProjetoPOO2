/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto2;

/**
 *
 * @author nelso
 */
public class Floresta extends Terrenos{
    private int madeira=0;
    public Floresta(int largura, int comprimento) {
        super(largura, comprimento);
        this.madeira = 0;
    }
    public int getMadeira() {
        return madeira;
    }
    public void coletarMadeira() {
        System.out.println("Coletaste" + madeira + " de madeira.");
        this.madeira += 200;
    }
}
