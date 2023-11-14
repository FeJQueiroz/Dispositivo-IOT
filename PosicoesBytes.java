package org.example;


import java.util.Base64;
public class PosicoesBytes {
    public static void main(String[] args) {
        String base64Input = "BSAAAAAJAAABrAACAAIAAQAEAAMAAAAAAAAAAAAAAAAAAAAAAAA=";

        byte[] decodedBytes = Base64.getDecoder().decode(base64Input);

        if (decodedBytes.length < 10) {
            System.err.println("Entrada Base64 não tem o tamanho esperado.");
            return;
        }


        int quantidadeDeRegistros = decodedBytes[0];


        int nivelDaBateria = decodedBytes[1];


        int relojoaria01H6 = (decodedBytes[5] & 0xFF) << 24 |
                (decodedBytes[4] & 0xFF) << 16 |
                (decodedBytes[3] & 0xFF) << 8 |
                (decodedBytes[2] & 0xFF);


        int relojoaria02H6 = (decodedBytes[9] & 0xFF) << 24 |
                (decodedBytes[8] & 0xFF) << 16 |
                (decodedBytes[7] & 0xFF) << 8 |
                (decodedBytes[6] & 0xFF);

        int consumo = (decodedBytes[1] & 0xFF) << 24 |
                (decodedBytes[10] & 0xFF) << 16 |
                (decodedBytes[9] & 0xFF) << 8 |
                (decodedBytes[8] & 0xFF);

        int consumo = (decodedBytes[2] & 0xFF) << 24 |
                (decodedBytes[11] & 0xFF) << 16 |
                (decodedBytes[10] & 0xFF) << 8 |
                (decodedBytes[9] & 0xFF);

        int consumo = (decodedBytes[1] & 0xFF) << 24 |
                (decodedBytes[12] & 0xFF) << 16 |
                (decodedBytes[11] & 0xFF) << 8 |
                (decodedBytes[10] & 0xFF);

        int consumo = (decodedBytes[2] & 0xFF) << 24 |
                (decodedBytes[13] & 0xFF) << 16 |
                (decodedBytes[12] & 0xFF) << 8 |
                (decodedBytes[11] & 0xFF);

        int consumo = (decodedBytes[1] & 0xFF) << 24 |
                (decodedBytes[14] & 0xFF) << 16 |
                (decodedBytes[13] & 0xFF) << 8 |
                (decodedBytes[12] & 0xFF);

        int consumo = (decodedBytes[2] & 0xFF) << 24 |
                (decodedBytes[15] & 0xFF) << 16 |
                (decodedBytes[14] & 0xFF) << 8 |
                (decodedBytes[13] & 0xFF);

        int consumo = (decodedBytes[1] & 0xFF) << 24 |
                (decodedBytes[16] & 0xFF) << 16 |
                (decodedBytes[15] & 0xFF) << 8 |
                (decodedBytes[14] & 0xFF);

        int consumo = (decodedBytes[2] & 0xFF) << 24 |
                (decodedBytes[17] & 0xFF) << 16 |
                (decodedBytes[16] & 0xFF) << 8 |
                (decodedBytes[15] & 0xFF);

        int consumo = (decodedBytes[1] & 0xFF) << 24 |
                (decodedBytes[18] & 0xFF) << 16 |
                (decodedBytes[17] & 0xFF) << 8 |
                (decodedBytes[16] & 0xFF);

        int consumo = (decodedBytes[2] & 0xFF) << 24 |
                (decodedBytes[19] & 0xFF) << 16 |
                (decodedBytes[18] & 0xFF) << 8 |
                (decodedBytes[17] & 0xFF);

        int relojoaria01H6 = (decodedBytes[20] & 0xFF) << 24 |
                (decodedBytes[21] & 0xFF) << 16 |
                (decodedBytes[22] & 0xFF) << 8 |
                (decodedBytes[23] & 0xFF);


        int relojoaria02H6 = (decodedBytes[24] & 0xFF) << 24 |
                (decodedBytes[25] & 0xFF) << 16 |
                (decodedBytes[26] & 0xFF) << 8 |
                (decodedBytes[27] & 0xFF);

        int consumo = (decodedBytes[1] & 0xFF) << 24 |
                (decodedBytes[28] & 0xFF) << 16 |
                (decodedBytes[27] & 0xFF) << 8 |
                (decodedBytes[26] & 0xFF);

        int consumo = (decodedBytes[2] & 0xFF) << 24 |
                (decodedBytes[29] & 0xFF) << 16 |
                (decodedBytes[28] & 0xFF) << 8 |
                (decodedBytes[27] & 0xFF);

        int consumo = (decodedBytes[1] & 0xFF) << 24 |
                (decodedBytes[28] & 0xFF) << 16 |
                (decodedBytes[29] & 0xFF) << 8 |
                (decodedBytes[30] & 0xFF);

        int consumo = (decodedBytes[2] & 0xFF) << 24 |
                (decodedBytes[29] & 0xFF) << 16 |
                (decodedBytes[30] & 0xFF) << 8 |
                (decodedBytes[31] & 0xFF);

        int consumo = (decodedBytes[1] & 0xFF) << 24 |
                (decodedBytes[30] & 0xFF) << 16 |
                (decodedBytes[31] & 0xFF) << 8 |
                (decodedBytes[32] & 0xFF);

        int consumo = (decodedBytes[2] & 0xFF) << 24 |
                (decodedBytes[31] & 0xFF) << 16 |
                (decodedBytes[32] & 0xFF) << 8 |
                (decodedBytes[33] & 0xFF);

        int consumo = (decodedBytes[1] & 0xFF) << 24 |
                (decodedBytes[32] & 0xFF) << 16 |
                (decodedBytes[33] & 0xFF) << 8 |
                (decodedBytes[34] & 0xFF);

        int consumo = (decodedBytes[2] & 0xFF) << 24 |
                (decodedBytes[33] & 0xFF) << 16 |
                (decodedBytes[34] & 0xFF) << 8 |
                (decodedBytes[35] & 0xFF);

        int consumo = (decodedBytes[1] & 0xFF) << 24 |
                (decodedBytes[34] & 0xFF) << 16 |
                (decodedBytes[35] & 0xFF) << 8 |
                (decodedBytes[36] & 0xFF);


        System.out.println("Quantidade de Registros: " + quantidadeDeRegistros);
        System.out.println("Nível da Bateria: " + nivelDaBateria);
        System.out.println("Relojoaria 01 H6: " + relojoaria01H6);
        System.out.println("Relojoaria 02 H6: " + relojoaria02H6);
    }
}



