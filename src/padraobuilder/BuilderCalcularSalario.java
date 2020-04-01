package padraobuilder;
public abstract class BuilderCalcularSalario {
    
    public abstract float calcularDescontos(float salarioBruto);
    public abstract float calcularComissao(float salarioBruto);
    public abstract float calcularSalarioFinal(float salarioBruto);
}
