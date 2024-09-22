package factory;

import ExceptionMethod.NaoSuportadaException;
import entidades.cadeiras.Cadeira;
import entidades.sofas.Sofa;

public class ComposicaoCliente2 implements FactoryMoveis{

    @Override
    public Cadeira CriarCadeiraModerno(String cor, Double tamanho, String material){
        throw new NaoSuportadaException("Essa operação não é suportada para a classe ComposicaoCliente2!");
    }

    @Override
    public Sofa CriarSofaArteDeco(String cor, Double tamanho, String material){
        throw new NaoSuportadaException("Essa operação não é suportada para a classe ComposicaoCliente2!");
    }

    @Override
    public Cadeira CriarCadeiraArteDeco(String cor, Double tamanho, String material){
        throw new NaoSuportadaException("Essa operação não é suportada para a classe ComposicaoCliente2!");
    }

    @Override
    public Cadeira CriarCadeiraVitoriano(String cor, Double tamanho, String material){
        return new entidades.cadeiras.Vitoriano(cor, tamanho, material);
    }

    @Override
    public Sofa CriarSofaModerno(String cor, Double tamanho, String material){
        return new entidades.sofas.Moderno(cor, tamanho, material);
    }

}
