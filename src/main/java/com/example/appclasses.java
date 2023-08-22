package com.example;

public class appclasses {
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println("criando classes");
        System.out.println();
        
        Cliente cliente = new Cliente();
        cliente.setNome("rogerio");
        cliente.setRenda(12000);
        cliente.setSexo('M');
        cliente.setAnoNascimento(1991);
        cliente.setCpf("04642067310");

        System.out.println("cpf: "+cliente.getCpf());
        System.out.println("o nome do cliente é "+cliente.getNome());
        System.out.println("a renda do cliente é "+cliente.getRenda());
        System.out.println("o sexo é "+cliente.getSexo());
        System.out.println("o ano de nascimento é "+cliente.getAnoNascimento());
        System.out.println("especial: "+ cliente.isEspecial() );
        System.out.println();

        Cliente cliente2 = new Cliente("isaias",9600, 'F');

        cliente2.setCpf("046420673101");
        //cliente2.setNome("isaias");
        //cliente2.setRenda(9600);
        //cliente2.setSexo('S'); 
        //cliente2.setAnoNascimento(1996);

        System.out.println("o nome do cliente2 é "+cliente2.getNome());
        System.out.println("cpf: "+cliente2.getCpf());
        System.out.println("a renda do cliente2 é "+cliente2.getRenda());
        System.out.println("o sexo é "+cliente2.getSexo());
        System.out.println("o ano de nascimento é "+cliente2.getAnoNascimento());
        System.out.println("especial: "+ cliente2.isEspecial() );

        //testando metodos strings
        if(cliente.getCpf().equals(cliente2.getCpf())){
            System.out.println("os clintes possuem o mesmo cpf");
        }else {
            System.out.println("os clientes possuem cpfs diferentes");
        }
        
            

    }
}
