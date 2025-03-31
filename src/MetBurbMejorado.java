public class MetBurbMejorado {
    
    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }

    public int[] ordenar(int[] arreglo, boolean ascendente) {
        int n = arreglo.length;
        int contComparaciones = 0;
        int conCmbios = 0;
        boolean cambio;

        for (int i = 0; i < n - 1; i++) {
            cambio = false;

            for (int j = 0; j < n - 1 - i; j++) {
                contComparaciones++;
                if ((ascendente && arreglo[j] > arreglo[j + 1]) || 
                    (!ascendente && arreglo[j] < arreglo[j + 1])) {
                    int aux = arreglo[j];
                    conCmbios++;
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    cambio = true;
                }
            }

            if (!cambio) {
                break;
            }
        }

        int[] respuesta = {contComparaciones, conCmbios};
        return respuesta;
    }

    public void conPasos(int[] arreglo, boolean isDes) {
        int n = arreglo.length;
        int contComparaciones = 0;
        int conCmbios = 0;

        System.out.println("Arreglo original: ");
        imprimirArreglo(arreglo);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println("Comparación " + (contComparaciones + 1) + ": " + arreglo[i] + " con " + arreglo[j]);
                contComparaciones++;

                if (isDes && arreglo[i] < arreglo[j] || !isDes && arreglo[i] > arreglo[j]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = aux;

                    conCmbios++;
                    System.out.println("Intercambio: " + arreglo[i] + " <-> " + arreglo[j]);
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
