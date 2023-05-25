
package utilidad;

import datos.Anime;

import java.util.ArrayList;
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
        // Encuentra la longitud máxima del nombre de los animes
        int maxLength = 0;
        for (Anime anime : animes) {
            maxLength = Math.max(maxLength, anime.getNombre().length());
        }

        // Realiza el ordenamiento por cada dígito, comenzando desde la posición menos significativa
        for (int digitIndex = maxLength - 1; digitIndex >= 0; digitIndex--) {
            countingSortAsc(animes, digitIndex);
        }
    }
    public static void radixSortDes(ArrayList<Anime> animes) {
        // Encuentra la longitud máxima del nombre de los animes
        int maxLength = 0;
        for (Anime anime : animes) {
            maxLength = Math.max(maxLength, anime.getNombre().length());
        }

        // Realiza el ordenamiento por cada dígito, comenzando desde la posición menos significativa
        for (int digitIndex = maxLength - 1; digitIndex >= 0; digitIndex--) {
            countingSortDes(animes, digitIndex);
        }
    }
    public static void countingSortAsc(ArrayList<Anime> animes, int digitIndex) {
        final int radix = 256; // Número de caracteres ASCII posibles

        int[] count = new int[radix];
        ArrayList<Anime> sortedAnimes = new ArrayList<>(animes.size());

        // Contar la frecuencia de cada carácter en la posición actual
        for (Anime anime : animes) {
            String nombre = anime.getNombre();
            int index = digitIndex < nombre.length() ? nombre.charAt(digitIndex) : 0;
            count[index]++;
        }

        // Calcular las posiciones finales de los caracteres
        for (int i = 1; i < radix; i++) {
            count[i] += count[i - 1];
        }

        // Construir el array ordenado
        for (int i = animes.size() - 1; i >= 0; i--) {
            String nombre = animes.get(i).getNombre();
            int index = digitIndex < nombre.length() ? nombre.charAt(digitIndex) : 0;
            sortedAnimes.set(--count[index], animes.get(i));
        }

        // Actualizar el ArrayList original con los elementos ordenados
        for (int i = 0; i < animes.size(); i++) {
            animes.set(i, sortedAnimes.get(i));
        }
    }
    public static void countingSortDes(ArrayList<Anime> animes, int digitIndex) {
        final int radix = 256; // Número de caracteres ASCII posibles

        int[] count = new int[radix];
        ArrayList<Anime> sortedAnimes = new ArrayList<>(animes.size());

        // Contar la frecuencia de cada carácter en la posición actual
        for (Anime anime : animes) {
            String nombre = anime.getNombre();
            int index = digitIndex < nombre.length() ? nombre.charAt(digitIndex) : 0;
            count[index]++;
        }

        // Calcular las posiciones iniciales de los caracteres en orden descendente
        for (int i = radix - 2; i >= 0; i--) {
            count[i] += count[i + 1];
        }

        // Construir el array ordenado
        for (int i = animes.size() - 1; i >= 0; i--) {
            String nombre = animes.get(i).getNombre();
            int index = digitIndex < nombre.length() ? nombre.charAt(digitIndex) : 0;
            sortedAnimes.set(--count[index], animes.get(i));
        }

        // Actualizar el ArrayList original con los elementos ordenados
        for (int i = 0; i < animes.size(); i++) {
            animes.set(i, sortedAnimes.get(i));
        }
    }
    public Anime findMaxNumber(List<Anime> numbers) {
        Anime maxNumber = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i).getNombre().compareTo(maxNumber.getNombre()) > 0) {
                maxNumber = numbers.get(i);
            }
        }
        return maxNumber;
    }

}
