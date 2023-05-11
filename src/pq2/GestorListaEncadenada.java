/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pq2;

/**
 *
 * @author P204-08
 */
import java.util.LinkedList;
import pq1.Anime;

/**
 * author : Vinni
 * Clase para ejemplificar una Cola con el uso de colecciones
 * La clase Stack es una coleccion que implementa la estructura FIFO (First In - First Out, o Primero en entrar - primero en salir). 
 * 
 **/

public class GestorListaEncadenada {
    private LinkedList<Anime> laLista = new LinkedList<>();    
    public void adicionar(Anime anime){
        laLista.add(anime);        
    }
    public void retirar(){
        laLista.remove(); 
    }
    public void adicionaPr(Anime anime){
        laLista.addFirst(anime);        
    }
    
    public void imprimir(){
        System.out.println(" - -  - - LISTA ENCADENADA - - ");
        for (Anime anime : laLista) {
            System.out.println(anime);
        }
    }
}