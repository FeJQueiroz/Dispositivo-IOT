package org.example;


import java.util.Base64;
public class Saida {
    ublic static void main(String[] args) {
        String base64Input = "BSAAAAAJAAABrAACAAIAAQAEAAMAAAAAAAAAAAAAAAAAAAAAAAA=";


        byte[] decodedBytes = Base64.getDecoder().decode(base64Input);

        if (decodedBytes.length < 17) {
            System.err.println("Entrada Base64 não tem o tamanho esperado.");
            return;
        }

        
        // Imprimir os valor's
        String qtDeRegistro;
        System.out.println("<QT de registro>: " + qtDeRegistro);
        String nivelDaBateria;
        System.out.println("<nível da bateria>: " + nivelDaBateria);
        String relojoaria01H6;
        System.out.println("<relojoaria 01 H6>: " + relojoaria01H6);
        String relojoaria02H6;
        System.out.println("<relojoaria 02 H6>: " + relojoaria02H6);
        byte[] consumoRL01;
        System.out.println("<consumo (RL01)>: " + byteArrayToHex(consumoRL01));
        byte[] consumoRL02;
        System.out.println("<consumo (RL02)>: " + byteArrayToHex(consumoRL02));
        byte[] consumoRL01;
        System.out.println("<consumo (RL01)>: " + byteArrayToHex(consumoRL01));
        byte[] consumoRL02;
        System.out.println("<consumo (RL02)>: " + byteArrayToHex(consumoRL02));
        byte[] consumoRL01;
        System.out.println("<consumo (RL01)>: " + byteArrayToHex(consumoRL01));
        byte[] consumoRL02;
        System.out.println("<consumo (RL02)>: " + byteArrayToHex(consumoRL02));
        byte[] consumoRL01;
        System.out.println("<consumo (RL01)>: " + byteArrayToHex(consumoRL01));
        byte[] consumoRL02;
        System.out.println("<consumo (RL02)>: " + byteArrayToHex(consumoRL02));
        byte[] consumoRL01;
        System.out.println("<consumo (RL01)>: " + byteArrayToHex(consumoRL01));
        byte[] consumoRL02;
        System.out.println("<consumo (RL02)>: " + byteArrayToHex(consumoRL02));
        String relojoaria01H6;
        System.out.println("<relojoaria 01 H6>: " + relojoaria01H6);
        String relojoaria02H6;
        System.out.println("<relojoaria 02 H6>: " + relojoaria02H6);
        byte[] consumoRL01;
        System.out.println("<consumo (RL01)>: " + byteArrayToHex(consumoRL01));
        byte[] consumoRL02;
        System.out.println("<consumo (RL02)>: " + byteArrayToHex(consumoRL02));
        byte[] consumoRL01;
        System.out.println("<consumo (RL01)>: " + byteArrayToHex(consumoRL01));
        byte[] consumoRL02;
        System.out.println("<consumo (RL02)>: " + byteArrayToHex(consumoRL02));
        byte[] consumoRL01;
        System.out.println("<consumo (RL01)>: " + byteArrayToHex(consumoRL01));
        byte[] consumoRL02;
        System.out.println("<consumo (RL02)>: " + byteArrayToHex(consumoRL02));
        byte[] consumoRL01;
        System.out.println("<consumo (RL01)>: " + byteArrayToHex(consumoRL01));
        byte[] consumoRL02;
        System.out.println("<consumo (RL02)>: " + byteArrayToHex(consumoRL02));
        byte[] consumoRL01;
        System.out.println("<consumo (RL01)>: " + byteArrayToHex(consumoRL01));
        byte[] consumoRL02;
        System.out.println("<consumo (RL02)>: " + byteArrayToHex(consumoRL02));
    }

    public static String byteArrayToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder(2 * bytes.length);
        for (byte b : bytes) {
            hexString.append(String.format("%02X", b));
        }
        return hexString.toString();
    }

}
