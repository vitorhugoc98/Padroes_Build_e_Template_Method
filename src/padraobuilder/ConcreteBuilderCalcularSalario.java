package padraobuilder;
public class ConcreteBuilderCalcularSalario extends BuilderCalcularSalario{
    
    private int  taxaBasica = 10; 
    protected int porcetagemComissaoBasica = 20; 
    protected float salarioFinal;
    
    public float calcularDescontos(float salarioBruto){
        this.salarioFinal = salarioBruto - (salarioBruto * this.taxaBasica)/100;
        return this.salarioFinal;  
    }
    
    public float calcularComissao(float salarioBruto){
        return this.salarioFinal;
    }
    
    public float calcularSalarioFinal(float salarioBruto){
        this.salarioFinal = salarioBruto - calcularDescontos(salarioBruto);
        return this.salarioFinal;
    }

    public float getTaxaBasica() {
        return taxaBasica;
    }

    public void setTaxaBasica(int taxaBasica) {
        this.taxaBasica = taxaBasica;
    }

    public int getPorcetagemComissaoBasica() {
        return porcetagemComissaoBasica;
    }

    public void setPorcetagemComissaoBasica(int porcetagemComissaoBasica) {
        this.porcetagemComissaoBasica = porcetagemComissaoBasica;
    }
}
