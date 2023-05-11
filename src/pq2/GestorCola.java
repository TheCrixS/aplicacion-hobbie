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
import java.util.Queue;
import pq1.Anime;

/**
 * author : Vinni
 * Clase para ejemplificar una Cola con el uso de colecciones
 * La clase Stack es una coleccion que implementa la estructura FIFO (First In - First Out, o Primero en entrar - primero en salir). 
 * 
 **/
public class GestorCola {
    private Queue<Anime> laCola = new LinkedList<Anime>();
    public void adicionar(Anime anime){
        laCola.add(anime);        
    }
    public void retirar(){
        laCola.poll();        
    }
    public void imprimir(){
        System.out.println(" - -  - - LISTA COLA - - ");
        for (Anime anime : laCola) {
            System.out.println(anime);
        }
    }
}