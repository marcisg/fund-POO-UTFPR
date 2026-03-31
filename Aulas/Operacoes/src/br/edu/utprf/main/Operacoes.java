
package br.edu.utprf.main;

public class Operacoes {
    
    private int num1;
    private int num2;
    
    //metodo cosntrutor padrão
    public Operacoes(){
        
    }
    //método construtor inicializável
    public Operacoes(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    //acessores (get) e modificadores (set)
    
    public void setNum1(int num1){
        if(num1 >=0){
            this.num1 = num1;
        }
        
    }
    
    public int getNum1(){
        return num1;
    }
    
    public void setNum2(int num2){
        this.num2 = num2;
    }
    
    public int getNum2(){
        return num2;
    }
    
    public int somar(){
        return num1 + num2; 
    }
    
    public int subtrair(){
        return num1 - num2;
    }
    
    public int multiplicar(){
        return num1 * num2;
    }
    
    public double dividir(){
        if(num2 != 0){
            return (double)num1 / num2;
        }
        return 0;
    }
    
    @Override
    public String toString(){
        return "Número 1: " + num1 + "\nNúmero 2: " + num2;
    }
}