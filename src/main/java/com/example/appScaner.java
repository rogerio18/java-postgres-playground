package com.example;

import java.util.Scanner;

public class appScaner {
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        //cliente.setNome("rogerio");
        //cliente.setRenda(12000);
        //cliente.setSexo('M');
        //cliente.setAnoNascimento(1991);
        //cliente.setCpf("04642067310");

        

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o nome: ");
        cliente.setNome(scanner.nextLine()); //nextLine pq é uma string
        
        System.out.println("digite o cpf: ");
        cliente.setCpf(scanner.nextLine());

        System.out.println("digite o ano de nascimento: ");
        cliente.setAnoNascimento(scanner.nextInt());

        scanner.nextLine();

        System.out.println("digite o sexo: ");
        String sexo = scanner.nextLine();
        cliente.setSexo(sexo.charAt(0));

        System.out.println("digite a renda: ");
        cliente.setRenda(scanner.nextDouble());



        System.out.println("cpf: "+cliente.getCpf());
        System.out.println("o nome do cliente é "+cliente.getNome());
        System.out.println("a renda do cliente é "+cliente.getRenda());
        System.out.println("o sexo é "+cliente.getSexo());
        System.out.println("o ano de nascimento é "+cliente.getAnoNascimento());
        System.out.println("especial: "+ cliente.isEspecial() );
        System.out.println();
        
    }
}
