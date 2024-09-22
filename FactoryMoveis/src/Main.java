import ExceptionMethod.NaoSuportadaException;
import factory.ComposicaoCliente1;
import factory.ComposicaoCliente2;
import factory.FactoryMoveis;
import entidades.cadeiras.Cadeira;

public class Main {
    public static void main(String[] args) {

        try {

            /*
                Faça um teste: Estamos utilizando a ComposicaoCliente2, ela irá lançar uma exceção caso tentamos criar uma cadeira moderna, porém
                se trocarmos para ComposiçãoCliente1, alterando somente o 2 pelo 1, o programa irá criar uma cadeira normalmente.
             */
            FactoryMoveis fabricaMoveis = new ComposicaoCliente1(); // <--- Troque 2 por 1
            Cadeira cadeira = fabricaMoveis.CriarCadeiraModerno("Marrom", 4.6, "madeira");
            System.out.println(cadeira.getInfoCadeira());

        } catch(NaoSuportadaException e){
            System.out.println(e.getMessage());
        }
    }
}