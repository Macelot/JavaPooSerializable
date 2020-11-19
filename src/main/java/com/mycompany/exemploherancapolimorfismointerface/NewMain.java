/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemploherancapolimorfismointerface;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author marce
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Eletronico e;
        e = new Eletronico();
        e.setNome("teclado");
        e.setPreco(99.50f);
        e.setTensao(5);
        
        Vestuario v;
        v = new Vestuario();
        v.setNome("Camisa");
        v.setPreco(100f);
        v.setSexo('M');
        v.setTamanho("Grande");
        
        System.out.println(e.toString());
        System.out.println(v.toString());
        
        ArrayList ps = new ArrayList();
        ps.add(e);
        ps.add(v);
        
        ArrayQualquer pss = new ArrayQualquer(40);
        
        ProdutoQualquer p1 = new ProdutoQualquer();
        p1.adicionar(e);
        pss.guarda(p1);
        
        //mais produtos
        Float preco;
        for (int i = 0; i < 5; i++) {
            e = new Eletronico();
            e.setNome("Monitor");
            preco=800.50f+i;
            e.setPreco(preco);
            e.setTensao(220);
            p1=new ProdutoQualquer();
            p1.adicionar(e);
            pss.guarda(p1);
            ps.add(e);
        }
        
        ProdutoQualquer p2 = new ProdutoQualquer();
        p2.adicionar(v);
        pss.guarda(p2);
        
        ps.add(p2);
        
        FileOutputStream fo;
        ObjectOutputStream oo;
        try {
            fo = new FileOutputStream("estoque.obj");
            oo = new ObjectOutputStream(fo);
            oo.writeObject(ps);
            oo.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        
        try {
            fo = new FileOutputStream("estoque2.obj");
            oo = new ObjectOutputStream(fo);
            oo.writeObject(pss);
            oo.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        
        ArrayList dadosLidos;
        
        ArrayQualquer dadosLidos2;
       
        FileInputStream fis,fis2;
        ObjectInputStream ois,ois2;
        try {
            fis = new FileInputStream("estoque.obj");
            ois = new ObjectInputStream(fis);
            dadosLidos = (ArrayList) ois.readObject();
            System.out.println("Tam "+dadosLidos.size());
            System.out.println("Dados ");
            System.out.println(dadosLidos.toString());
            
            fis2 = new FileInputStream("estoque2.obj");
            ois2 = new ObjectInputStream(fis2);
            dadosLidos2 = (ArrayQualquer) ois2.readObject();
            System.out.println("Tam 2 "+dadosLidos2.size());
            System.out.println("Dados 2 ");
            System.out.println(dadosLidos2.mostra());
            
        } catch (Exception exception) {
            exception.printStackTrace();
        }
                
        
    }
    
}
