package com.example;

import java.time.LocalDate;

public class Cidadao {
    private LocalDate dataNascimento;

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public int idade(){
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }
    public String eleitor(){
        int idade = idade();
        if(idade < 16){
            return "o cidadao nao é eleitor";
        }else if(idade > 15 && idade <18 || idade >70){
            return "eleitor facultativo";
        }
        return "eleitor obrigatorio";//nao precisa do else pq se ele cair no retur ja sai do teste
    }
}
