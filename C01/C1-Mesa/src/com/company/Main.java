/*
Se debe desarrollar un programa que permita calcular el área de una figura geométrica,
la cual puede ser un círculo o un cuadrado. El programa debe responder el mensaje: “El
área del X es Y unidades”, donde X es el tipo de figura geométrica y Y es el valor
calculado del área.
Para el cálculo de las áreas será necesario recibir como parámetro el radio del círculo o el
lado del cuadrado, cuyos valores deben ser mayores que cero. En caso de que esta
condición no se cumpla, se debe imprimir el mensaje: “El valor del radio o lado debe ser mayor que cero”.

Las fórmulas para el cálculo del área del círculo y del cuadrado son:
● Círculo: 𝜋 r2
● Cuadrado: L2
Recordemos siempre qué casos de prueba van a ser requeridos antes de implementar la lógica de los métodos.
*/

package com.company;

public class Main {

    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(2);
        Circulo circulo2 = new Circulo(4);
        System.out.println("\n" + "CIRCULOS" );
        System.out.println("El radio del circulo es: "+ circulo1.getRadio()+ " y su perímetro "+ circulo1.calcularPerimetro());
        System.out.println("El radio del circulo es: "+ circulo2.getRadio()+ " y su perímetro "+ circulo2.calcularPerimetro());

        System.out.println("\n" + "Area");
        System.out.println("El area del circulo es: "+ circulo1.getRadio()+ " y su perímetro "+circulo1.calcularArea());
        System.out.println("El area del circulo es: "+ circulo2.getRadio()+ " y su perímetro "+circulo2.calcularArea());


        Cuadrado cuadrado1 = new Cuadrado(2.0);
        Cuadrado cuadrado2 = new Cuadrado(3.0);
        System.out.println("\n" + "CUADRADOS");
        System.out.println("Perímetros");
        System.out.println("El lado del cuadrado es: " + cuadrado1.getLado() + " y su perimetro " + cuadrado1.calcularPerimetro());
        System.out.println("El lado del cuadrado es: " + cuadrado2.getLado() + " y su perimetro " + cuadrado2.calcularPerimetro());


        System.out.println( "\n" +"Area");
        System.out.println("La lado del cuadrado es: " + cuadrado1.getLado()+ " y su area: " + cuadrado1.calcularArea());
        System.out.println("La lado del cuadrado es: " + cuadrado2.getLado()+ " y su area: " + cuadrado2.calcularArea());
    }
}