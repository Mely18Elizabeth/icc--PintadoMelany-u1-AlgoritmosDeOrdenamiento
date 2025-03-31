public class MetodoBurbuja {

    public void ordenarAscendente(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println("i=" + i + "   j=" + j);
                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = aux;
                }
            }
        }
    }

    public void ordenarDescendente(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println("i=" + i + "   j=" + j);
                if (arreglo[i] < arreglo[j]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = aux;
                }
            }
        }
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }

    public void conPasos(int array[], boolean isDes) {
        int n = array.length;
        int aux;
        int contComparaciones = 0;
        int conCmbios = 0;

        System.out.println("Arreglo original: ");
        imprimirArreglo(array);
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println("Comparación " + (contComparaciones + 1) + ": " + array[i] + " con " + array[j]);

                contComparaciones++;

                if (isDes && array[i] < array[j] || !isDes && array[i] > array[j]) {
                    aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;

                    conCmbios++;
                    System.out.println("Intercambio: " + array[i] + " <-> " + array[j]);
                }

                System.out.print("Estado actual: ");
                imprimirArreglo(array);
            }
        }

        System.out.println("--FIN DEL METODO--");
        System.out.println("Arreglo ordenado: ");
        imprimirArreglo(array);
        System.out.println("Comparaciones Totales -> " + contComparaciones);
        System.out.println("Cambios Totales -> " + conCmbios);
    }
}
