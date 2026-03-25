
package br.edu.utfpr.quadrilatero;

public class Quadrilatero {
    private int lado1;
    private int lado2;
    

    public Quadrilatero(){
    
    }
    
    public Quadrilatero(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public void setLado1(int lado1){
        this.lado1 = lado1;
    }
    
    public int getLado1(){
        return lado1;
    }
    
    public void setLado2(int lado2){
        this.lado2 = lado2;
    }
    
    public int getLado2(){
        return lado2;
    }
    
    public double getAreaPlana(){
        return (double)lado1 * lado2;
    }
    
    public int getPerimetro(){
        return (2 * lado1) + (2 * lado2);
    }
    
    public boolean isQuadrado(){
        return lado1 == lado2;
    }

    public boolean isRetangulo(){
        return lado1 != lado2;
    }

    public String toString(){
        return "Lado 1: " + lado1 + "\n\n" + "Lado 2: " + lado2;
    }
}

