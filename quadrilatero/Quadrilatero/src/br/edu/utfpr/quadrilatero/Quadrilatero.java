
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
    
    public double areaQuadrilatero(){
        return (double)lado1 * lado2;
    }
    
    public int perimetroQuadrilatero(){
        return (2 * lado1) + (2 * lado2);
    }
    
    public boolean isQuadrado(){
        if(lado1 == lado2){
            
        }
    }
}
