package com.example;

public class Cliente{
    private String nome;
    private String cpf;
    private double renda;
    private char sexo;
    private int anoNascimento; 
    private boolean especial;   
    private String cidade;

   
 // um contrutor é so assim, nao pode ter void, apenas public Cliente
    public Cliente(){   
        System.out.println("criando um cliente usando um construtor sem paramentros");
        double aleatorio = Math.random();
        if (aleatorio > 0.5){
            especial = true;
        }else especial = false;
    }
    public Cliente(String nome,double renda, char sexo){
        this(); //chamando o contrutor acima pra rodar o random  
        System.out.println("criando um cliente usando um contrutor com paramentros");
        this.sexo = sexo;
        setRenda(renda);
        setNome(nome);;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public boolean isEspecial() {
        return especial;
    }//o metodo get para boleano e assim com esse is

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
    public String getNome() {
        return nome;
    }
    public double getRenda(){
        return renda;
    }   
    public char getSexo() {
            return sexo;               
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase().trim();
        //touppercase ta convertendo para caixa alta
        //tolowercase converteria para caixa baixa
        //trim elimina espacos em branco

    }
    public void setRenda(double renda){
        if(renda >= 0)
            this.renda = renda; //this é este cliente
        else System.out.println("a renda deve ser maior que zero");
    }
    public void setSexo(char sexo) {
        if(sexo == 'M' || sexo == 'F'|| sexo == 'm' || sexo == 'f')
            this.sexo = sexo;
        else System.out.println("sexo invalido, informe M ou F");
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String toString(){
        return "Cliente: "+ nome + ".\n Cidade: "+ cidade +"\n";
    }
    
}