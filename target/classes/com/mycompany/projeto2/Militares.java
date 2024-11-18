/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto2;

/**
 *
 * @author mgng2
 */
public class Militares extends Unidade{
    private int custoManutencao;
    private int forcaCombate;
    private Cidades cidadeAssociada;
   
    public Militares(int posicaoX, int posicaoY,int vida ,int forcaCombate, int custoManutencao, Cidades cidadeAssociada){
        super ("Militares", posicaoX, posicaoY,vida);
        this.cidadeAssociada = cidadeAssociada;
        this.forcaCombate = forcaCombate;
        this.custoManutencao = custoManutencao;
    }
    public int getCustoManutencao(){return custoManutencao;}
    public int getForcaCombate(){return forcaCombate;}
    public Cidades getCidadeAssociada(){return cidadeAssociada;}
    public void setCidadeAssociada(Cidades cidadeAssociada){this.cidadeAssociada = cidadeAssociada;}
    
    public void atacar(Militares outraUnidade){
            if(this.getVida()>0 && outraUnidade.getVida()>0){
                if(outraUnidade instanceof Militares){
                    Militares outraMilitar = (Militares) outraUnidade;
                    outraUnidade.setVida(outraUnidade.getVida() - this.getForcaCombate());
                    this.setVida(this.getVida() - outraUnidade.getForcaCombate());  
        } else {
            // Unidades como Colonos ou Pedreiros sofrem dano sem revidar
            outraUnidade.setVida(outraUnidade.getVida() - this.getForcaCombate());
        }

        if (outraUnidade.getVida() <= 0) {
            System.out.println(outraUnidade.getNome() + " foi destruída!");
        }else {
            System.out.println("Uma das unidades já está destruída, não é possível atacar!");
        }
              
    }
}     
            
    public void atacar(Cidades cidade){
        if(this.cidadeAssociada == cidade){
            System.out.println(this.getNome() + " não pode atacar a própria cidade!");
        } else{
        if (this.getVida() > 0 && cidade.getDefesa() > 0){
            cidade.setDefesa(cidade.getDefesa() - this.getForcaCombate());
            this.setVida(this.getVida() - cidade.getForcaDefensiva());

            if (cidade.getDefesa() == 0){
                System.out.println("A cidade foi conquistada!");
            }
            if (this.getVida() == 0){
                System.out.println(this.getNome() + " foi destruída durante o ataque!");
            }
        } else{
            System.out.println("A cidade já foi conquistada ou a unidade está destruída!");
            }
        }
        
    }
    
}

 

