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
public class ProdutoQualquer<T> implements Serializable{
    
    private T produtoQualquer;
    
    public void adicionar(T t){
       this.produtoQualquer = t; 
    }
    
    public T pegar(){
        return produtoQualquer;
    }
    
    @Override
    public String toString(){
        String r = "";
        //r+= super.toString();
        return r;
    }
    
}
