package com.example;

import java.util.Arrays;

public class serpro {
    public static void main(String[] args) {
        //int numero = new 
        int idade = 31, peso = 76;
        long idade2 = 32;

        float realzim = 10;
        double realzao = 45.6;
        
        System.out.println();
        System.out.println("a sua idade é "+idade+", e a idade2 é "+ idade2+ ". o peso " + peso +" e o realzao "+ realzao+"  "+realzim);
        System.out.println();
        
        char masculino = 'M';
        String M = "Masculino";

        var coringa = 10;
        var coringa2 = " biscicleta ";

        System.out.println("o sexo é "+ masculino);
        System.out.println();
        System.out.println("o sexo M é "+M);
        System.out.println();
        System.out.println("as variaveis não declaradas o tipo de cara são "+coringa + coringa2);
        System.out.println();

        double vetor [] = {10,20,30};
        // para atribuir um vetor a outro vetor os tipos precisam ser iguais. 
        // um vet double nao recebe um vet int.
        double vetor2[] = vetor;
        vetor[1] = 25;
        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
        System.out.println(Arrays.toString(vetor));
        System.out.println();
        System.out.println(Arrays.toString(vetor2));
        System.out.println();

        int vetor3[] = new int[4]; //declarando vetor vazio de 4 possições
        vetor3[0] = 100;
        vetor3[1] = 200;
        vetor3[2] = 300;
        vetor3[3] = 400;

        double matriz [][] = {{10,20,30},{40,50,60}};

        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));
        System.out.println();

        matriz[0] = new double[]{1,2,3}; //trocando os 3 valores da matriz posicao zero
        matriz[0][2] = 90;
        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));

        for (int i=0; i < vetor3.length; i++){
            System.out.print(" "+ vetor3[i]);

        }
        System.out.println();
        System.out.println();
        System.out.println("brincando com matriz");
        System.out.println();

        double matrizauto[][] = new double[5][5];
        double cont = 1;
        for (int i=0; i<matrizauto.length; i++){
            for (int j = 0; j <matrizauto[i].length; j++) {
                
                matrizauto[i][j] = (10 * cont);
                cont = (cont+1);
                
            }
            
        }
        for (int i = 0; i < matrizauto.length; i++) {
            for (int j = 0; j < matrizauto[i].length; j++) {
                System.out.printf("%5.1f ", matrizauto[i][j]);
                //o printf esta organizando os numeros em 5decimais e 1 apos a virgula
            }
            System.out.println();
        }









    }
    
}
