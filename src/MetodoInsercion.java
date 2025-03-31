public class MetodoInsercion {

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }

    public int ordenarAsd(int[] arreglo, boolean Pasos) {
        int tam = arreglo.length;
        int conComparaciones = 0;
        for (int i = 1; i < tam; ++i) {
            int aux = arreglo[i];
            int j = i - 1;

            while (j >= 0 && aux < arreglo[j]) {
                conComparaciones++;
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = aux;
        }
        return conComparaciones;
    }

    public void ordenarDesInsercion(int[] arreglo) {
        int tam = arreglo.length;
        for (int i = 1; i < tam; i++) {
            int tam2 = arreglo[i];
            int j = i - 1;

            while (j >= 0 && arreglo[j] < tam2) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = tam2;
        }
    }

    public void conPasos(int[] arreglo, boolean isDes) {
        int tam = arreglo.length;
        int contComparaciones = 0;
        int conCmbios = 0;

        System.out.println("Arreglo original: ");
        imprimirArreglo(arreglo);

        for (int i = 1; i < tam; ++i) {
            int aux = arreglo[i];
            int j = i - 1;

            while (j >= 0 && (isDes ? arreglo[j] < aux : arreglo[j] > aux)) {
                System.out.println("Comparación " + (contComparaciones + 1) + ": " + arreglo[j] + " con " + aux);
                contComparaciones++;
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = aux;

            System.out.print("Estado actual: ");
            imprimirArreglo(arreglo);
        }

        System.out.println("--FIN DEL METODO--");
        System.out.println("Arreglo ordenado: ");
        imprimirArreglo(arreglo);
        System.out.println("Comparaciones Totales -> " + contComparaciones);
        System.out.println("Cambios Totales -> " + conCmbios);
    }
}
