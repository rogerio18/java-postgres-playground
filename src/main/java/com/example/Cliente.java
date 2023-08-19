package com.example;

public class Cliente{
    private double renda;
    private char sexo;
    private int anoNascimento;    

    public double getRenda(){
        return renda;
    }
    public void setRenda(double renda){
        if(renda >= 0)
            this.renda = renda; //this é este cliente
        else System.out.println("a renda deve ser maior que zero");
    }
    public char getSexo() {
            return sexo;               
    }
    public void setSexo(char sexo) {
        if(sexo == 'M' || sexo == 'F')
            this.sexo = sexo;
        else System.out.println("sexo invalido, informe M ou F");
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
}