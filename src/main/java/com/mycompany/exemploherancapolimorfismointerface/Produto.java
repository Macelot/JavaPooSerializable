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
 * Projeto com exemplo de Herança 
 */
public class Produto implements Serializable{
    private String nome;
    private Float preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString(){
        String r="";
        r += String.format("%16s","Nome ")+this.nome+"\n";
        r += String.format("%16s","Preço ")+this.preco+"\n";
        return r;
    }
    
}
