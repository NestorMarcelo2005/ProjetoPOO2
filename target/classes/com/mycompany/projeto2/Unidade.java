/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto2;

/**
 *
 * @author mgng2
 */
public abstract class Unidade {
    protected String nome;
    protected int posicaoX;
    protected int posicaoY;
    private int vida;
    
    public Unidade(String nome, int posicaoX, int posicaoY, int vida){
        this.nome = nome;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.vida = vida;
    }
    
    public String getNome(){return nome;}
    public int getPosicaoX(){return posicaoX;}
    public int getPosicaoY(){return posicaoY;}
    public int getVida(){return vida;}
    public void setVida(int vida){this.vida = vida;}
    
    public void mover(int novaPosicaoX, int novaPosicaoY){
        this.posicaoX = novaPosicaoX;
        this.posicaoY = novaPosicaoY;
    }
    
}
