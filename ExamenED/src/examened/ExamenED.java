package examened;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExamenED {

    public static void main(String[] args) {
        
        // Variables
        final int cantidadNumeros = 3; // Número de números que pide. Si se cambia a 5, te pedirá 5 números
        String numerosOrdenados; // Texto para ordenar los números en pantalla
        Scanner input = new Scanner(System.in); // Clase Scanner para pedir números
        ArrayList<Integer> listaNumeros = new ArrayList<>(); // Lista de números en la que se van introduciendo a la vez que se piden por teclado
        
        // Pedir datos
        System.out.print("Introduce " + cantidadNumeros + " números: ");
        while(listaNumeros.size() < cantidadNumeros) listaNumeros.add(input.nextInt()); // Pedir X números y añadirlos a la lista "numberList"
        
        // Cálculos
        Collections.sort(listaNumeros); // Ordenar la lista (a lo fácil)
        numerosOrdenados = listaNumeros.toString(); // Convertir la lista en texto, por ejemplo, [1, 2, 3] pasaría a "[1, 2, 3]"
        numerosOrdenados = numerosOrdenados.substring(1, numerosOrdenados.length() - 1); // Eliminar los corchetes, por ejemplo, "[1, 2, 3]" pasaría a "1, 2, 3"
        
        // Mostrar resultados
        System.out.println("El número más pequeño: " + listaNumeros.get(0)); // El número más pequeño es el primero de la lista
        System.out.println("El número más grande: " + listaNumeros.get(listaNumeros.size() - 1)); // El más grande es el último, así que usaremos (tamaño de la lista - 1) como índice
        System.out.println("Lista ordenada (menor a mayor): " + numerosOrdenados); // Mostrar la lista ordenada (variable de texto)
    }
    
}
