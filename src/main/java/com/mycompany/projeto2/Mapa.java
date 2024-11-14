/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto2;
import java.util.Random;

/**
 *
 * @author nelso
 */
public class Mapa {
    char[][] mapa; 
    private Random random;
    private int numero;
    public Mapa(int largura, int comprimento) {
        this.mapa = new char[comprimento][largura];
        this.random = new Random();
        preencherMapa(); 
    }

    public void preencherMapa() {
        for (int i = 0; i < this.mapa.length; i++) {
            for (int j = 0; j < this.mapa[i].length; j++) {
                numero=random.nextInt(101);
                if (numero<10){
                    this.mapa[i][j] = 'F';
                } 
                else if(numero>90){
                    this.mapa[i][j] = 'P';
                }
                else if (numero<85&&numero>80){
                    this.mapa[i][j] = 'A';
                }
                else{
                    this.mapa[i][j]='X';         
                }
            }
        }
    }
    
    public char[][] getMapa() {
        return this.mapa;
    }
    
}
