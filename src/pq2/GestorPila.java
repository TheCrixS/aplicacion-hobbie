/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pq2;

/**
 *
 * @author P204-08
 */
import java.util.Stack;
import pq1.Anime;

/**
 * author : Vinni
 * Clase para ejemplificar una Pila con el uso de colecciones
 * La clase Stack es una coleccion que implementa la estructura LIFO (Last In - First Out, o último en entrar - primero en salir). 
 * 
 **/
public class GestorPila{
    private Stack<Anime> laPila = new Stack<>();

    public void adicionar(Anime anime){
        laPila.push(anime);        
    }
    public void retirar(){
        laPila.pop();        
    }
    public void imprimir(){
        System.out.println(" - -  - - LISTA PILA - - ");
        for (Anime anime : laPila) {
            System.out.println(anime);
        }
    }
}