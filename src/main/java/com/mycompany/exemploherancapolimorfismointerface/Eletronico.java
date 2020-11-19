/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemploherancapolimorfismointerface;

import java.io.Serializable;

/**
 *
 * @author marce
 * quando colocamos extends, estamos usando 
 * tudo que tem na outra classe, no caso 
 * na classe Produto
 * Produto é a classe Pai, ou super Classe
 * 
 */
public class Eletronico extends Produto implements Precos,Serializable{
    private Integer tensao;

    public Integer getTensao() {
        return tensao;
    }

    public void setTensao(Integer tensao) {
        this.tensao = tensao;
    }
    
    @Override
    public Float calculaPreco(){
        Float p = 0f;
        p = this.getPreco()*1.10f;
        return p;
    }
    
    @Override
    public String toString(){
        String r="";
        r += super.toString();
        r += String.format("%16s","Tensão ")+this.tensao+"\n";
        r += String.format("%16s","Preço de venda ")+String.format("%5.2f",this.calculaPreco())+"\n";
        return r;
    }
    
    
}
