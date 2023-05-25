
package utilidad;

import datos.Anime;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Cristopher Soto
 */
public class MetodosOrdenamiento {
    public void bubbleSortArrayList(ArrayList<Anime> list) {
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

    public void mergeSortArrayList(ArrayList<Anime> list) {
        if (list.size() <= 1) {
            return; // La lista ya está ordenada o vacía
        }

        int medio = list.size() / 2;
        ArrayList<Anime> parteIzquierda = new ArrayList<>(list.subList(0, medio));
        ArrayList<Anime> parteDerecha = new ArrayList<>(list.subList(medio, list.size()));

        // Llamada recursiva para ordenar las dos mitades
        mergeSortArrayList(parteIzquierda);
        mergeSortArrayList(parteDerecha);

        // Combinar las dos partes ordenadas
        mergeArrayList(list, parteIzquierda, parteDerecha);
    }

    private void mergeArrayList(List<Anime> list, List<Anime> parteIzquierda, List<Anime> parteDerecha) {
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

    public void radixSort(ArrayList<Anime> list) {
        if (list.isEmpty()) {
            return;
        }

        // Encuentra la longitud máxima del nombre
        int maxLength = getMaxNameLength(list);

        // Aplica el algoritmo de Radix Sort en cada dígito del nombre
        for (int digit = maxLength - 1; digit >= 0; digit--) {
            countingSort(list, digit);
        }
    }

    private int getMaxNameLength(ArrayList<Anime> list) {
        int maxLength = 0;
        for (Anime anime : list) {
            int nameLength = anime.getNombre().length();
            if (nameLength > maxLength) {
                maxLength = nameLength;
            }
        }
        return maxLength;
    }

    private void countingSort(ArrayList<Anime> list, int digit) {
        final int radix = 256; // Considerando caracteres ASCII
        int[] count = new int[radix];
        ArrayList<Anime> sortedList = new ArrayList<>(list.size());

        // Realiza el conteo de ocurrencias de cada carácter
        for (Anime anime : list) {
            int nameLength = anime.getNombre().length();
            int charIndex = (digit < nameLength) ? anime.getNombre().charAt(digit) : 0;
            count[charIndex]++;
        }

        // Calcula las posiciones finales de cada carácter en la lista ordenada
        for (int i = 1; i < radix; i++) {
            count[i] += count[i - 1];
        }

        // Ordena los elementos en la lista temporalmente
        for (int i = list.size() - 1; i >= 0; i--) {
            Anime anime = list.get(i);
            int nameLength = anime.getNombre().length();
            int charIndex = (digit < nameLength) ? anime.getNombre().charAt(digit) : 0;
            sortedList.set(--count[charIndex], anime);
        }

        // Actualiza la lista original con los elementos ordenados
        for (int i = 0; i < list.size(); i++) {
            list.set(i, sortedList.get(i));
        }
    }

    public void imprimirArrayList(List<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
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
