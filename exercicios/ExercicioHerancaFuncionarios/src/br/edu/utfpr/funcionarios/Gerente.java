package br.edu.utfpr.funcionarios;

public class Gerente extends Funcionario {
    private String login;
    private String senha;
    
    public Gerente(){
    
    }
    
    public Gerente(String nome, double salario, String login, String senha){
        super(nome, salario);
        this.login = login;
        this.senha = senha;
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    
    public String getLogin(){
        return login;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String setSenha(){
        return senha;
    }
    
    public double calcularBonificacao(){
        return super.getSalario() * 0.1;
    }
    
    public double calcularSalarioTotal(){
        return super.getSalario() + calcularBonificacao();
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\nLogin: ").append(login).append("\nSenha: ").append(senha);
        return sb.toString();
    }
}
