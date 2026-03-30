
package br.edu.utfpr.conta;


public class Conta {
    private int numero;
    private double saldo;
    
    public Conta(){
    
    }
    
    public Conta(int numero){
        this.saldo = 0;
        this.numero = numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void depositar(double deposito){
        if(deposito > 0){
            this.saldo = saldo + deposito;
            
        }
    }
    
    public boolean sacar(double saque){
        if(saque <= saldo && saque > 0 ){
            this.saldo = saldo - saque;
            return true;
        } 
        return false;
    }
    
    @Override
    public String toString(){
        return "Dados iniciais da conta:\nNúmero da conta: " + numero + "\nSaldo: " + saldo + "\n";
    }
    
}
