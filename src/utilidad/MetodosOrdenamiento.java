
package utilidad;

import datos.Anime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Cristopher Soto
 */
public class MetodosOrdenamiento {
    public void bubbleSortArrayListAsc(ArrayList<Anime> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).getNombre().compareTo(list.get(j + 1).getNombre()) > 0) {
                    Anime aux = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, aux);
                }
            }
        }
    }
    public void bubbleSortArrayListDes(ArrayList<Anime> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).getNombre().compareTo(list.get(j + 1).getNombre()) < 0) {
                    Anime aux = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, aux);
                }
            }
        }
    }
    public void mergeSortArrayListAsc(ArrayList<Anime> list) {
        if (list.size() <= 1) {
            return; // La lista ya está ordenada o vacía
        }

        int medio = list.size() / 2;
        ArrayList<Anime> parteIzquierda = new ArrayList<>(list.subList(0, medio));
        ArrayList<Anime> parteDerecha = new ArrayList<>(list.subList(medio, list.size()));

        // Llamada recursiva para ordenar las dos mitades
        mergeSortArrayListAsc(parteIzquierda);
        mergeSortArrayListAsc(parteDerecha);

        // Combinar las dos partes ordenadas
        mergeArrayListAsc(list, parteIzquierda, parteDerecha);
    }
    public void mergeSortArrayListDes(ArrayList<Anime> list) {
        if (list.size() <= 1) {
            return; // La lista ya está ordenada o vacía
        }

        int medio = list.size() / 2;
        ArrayList<Anime> parteIzquierda = new ArrayList<>(list.subList(0, medio));
        ArrayList<Anime> parteDerecha = new ArrayList<>(list.subList(medio, list.size()));

        // Llamada recursiva para ordenar las dos mitades
        mergeSortArrayListDes(parteIzquierda);
        mergeSortArrayListDes(parteDerecha);

        // Combinar las dos partes ordenadas
        mergeArrayListDes(list, parteIzquierda, parteDerecha);
    }
    private void mergeArrayListAsc(List<Anime> list, List<Anime> parteIzquierda, List<Anime> parteDerecha) {
        int i = 0; // Índice para recorrer la parte izquierda
        int j = 0; // Índice para recorrer la parte derecha
        int k = 0; // Índice para recorrer la lista original

        // Combinar las dos partes en orden ascendente
        while (i < parteIzquierda.size() && j < parteDerecha.size()) {
            if (parteIzquierda.get(i).getNombre().compareTo(parteDerecha.get(j).getNombre()) <= 0) {
                list.set(k, parteIzquierda.get(i));
                i++;
            } else {
                list.set(k, parteDerecha.get(j));
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes de la parte izquierda
        while (i < parteIzquierda.size()) {
            list.set(k, parteIzquierda.get(i));
            i++;
            k++;
        }

        // Copiar los elementos restantes de la parte derecha
        while (j < parteDerecha.size()) {
            list.set(k, parteDerecha.get(j));
            j++;
            k++;
        }
    }
    private void mergeArrayListDes(List<Anime> list, List<Anime> parteIzquierda, List<Anime> parteDerecha) {
        int i = 0; // Índice para recorrer la parte izquierda
        int j = 0; // Índice para recorrer la parte derecha
        int k = 0; // Índice para recorrer la lista original

        // Combinar las dos partes en orden ascendente
        while (i < parteIzquierda.size() && j < parteDerecha.size()) {
            if (parteIzquierda.get(i).getNombre().compareTo(parteDerecha.get(j).getNombre()) >= 0) {
                list.set(k, parteIzquierda.get(i));
                i++;
            } else {
                list.set(k, parteDerecha.get(j));
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes de la parte izquierda
        while (i < parteIzquierda.size()) {
            list.set(k, parteIzquierda.get(i));
            i++;
            k++;
        }

        // Copiar los elementos restantes de la parte derecha
        while (j < parteDerecha.size()) {
            list.set(k, parteDerecha.get(j));
            j++;
            k++;
        }
    }
    public void radixSortAsc(ArrayList<Anime> animes) {
        // Encontrar el valor máximo en el número de temporadas
        int maxSeasons = 0;
        for (Anime anime : animes) {
            if (anime.getTemporadas() > maxSeasons) {
                maxSeasons = anime.getTemporadas();
            }
        }

        // Realizar el ordenamiento radix sort
        for (int exp = 1; maxSeasons / exp > 0; exp *= 10) {
            countingSortAsc(animes, exp);
        }
    }
    public static void radixSortDes(ArrayList<Anime> animeList) {
        // Encontrar el valor máximo en el número de temporadas
        int maxSeasons = 0;
        for (Anime anime : animeList) {
            if (anime.getTemporadas() > maxSeasons) {
                maxSeasons = anime.getTemporadas();
            }
        }

        // Realizar el ordenamiento radix sort
        for (int exp = 1; maxSeasons / exp > 0; exp *= 10) {
            countingSortDes(animeList, exp);
        }
    }
    public void countingSortAsc(ArrayList<Anime> animes, int exp) {
        int n = animes.size();
        ArrayList<Anime> output = new ArrayList<>(Collections.nCopies(n, null));

        // Inicializar el arreglo de conteo
        int[] count = new int[10];
        for (int i = 0; i < 10; i++) {
            count[i] = 0;
        }

        // Contar el número de ocurrencias de cada dígito en la posición actual
        for (int i = 0; i < n; i++) {
            int digit = (animes.get(i).getTemporadas() / exp) % 10;
            count[digit]++;
        }

        // Calcular las posiciones actuales de los elementos en la lista ordenada
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Construir la lista ordenada
        for (int i = n - 1; i >= 0; i--) {
            int digit = (animes.get(i).getTemporadas() / exp) % 10;
            output.set(count[digit] - 1, animes.get(i));
            count[digit]--;
        }

        // Copiar la lista ordenada al arreglo original
        for (int i = 0; i < n; i++) {
            animes.set(i, output.get(i));
        }
    }
    public static void countingSortDes(ArrayList<Anime> animeList, int exp) {
        int n = animeList.size();
        ArrayList<Anime> output = new ArrayList<>(Collections.nCopies(n, null));

        // Inicializar el arreglo de conteo
        int[] count = new int[10];
        for (int i = 0; i < 10; i++) {
            count[i] = 0;
        }

        // Contar el número de ocurrencias de cada dígito en la posición actual
        for (int i = 0; i < n; i++) {
            int digit = (animeList.get(i).getTemporadas() / exp) % 10;
            count[digit]++;
        }

        // Calcular las posiciones actuales de los elementos en la lista ordenada
        for (int i = 8; i >= 0; i--) {
            count[i] += count[i + 1];
        }

        // Construir la lista ordenada
        for (int i = n - 1; i >= 0; i--) {
            int digit = (animeList.get(i).getTemporadas() / exp) % 10;
            output.set(count[digit] - 1, animeList.get(i));  // Aquí se ha corregido el índice
            count[digit]--;
        }

        // Copiar la lista ordenada al arreglo original
        for (int i = 0; i < n; i++) {
            animeList.set(i, output.get(i));
        }
    }
}
