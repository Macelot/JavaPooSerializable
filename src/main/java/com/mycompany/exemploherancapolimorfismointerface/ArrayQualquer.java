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
public class ArrayQualquer<E extends Produto> implements Serializable{
    
    ProdutoQualquer<E>[] ps;
    
    ProdutoQualquer<E> p;
    
    public ArrayQualquer(int capacidade){
        ps = new ProdutoQualquer[capacidade];
    }
    
    public boolean guarda(ProdutoQualquer elemento){
        for (int i = 0; i < ps.length; i++) {
            if(this.ps[i]==null){
                this.ps[i]=elemento;
                return true;
            }
        }
        return false;
    }
    public int size(){
        return ps.length;
    }
    
    public ProdutoQualquer pega(int pos){
        ProdutoQualquer pp;
        pp = new ProdutoQualquer();
        pp = ps[pos];
        return pp;
    }
    
    public String mostra(){
        String r="";
        for (int i = 0; i < ps.length; i++) {
            if(ps[i]!=null){
                //System.out.println(ps[i].toString());
                //System.out.println(ps[i].pegar().toString());
                r+=ps[i].pegar().toString()+"\n";
                //r+=ps[i].toString()+"\n";
            }
        }
        return r;
    }
    
}
