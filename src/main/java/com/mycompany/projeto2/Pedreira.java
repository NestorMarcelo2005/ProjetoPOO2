/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto2;

/**
 *
 * @author nelso
 */
public class Pedreira extends Terrenos{
    private int pedra=0;
    public Pedreira(int largura, int comprimento) {
        super(largura, comprimento);
        this.pedra=0;
    }
    
    public int getPedra() {
        return pedra;
    }
    public void coletarPedra() {
        System.out.println("Coletaste" + pedra + " de pedra.");
        this.pedra += 200; 
    }
}
