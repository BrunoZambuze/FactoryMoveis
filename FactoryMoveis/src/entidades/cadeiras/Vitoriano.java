package entidades.cadeiras;

public class Vitoriano extends Cadeira{

    private static final String MODELO_CADEIRA = "Vitoriano";

    public Vitoriano(String cor, Double tamanho, String material){
        super(cor, tamanho, material);
    }

    @Override
    public String getInfoCadeira(){
        return String.format("Tipo: %s \n Cor: %s \n Tamanho: %f \n Material: %s", this.MODELO_CADEIRA, super.getCor(), super.getTamanho(), super.getMaterial());
    }

}
