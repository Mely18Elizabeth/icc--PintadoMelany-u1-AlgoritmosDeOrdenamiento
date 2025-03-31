import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] arreglo = {10, 9, 21, 5, 15, 2, -1, 0};
        Scanner sc = new Scanner(System.in);
        boolean confirmar = true;

        while (confirmar) {
            System.out.println("Selecciona el método: ");
            System.out.println(" 1. Burbuja");
            System.out.println(" 2. Selección");
            System.out.println(" 3. Inserción");
            System.out.println(" 4. Burbuja Mejorado");
            System.out.println(" 5. Salir");
            int metodo = sc.nextInt();
            
            if (metodo == 5) {
                confirmar = false;
                break; 
            }
            
            System.out.println("¿Deseas ver los pasos? (true/false):");
            boolean conPasos = sc.nextBoolean();
            System.out.println("Deseas ordenar ascendente (A) o descendente (D):");
            char orden = sc.next().toUpperCase().charAt(0);
            
            MetodoBurbuja metodoBurbuja = new MetodoBurbuja();
            
            switch (metodo) {
                case 1:
                    System.out.println("-----Método Burbuja-----");
                    if (conPasos) {
                        metodoBurbuja.conPasos(arreglo, conPasos);;;
                    } else {
                        if (orden=='A') {
                            metodoBurbuja.ordenarAscendente(arreglo);
                        } else {
                            metodoBurbuja.ordenarDescendente(arreglo);
                        }
                        metodoBurbuja.imprimirArreglo(arreglo);
                    }
                    break;
                    
                case 2:
                    MetodoSeleccion metodoSeleccion = new MetodoSeleccion();
                    System.out.println("-----Método Selección-----");
                    if (conPasos) {
                        metodoSeleccion.conPasos(arreglo, conPasos);
                    } else {
                        if (orden=='A') {
                            metodoSeleccion.ordenarAsdSeleccion(arreglo);
                        } else {
                            metodoSeleccion.ordenarDesSeleccion(arreglo);
                        }
                        metodoBurbuja.imprimirArreglo(arreglo);
                    }
                    break;
                    
                case 3:
                    MetodoInsercion metodoInsercion = new MetodoInsercion();
                    System.out.println("-----Método Inserción-----");
                    if (conPasos) {
                        metodoInsercion.conPasos(arreglo, conPasos);
                    } else {
                        if (orden=='A') {
                            metodoInsercion.ordenarAsd(arreglo, conPasos);
                        } else {
                            metodoInsercion.ordenarDesInsercion(arreglo);
                        }
                        metodoBurbuja.imprimirArreglo(arreglo);
                    }
                    break;
                    
                case 4:
                MetBurbMejorado metBurbMejorado = new MetBurbMejorado();
                System.out.println("-----Método Burbuja Mejorado-----");
                if (conPasos) {
                    metBurbMejorado.conPasos(arreglo, conPasos);
                } else {
                    if (orden=='A') {
                        metBurbMejorado.ordenar(arreglo, true);
                    } else {
                        metBurbMejorado.ordenar(arreglo, false);
                    }
                    metBurbMejorado.imprimirArreglo(arreglo);
                }
                break;
            }
        }
        sc.close();
    }
}
