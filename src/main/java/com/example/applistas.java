package com.example;

import java.util.ArrayList;
import java.util.List;

public class applistas {
    public static void main(String[] args) {
        // Cliente cliente[] = new Cliente[5]; declaração e instanciamento de vetor
        List<Cliente> listaClientes = new ArrayList<>(); // declaracão e instanciamento de uma lista
        //o new ArrayList<>() cria uma lista tipo vetor com 10 elementos
        // se passar dos 10 ele cria outra com 15 e joga os 10 elementos dentro pra ter mais 5 e assim por diante
        //o new LinkedList<>() cria os espaços apenas a cada add de elementos, nao sequenciais o alocamento

        var cliente1 = new Cliente();
        cliente1.setNome("manuel");
        cliente1.setCidade("tamboril");

        var cliente2 =  new Cliente();
        cliente2.setNome("dardanio");
        cliente2.setCidade("brejo");

        var cliente3 =  new Cliente();
        cliente3.setNome("Joaquim");
        cliente3.setCidade("italia");

        var cliente4 =  new Cliente();
        cliente4.setNome("nayra");
        cliente4.setCidade("pajeu");

        var cliente5 =  new Cliente();
        cliente5.setNome("rogerio");
        cliente5.setCidade("baixao");

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);//adicionando os elemenentos do tipo Cliente
        listaClientes.add(cliente4);
        listaClientes.add(cliente5);
        
        listaClientes.remove(0); //remove o posicao zero e o seguinte assume a posicao zero
        listaClientes.remove(cliente3); //removeu o cliente especifico
        int i = listaClientes.size() -1; //alocou na var i a posição do ultimo elemento
        listaClientes.remove(i);

        //pra funcionar a impressao e atraves do for tem que criar la na classe Cliente
        //um metodo de retorno ex.     public String toString(){
        //                                return "Cliente: "+ nome + " . Cidade: "+ cidade;
    
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente);
        }
    }
}
