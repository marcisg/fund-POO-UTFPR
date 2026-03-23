
package br.edu.utfpr.imc;


public class Imc {
    private float peso;
    private float altura;
    
    public Imc(){
    
    };
    
    public Imc(float peso, float altura){
        this.peso = peso;
        this.altura = altura;
    }
    
    public void setPeso (float peso){
        this.peso = peso;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public float getAltura(){
        return altura;
    }
    
    public float getImcCalculado(){
        return peso/(altura * altura);
    }
    
    public String verificarEstadoImc(){
        
        float imc = getImcCalculado();
        
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
