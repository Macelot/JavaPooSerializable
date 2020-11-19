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
 */
public class Vestuario extends Produto implements Precos,Serializable{
    private Character sexo;
    private String tamanho;

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    @Override
    public Float calculaPreco(){
        Float p = 0f;
        p = this.getPreco()*1.5f;
        return p;
    }
    
    @Override
    public String toString(){
        String r="";
        r += super.toString();
        r += String.format("%16s","Sexo ")+this.sexo+"\n";
        r += String.format("%16s","Tamanho ")+this.tamanho+"\n";
        r += String.format("%16s","Preço de venda ")+String.format("%5.2f",this.calculaPreco())+"\n";
        return r;
    }
    
    
}
