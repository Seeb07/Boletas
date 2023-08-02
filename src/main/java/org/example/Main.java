package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);


        //Boletas

        String nombreCompleto;
        Integer edad;
        Integer cedula;
        String ciudad;
        Integer valorBoleta=450000;
        Integer numeroDeBoletas;

        System.out.println("Bienvenido a tu Boleta.com ******");

        System.out.print("Por favor digite su nombre completo: ");
        nombreCompleto=teclado.nextLine();

        System.out.print("Por favor ingrese su edad:");
        edad=teclado.nextInt();

        System.out.print("Por favor ingrese su numero de cedula:");
        cedula= teclado.nextInt();

        ciudad= teclado.nextLine();
        System.out.print("Por favor ingrese su ciudad: ");
        ciudad= teclado.nextLine();

        System.out.print("digite numero de boletas que a comprar:");
        numeroDeBoletas=teclado.nextInt();

        Integer totalPagarBoletas=numeroDeBoletas*valorBoleta;

        if (edad>=18 && numeroDeBoletas<=4){
            System.out.print("Señor usuario, gracias por su compra, deseamos disfrute el concierto, el total de su compra es: "+totalPagarBoletas);
        } else{
            System.out.print("Señor usuario usted no cumple con la edad suficiente para el evento o esta comprando mas de 4");
        }