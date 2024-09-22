package entidades.cadeiras;

public class ArteDeco extends Cadeira{

    private static final String MODELO_CADEIRA = "ArteDeco";

    public ArteDeco(String cor, Double tamanho, String material){
        super(cor, tamanho, material);
    }

    @Override
    public String getInfoCadeira(){
        return String.format("Tipo: %s \n Cor: %s \n Tamanho: %f \n Material: %s", this.MODELO_CADEIRA, super.getCor(), super.getTamanho(), super.getMaterial());
    }

}
