
package br.edu.utfpr.imc;


public class Imc {
    private double peso;
    private double altura;
    
    public Imc(){
    
    };
    
    public Imc(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }
    
    public void setPeso (double peso){
        this.peso = peso;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public double getImcCalculado(){
        return peso/(altura * altura);
    }
    
    public String verificarEstadoImc(){
        
        double imc = getImcCalculado();
        
        if(imc >= 0 && imc <20){
            return "Magro";
        } if (imc >= 20 && imc < 25){
            return "Normal";
        } if(imc >= 25 && imc < 29){
            return "Acima do peso";
        } if(imc >=29 && imc <= 34){
            return "Obeso";
        } if (imc > 34){
            return "Muito obeso";
        }
        return null;
    }
    
    @Override
    public String toString() {
        return "Seu IMC é: " + getImcCalculado() + " e você está " + verificarEstadoImc();
    }
}
