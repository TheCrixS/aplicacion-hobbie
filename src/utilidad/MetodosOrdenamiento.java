
package utilidad;

import datos.Anime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Cristopher Soto
 */
public class MetodosOrdenamiento {
    public void bubbleSortLinkedListAsc(LinkedList<Anime> list) {
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
    public void bubbleSortLinkedListDes(LinkedList<Anime> list) {
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
    public void mergeSortLinkedListAsc(LinkedList<Anime> list) {
        if (list.size() <= 1) {
            return; // La lista ya está ordenada o vacía
        }

        int medio = list.size() / 2;
        LinkedList<Anime> parteIzquierda = new LinkedList<>(list.subList(0, medio));
        LinkedList<Anime> parteDerecha = new LinkedList<>(list.subList(medio, list.size()));

        // Llamada recursiva para ordenar las dos mitades
        mergeSortLinkedListAsc(parteIzquierda);
        mergeSortLinkedListAsc(parteDerecha);

        // Combinar las dos partes ordenadas
        mergeLinkedListAsc(list, parteIzquierda, parteDerecha);
    }
    public void mergeSortLinkedListDes(LinkedList<Anime> list) {
        if (list.size() <= 1) {
            return; // La lista ya está ordenada o vacía
        }

        int medio = list.size() / 2;
        LinkedList<Anime> parteIzquierda = new LinkedList<>(list.subList(0, medio));
        LinkedList<Anime> parteDerecha = new LinkedList<>(list.subList(medio, list.size()));

        // Llamada recursiva para ordenar las dos mitades
        mergeSortLinkedListDes(parteIzquierda);
        mergeSortLinkedListDes(parteDerecha);

        // Combinar las dos partes ordenadas
        mergeLinkedListDes(list, parteIzquierda, parteDerecha);
    }
    private void mergeLinkedListAsc(LinkedList<Anime> list, LinkedList<Anime> parteIzquierda, LinkedList<Anime> parteDerecha) {
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
    private void mergeLinkedListDes(LinkedList<Anime> list, LinkedList<Anime> parteIzquierda, LinkedList<Anime> parteDerecha) {
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
    public void radixSortLinkedListAsc(LinkedList<Anime> animes) {
        // Encontrar el valor máximo en el número de temporadas
        int maxSeasons = 0;
        for (Anime anime : animes) {
            if (anime.getTemporadas() > maxSeasons) {
                maxSeasons = anime.getTemporadas();
            }
        }

        // Realizar el ordenamiento radix sort
        for (int exp = 1; maxSeasons / exp > 0; exp *= 10) {
            countingSortLinkedListAsc(animes, exp);
        }
    }
    public void radixSortLinkedListDes(LinkedList<Anime> animeList) {
        // Encontrar el valor máximo en el número de temporadas
        int maxSeasons = 0;
        for (Anime anime : animeList) {
            if (anime.getTemporadas() > maxSeasons) {
                maxSeasons = anime.getTemporadas();
            }
        }

        // Realizar el ordenamiento radix sort
        for (int exp = 1; maxSeasons / exp > 0; exp *= 10) {
            countingSortLinkedListDes(animeList, exp);
        }
    }
    public void countingSortLinkedListAsc(LinkedList<Anime> animes, int exp) {
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
    public void countingSortLinkedListDes(LinkedList<Anime> animeList, int exp) {
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


    public void bubbleSortArrayAsc(Anime[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j].getNombre().compareTo(arreglo[j+1].getNombre()) > 0) {
                    Anime aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
    }
    public void bubbleSortArrayDes(Anime[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j].getNombre().compareTo(arreglo[j+1].getNombre()) < 0) {
                    Anime aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
    }
    public void mergeSortArrayAsc(Anime[] arr) {
        if (arr.length <= 1) {
            return; // El arreglo ya está ordenado o vacío
        }

        int medio = arr.length / 2;
        Anime[] parteIzquierda = Arrays.copyOfRange(arr, 0, medio);
        Anime[] parteDerecha = Arrays.copyOfRange(arr, medio, arr.length);

        // Llamada recursiva para ordenar las dos mitades
        mergeSortArrayAsc(parteIzquierda);
        mergeSortArrayAsc(parteDerecha);

        // Combinar las dos partes ordenadas
        mergeArrayAsc(arr, parteIzquierda, parteDerecha);
    }
    public void mergeArrayAsc(Anime[] arr, Anime[] leftArr, Anime[] rightArr) {
        int i = 0, j = 0, k = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i].getNombre().compareTo(rightArr[j].getNombre()) <= 0) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < rightArr.length) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
    public void mergeSortArrayDesc(Anime[] arr) {
        if (arr.length <= 1) {
            return; // El arreglo ya está ordenado o vacío
        }

        int medio = arr.length / 2;
        Anime[] parteIzquierda = Arrays.copyOfRange(arr, 0, medio);
        Anime[] parteDerecha = Arrays.copyOfRange(arr, medio, arr.length);

        // Llamada recursiva para ordenar las dos mitades
        mergeSortArrayDesc(parteIzquierda);
        mergeSortArrayDesc(parteDerecha);

        // Combinar las dos partes ordenadas en orden descendente
        mergeArrayDesc(arr, parteIzquierda, parteDerecha);
    }
    public void mergeArrayDesc(Anime[] arr, Anime[] leftArr, Anime[] rightArr) {
        int i = 0, j = 0, k = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i].getNombre().compareTo(rightArr[j].getNombre()) >= 0) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < rightArr.length) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
    public void radixSortArrayAsc(Anime[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        // Encuentra el valor máximo en el arreglo para determinar el número de dígitos
        int maxTemporadas = getMaxTemporadas(arr);

        // Aplica el algoritmo Radix Sort para cada dígito
        for (int exp = 1; maxTemporadas / exp > 0; exp *= 10) {
            countingSortArrayAsc(arr, exp);
        }
    }
    private int getMaxTemporadas(Anime[] arr) {
        int maxTemporadas = arr[0].getTemporadas();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getTemporadas() > maxTemporadas) {
                maxTemporadas = arr[i].getTemporadas();
            }
        }
        return maxTemporadas;
    }
    public void countingSortArrayAsc(Anime[] arr, int exp) {
        int n = arr.length;
        Anime[] output = new Anime[n];
        int[] count = new int[10]; // Un arreglo para contar la frecuencia de los dígitos

        // Inicializa el arreglo count
        Arrays.fill(count, 0);

        // Calcula la frecuencia de los dígitos en la posición actual
        for (int i = 0; i < n; i++) {
            int digit = (arr[i].getTemporadas() / exp) % 10;
            count[digit]++;
        }

        // Calcula las posiciones actuales de los dígitos en el arreglo de salida
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Construye el arreglo de salida
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i].getTemporadas() / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copia el arreglo de salida al arreglo original
        System.arraycopy(output, 0, arr, 0, n);
    }
    public void radixSortArrayDesc(Anime[] arr) {
        // Encontrar el valor máximo en el número de temporadas
        int maxSeasons = 0;
        for (Anime anime : arr) {
            if (anime.getTemporadas() > maxSeasons) {
                maxSeasons = anime.getTemporadas();
            }
        }

        // Realizar el ordenamiento radix sort
        for (int exp = 1; maxSeasons / exp > 0; exp *= 10) {
            countingSortArrayDesc(arr, exp);
        }
    }
    public void countingSortArrayDesc(Anime[] arr, int exp) {
        int n = arr.length;
        Anime[] output = new Anime[n];
        Arrays.fill(output, null);

        // Inicializar el arreglo de conteo
        int[] count = new int[10];
        for (int i = 0; i < 10; i++) {
            count[i] = 0;
        }

        // Contar el número de ocurrencias de cada dígito en la posición actual
        for (int i = 0; i < n; i++) {
            int digit = (arr[i].getTemporadas() / exp) % 10;
            count[digit]++;
        }

        // Calcular las posiciones actuales de los elementos en la lista ordenada
        for (int i = 8; i >= 0; i--) {
            count[i] += count[i + 1];
        }

        // Construir la lista ordenada
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i].getTemporadas() / exp) % 10;
            output[count[digit] - 1] = arr[i];  // Aquí se ha corregido el índice
            count[digit]--;
        }

        // Copiar la lista ordenada al arreglo original
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}
