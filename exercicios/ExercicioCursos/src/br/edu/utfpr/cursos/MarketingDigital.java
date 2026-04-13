package br.edu.utfpr.cursos;

public class MarketingDigital extends Cursos {
    private String plataforma;
    private double precoMatDidatico;
    private double precoCertificado;
    private double precoFixoCurso;
    
    public MarketingDigital(){
    
    }
    
    public MarketingDigital(String titulo, String instrutor, int duracaoHoras, String plataforma, 
            double precoMatDidatico, double precoCertificado, double precoFixoCurso ){
        super(titulo, instrutor, duracaoHoras);
        this.plataforma = plataforma;
        this.precoMatDidatico = precoMatDidatico;
        this.precoCertificado = precoCertificado;
        this.precoFixoCurso = precoFixoCurso;
    }
    
    public void setPlataforma(String plataforma){
        this.plataforma = plataforma;
    }
    
    public String getPlataforma(){
        return plataforma;
    }
    
    public void setPrecoMatDidatico(double precoMatDidatico){
        this.precoMatDidatico = precoMatDidatico;
    }
    
    public double getPrecoMatDidatico(){
        return precoMatDidatico;
    }
    
    public void setPrecoCertificado(double precoCertificado){
        this.precoCertificado = precoCertificado;
    }
    
    public double getPrecoCertificado(){
        return precoCertificado;
    }
    
    public void setPrecoFixoCurso(double precoFixoCurso){
        this.precoFixoCurso = precoFixoCurso;
    }
    
    public double getPrecoFixoCurso(){
        return precoFixoCurso;
    }

    @Override
    public double calcularCustoTotal() {
        return getPrecoMatDidatico() + getPrecoCertificado() + getPrecoFixoCurso();
    }
    
    public String toString(){
        return super.toString() + "\nPlataforma: " + getPlataforma() + "/nPreço do material: " + getPrecoMatDidatico()
                + "\nPreço Fixo: " + getPrecoFixoCurso() + "\nPreço do Certificado: " + getPrecoCertificado();
    }
    
}
