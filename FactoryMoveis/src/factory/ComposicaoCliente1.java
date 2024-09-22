package factory;

import ExceptionMethod.NaoSuportadaException;
import entidades.cadeiras.Cadeira;
import entidades.cadeiras.Moderno;
import entidades.sofas.ArteDeco;
import entidades.sofas.Sofa;

public class ComposicaoCliente1 implements FactoryMoveis{

    @Override
    public Cadeira CriarCadeiraModerno(String cor, Double tamanho, String material){
        return new entidades.cadeiras.Moderno(cor, tamanho, material);
                //Precisei especificar o caminho da classe Moderno pois tanto a cadeira quanto o sofa possuem uma classe com o mesmo nome. Poderia trocar? Sim...
                //mas mantive para seguir o diagrama.
    }

    @Override
    public Sofa CriarSofaArteDeco(String cor, Double tamanho, String material){
        return new entidades.sofas.ArteDeco(cor, tamanho, material);
    }

    @Override
    public Cadeira CriarCadeiraArteDeco(String cor, Double tamanho, String material){
        return new entidades.cadeiras.ArteDeco(cor, tamanho, material);
    }

    @Override
    public Cadeira CriarCadeiraVitoriano(String cor, Double tamanho, String material){
        return new entidades.cadeiras.Vitoriano(cor, tamanho, material);
    }

    //No diagrama não tem esse método "CriarSofaModerno", a única coisa que pensei foi em lançar um Exceção. Optei por utilizar a classe RunTimeException pois
    //como RunTime é uma exceção não-checada, eu não preciso colocar na assinatura da interface para ele lançar uma exceção utilizando o "throws". Diferente do
    //Exception, onde eu teria que lançar uma exceção em TODOS os métodos, mesmo se eles não forem utilizados.
    @Override
    public Sofa CriarSofaModerno(String cor, Double tamanho, String material){
        throw new NaoSuportadaException("Essa operação não é suportada para a classe ComposicaoCliente1!");
    }

}
