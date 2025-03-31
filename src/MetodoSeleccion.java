public class MetodoSeleccion {

    public void ordenarDesSeleccion(int[] arreglo){
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[maxIdx] < arreglo[j]) {
                    maxIdx = j;
                }
            }
            if (maxIdx != i) {
                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i] = aux;
            }
        }
    }

    public void ordenarAsdSeleccion(int[] arreglo){
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[minIdx] > arreglo[j]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int aux = arreglo[minIdx];
                arreglo[minIdx] = arreglo[i];
                arreglo[i] = aux;
            }
        }
    }
    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }

    public void conPasos(int[] arreglo, boolean isDes) {
        int n = arreglo.length;
        int contComparaciones = 0;
        int conCmbios = 0;

        System.out.println("Arreglo original: ");
        imprimirArreglo(arreglo);

        for (int i = 0; i < n - 1; i++) {
            int idx = isDes ? i : i;
            for (int j = i + 1; j < n; j++) {
                System.out.println("Comparación " + (contComparaciones + 1) + ": " + arreglo[idx] + " con " + arreglo[j]);
                contComparaciones++;

                if (isDes && arreglo[idx] < arreglo[j] || !isDes && arreglo[idx] > arreglo[j]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[idx];
                    arreglo[idx] = aux;

                    conCmbios++;
                    System.out.println("Intercambio: " + arreglo[idx] + " <-> " + arreglo[j]);
                }

                System.out.print("Estado actual: ");
                imprimirArreglo(arreglo);
            }
        }

        System.out.println("--FIN DEL METODO--");
        System.out.println("Arreglo ordenado: ");
        imprimirArreglo(arreglo);
        System.out.println("Comparaciones Totales -> " + contComparaciones);
        System.out.println("Cambios Totales -> " + conCmbios);
    }
}
