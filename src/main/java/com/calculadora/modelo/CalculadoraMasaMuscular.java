package com.calculadora.modelo;

public class CalculadoraMasaMuscular {

    public CalculadoraMasaMuscular(){
    }

    public void execute(double pesoEnKilogramos, double alturaEnMetros){
        double bmi = pesoEnKilogramos / (alturaEnMetros * alturaEnMetros);

        boolean bajoPeso = 18.50 > bmi;
        boolean normal = bmi > 18.50 && bmi < 24.90;
        boolean sobrePeso = bmi > 25.00 && bmi < 29.00;
        boolean obeso = bmi > 30.00;

        this.mostrarPantallaPrincipal(bmi);
        this.mostrarPantallaResultado(bmi, bajoPeso, normal, sobrePeso, obeso);
    }

    public void mostrarPantallaPrincipal(double bmi){
        this.printMessage("*******************************************");
        this.printMessage("Su bmi es: " + Math.ceil(bmi));
        this.printMessage("Esta en el indice: ");
    }

    public void mostrarPantallaResultado(double bmi, boolean bajoPeso, boolean normal, boolean sobrePeso, boolean obeso){

        if (bajoPeso) this.mostrarMensajeAmigable("Bajo de peso: 18.50 > bmi", bmi);
        if (normal) this.mostrarMensajeAmigable("Normal: bmi > 18.50 && bmi < 24.90", bmi);
        if (sobrePeso) this.mostrarMensajeAmigable("Sobre peso: bmi > 25.00 && bmi < 29.00", bmi);
        if (obeso) this.mostrarMensajeAmigable("Obeso: bmi > 30.00", bmi);
    }

    private void mostrarMensajeAmigable(String template, double bmi){
        this.printMessage(template.replace("bmi", String.valueOf(Math.ceil(bmi))));
    }

    private void printMessage(String message) {
        System.out.println(message);
    }
}
