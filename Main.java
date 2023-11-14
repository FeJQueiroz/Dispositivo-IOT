package org.example;

import java.util.Base64
public class Main {
    public static void main(String[] args) {

        String codificado = Base64.getEncoder().encodeToString(PosicoesBytes.main();)

        System.out.print("Imprimir Console!");


        byte[] decodificado = Base64.getDecoder().decode(codificado);


        for (int i = 1; i <= 5; i++) {


            System.out.println("i = " + i);
        }
    }
}