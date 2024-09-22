package entidades.cadeiras;

import interfaces.ICadeira;

public abstract class Cadeira implements ICadeira {

    private String cor;
    private Double tamanho;
    private String material;

    public Cadeira(String cor, Double tamanho, String material){
        this.cor = cor;
        this.tamanho = tamanho;
        this.material = material;
    }

    public String getCor(){
        return this.cor;
    }

    public Double getTamanho(){
        return this.tamanho;
    }

    public String getMaterial(){
        return this.material;
    }

    public abstract String getInfoCadeira();

}
