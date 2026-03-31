/*
Atributos -> características do objeto (marca, modelo...)
Construtor -> define como o objeto é criado
Getter -> usado para 'pegar informação' (valores dos atributos)
Setter ?-> usado para 'alterar informação?' 
toString() -> 'mostrar o objeto na tela' no formato de texto
*/

package br.edu.utfpr.entidade;

public class Veiculo {

      // Atributos da classe (privados = encapsulamento)
    // Só podem ser acessados através de métodos (get e set)
    private String marca;
    private String modelo;
    private int velocidade;
    private int velocidadeMaxima;

    // Construtor padrão
    // É chamado quando criamos um objeto sem passar valores
    // Ex: Veiculo v = new Veiculo();
    public Veiculo() {

    }
    
    // Construtor com parâmetros (inicializável)
    // Permite criar o objeto já com valores definidos
    // Ex: Veiculo v = new Veiculo("Ford", "Fiesta", 0, 180);
    public Veiculo(String marca, String modelo, int velocidadeMaxima){
      this.marca = marca; // "this" indica o atributo da classe
      this.modelo = modelo;
      this.velocidade = 0;
      this.velocidadeMaxima = velocidadeMaxima;
    }

    // MÉTODOS GETTERS E SETTERS

    // Setter da marca
    // Serve para alterar o valor da marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter da marca
    // Serve para retornar (pegar) o valor da marca
    public String getMarca() {
        return marca;
    }

    // Setter do modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getter do modelo
    public String getModelo() {
        return modelo;
    }

    // Setter da velocidade
    // Define a velocidade atual do veículo
    //public void setVelocidade(int velocidade) {
    //    this.velocidade = velocidade;
    //}

    // Getter da velocidade
    public int getVelocidade() {
        return velocidade;
    }

    // Getter da velocidade máxima
    // Retorna o limite máximo de velocidade do veículo
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    // Setter da velocidade máxima
    // Define o limite máximo de velocidade do veículo
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    // Método toString()
    // Serve para exibir os dados do objeto em formato de texto
    // É chamado automaticamente quando usamos:
    // System.out.println(objeto);
    @Override
    public String toString(){
      return "Marca: " + marca 
              + "\nModelo: " + modelo
              + "\nVelocidade: " + velocidade
              + "\nVelocidade Máxima: " + velocidadeMaxima;
    }
    
     
    public boolean acelerar(int incremento){
        if(incremento <= 0 || velocidade >= velocidadeMaxima){
            return false;
        }
        
        if(velocidade + incremento > velocidadeMaxima){
            velocidade = velocidadeMaxima;
        }else {
            velocidade += incremento;
        }
        return true;
    }
    
    public boolean desacelerar (int decremento){
        if(decremento <= 0){
            return false;
        }
        
        if(velocidade <= 0){
            return false;
        }
        
        if(decremento >= velocidade){
            velocidade = 0;
        } else {
            velocidade -= decremento;
        }
        return true;
    }
    

}

