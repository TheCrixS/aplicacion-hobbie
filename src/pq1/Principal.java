package pq1;

import java.util.ArrayList;
import java.util.List;
import pq2.GestorCola;
import pq2.GestorListaEncadenada;
import pq2.GestorPila;

public class Principal {
    public static void main1(String[] args) {
        Anime anime = new Anime("","",0);
        Operaciones oper = new Operaciones();
        List<Anime> lint = new ArrayList<>();
        lint.add(new Anime("Dragon ball, ","Shonen, ",8));
        lint.add(new Anime("Naruto, ","Shonen, ",5));
        lint.add(new Anime("Black clover, ","Shonen, ",1));
        lint.add(new Anime("Boku no hero, ","Shonen, ",6));
        lint.add(new Anime("Jojos, ","Shonen, ",10));
        System.out.println("Lista desordenada: \n"+lint);
        oper.delaBurbuja2(lint);
        System.out.println("Lista ordenada: \n"+lint);
    }
    public static void main(String[] args) {
        Anime anime = new Anime("","",0);
        GestorCola gl = new GestorCola();
        GestorListaEncadenada gc = new GestorListaEncadenada();
        GestorPila gp = new GestorPila();
        
        gl.adicionar(new Anime("Dragon ball, ","Shonen, ",8));
        gl.adicionar(new Anime("Naruto, ","Shonen, ",5));
        gl.adicionar(new Anime("Black clover, ","Shonen, ",1));
        gl.adicionar(new Anime("Boku no hero, ","Shonen, ",6));
        gl.adicionar(new Anime("Jojos, ","Shonen, ",10));
        
                
        gc.adicionar(new Anime("Dragon ball, ","Shonen, ",8));
        gc.adicionar(new Anime("Naruto, ","Shonen, ",5));
        gc.adicionar(new Anime("Black clover, ","Shonen, ",1));
        gc.adicionar(new Anime("Boku no hero, ","Shonen, ",6));
        gc.adicionar(new Anime("Jojos, ","Shonen, ",10));
        
        gp.adicionar(new Anime("Dragon ball, ","Shonen, ",8));
        gp.adicionar(new Anime("Naruto, ","Shonen, ",5));
        gp.adicionar(new Anime("Black clover, ","Shonen, ",1));
        gp.adicionar(new Anime("Boku no hero, ","Shonen, ",6));
        gp.adicionar(new Anime("Jojos, ","Shonen, ",10));
        
        gl.imprimir();
        gc.imprimir();
        gp.imprimir();
        
        
    }
}
