package com.example;

import java.time.LocalDate;

public class appeleitor {
    public static void main(String[] args) {
        var cidadao = new Cidadao();
        cidadao.setDataNascimento(LocalDate.of(2006, 11, 18));
        System.out.println(cidadao.idade());
        System.out.println(cidadao.eleitor());
    }
    
}
