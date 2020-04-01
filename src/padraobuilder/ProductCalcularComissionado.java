package padraobuilder;
public class ProductCalcularComissionado extends ConcreteBuilderCalcularSalario{

    @Override
    public float calcularComissao(float salarioBruto) {
        this.salarioFinal = salarioBruto + (salarioBruto * this.porcetagemComissaoBasica)/100;
        return this.salarioFinal; 
    }
}
