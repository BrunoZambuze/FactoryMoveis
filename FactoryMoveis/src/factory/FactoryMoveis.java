package factory;

import ExceptionMethod.NaoSuportadaException;
import entidades.cadeiras.Cadeira;
import entidades.cadeiras.Moderno;
import entidades.sofas.Sofa;

public interface FactoryMoveis {

    abstract Cadeira CriarCadeiraModerno(String cor, Double tamanho, String material);
    abstract Cadeira CriarCadeiraArteDeco(String cor, Double tamanho, String material);
    abstract Cadeira CriarCadeiraVitoriano(String cor, Double tamanho, String material);
    abstract Sofa CriarSofaArteDeco(String cor, Double tamanho, String material);
    abstract Sofa CriarSofaModerno(String cor, Double tamanho, String material);

}
