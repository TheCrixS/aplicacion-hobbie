/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestores;

/**
 *
 * @author Cristopher Soto
 */
import java.util.ArrayList;

import datos.Anime;
public class GestorLista {
    private ArrayList<Anime> laLista = new ArrayList<>();
    public void adicionar(Anime anime){
        laLista.add(anime);        
    }
    public void retirar(Anime anime){
        laLista.remove(anime);
    }
    
    public void imprimir(){
        System.out.println(" - -  - - LISTA ENCADENADA - - ");
        for (Anime anime : laLista) {
            System.out.println(anime);
        }
    }
}