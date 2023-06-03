package puzzle8;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Puzzle8 {

    public static String estadoInicial = "3687 1425";
    public static String estadoFinal = "12345678 ";

    public static void main(String[] args) {
        // Instancia del arbol
        ArbolBusqueda ej = new ArbolBusqueda(new Nodo(estadoInicial), estadoFinal);
        // Ejecutando la busqueda
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Elije una opcion: \n"
                                + "1.Posiciones erroneas \n"
                                + "2.Diferencia absoluta entre valores \n"
                                + "3.Diferencia de posiciones \n"
                                + "4.Resultados \n"
                                + "5.Salir",
                        JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                        ej.busquedaPorAnchuraConHeuristica(opcion);
                        break;
                    case 2:
                        ej.busquedaPorAnchuraConHeuristica(opcion);
                        break;
                    case 3:
                        ej.busquedaPorAnchuraConHeuristica(opcion);
                        break;
                    case 4:
                        ej.mostarResultados();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;
                }
            } catch (NumberFormatException n) {
            }

        } while (opcion != 5);

        // a.busquedaPorProfundidad();
        // Imprime movimientos

        /*
         * Nodo n = new Nodo(estadoInicial);
         * Collection<String> c = 4n.generaHijos();
         * c = c;
         */
        sc.close();
    }

}