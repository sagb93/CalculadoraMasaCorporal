package com.calculadora.servicio;

import com.calculadora.modelo.CalculadoraMasaMuscular;

import java.util.Scanner;

public class Bootstrap {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        executeCalculadoraMasaCorporal(entrada);
    }

    public static void executeCalculadoraMasaCorporal(Scanner entrada){
        CalculadoraMasaMuscular calculadoraMasaMuscular = new CalculadoraMasaMuscular();
        System.out.println("Ingrese los datos de manera correcta: ");
        System.out.println("Peso en Kg: ");
        double pesokg = entrada.nextDouble();
        System.out.println("Estatura en mt: ");
        double estaturamt = entrada.nextDouble();
        calculadoraMasaMuscular.execute(pesokg, estaturamt);
    }
}