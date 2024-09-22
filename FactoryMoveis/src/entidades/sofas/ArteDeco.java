package entidades.sofas;

public class ArteDeco extends Sofa{

    private static final String MODELO_SOFA = "ArteDeco";

    public ArteDeco(String cor, Double tamanho, String material){
        super(cor, tamanho, material);
    }

    @Override
    public String getInfoSofa(){
        return String.format("Tipo: %s \n Cor: %s \n Tamanho: %f \n Material: %s", this.MODELO_SOFA, super.getCor(), super.getTamanho(), super.getMaterial());
    }

}
