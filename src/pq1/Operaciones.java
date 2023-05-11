/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pq1;

import java.util.List;

/**
 *
 * @author P204-08
 */
public class Operaciones {
    
    public void delaBurbuja2(List<Anime> arreglo){
        for (int i =0; i < arreglo.size(); i++) {
            for (int j = 0; j < arreglo.size()-i-1; j++) {
                if (arreglo.get(j).getTemporadas()> arreglo.get(j+1).getTemporadas()){
                    Anime aux = arreglo.get(j);
                    arreglo.set(j, arreglo.get(j+1));
                    arreglo.set(j+1, aux);
                }
            }
        }
    }
}
