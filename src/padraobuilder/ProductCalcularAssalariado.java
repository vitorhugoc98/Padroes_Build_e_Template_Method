package padraobuilder;
public class ProductCalcularAssalariado extends ConcreteBuilderCalcularSalario{
    
    private int taxaAssalariado = 20; 
    
    @Override
    public float calcularDescontos(float salarioBruto) {
        super.salarioFinal = salarioBruto - (super.calcularDescontos(salarioBruto) * this.taxaAssalariado)/100;
        return super.salarioFinal;
    }
    public int getTaxaAssalariado() {
        return taxaAssalariado;
    }
    public void setTaxaAssalariado(int taxaAssalariado) {
        this.taxaAssalariado = taxaAssalariado;
    }
 }
