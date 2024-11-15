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
    private int distanciaMinima = 2; //Distância mínima entre as cidades
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
    
    public boolean isPosicaoValida(int x, int y){
        if (x < 0 || x >= mapa.length || y < 0 || y >= mapa[0].length){
            return false;
        }
        if(mapa[x][y] == 'c'){
            return false;
        }
        int i = -distanciaMinima;
        while(i <= distanciaMinima){
            int j = -distanciaMinima;  
            
            while(j <= distanciaMinima){
                if(!(i == 0 && j == 0)){
                    int novoX = x + i;
                    int novoY = y + j;  
                    
                    if (novoX >= 0 && novoX < mapa.length && novoY >= 0 && novoY < mapa[0].length){
                        if(mapa[novoX][novoY] == 'c'){
                            return false;
                        }
                    }
         
                }
                j++;
            }
            i++;
            
    }
    return true;           
}
        
    public boolean colocaCidade(int x, int y){
        if (isPosicaoValida(x,y)){
            mapa[x][y] = 'c';
            return true;
        }
        else{
            return false;
        }
    }
    public void insereCidadesRandom(int numeroCidades){
        int cidadesColocadas = 0;
        
        while(cidadesColocadas < numeroCidades){
            int x = random.nextInt(mapa.length);
            int y = random.nextInt(mapa[0].length);
            
            if(isPosicaoValida(x,y)){
                colocaCidade(x,y);
                cidadesColocadas++;
            }
        }
        
    }
    public void setDistanciaMinima(int distanciaMinima){
        this.distanciaMinima = distanciaMinima;
    }
}
    
  
