package padraobuilder;
public class Director {
    
    private String tipoColaborador; 
    private float salarioBruto; 
    
    private BuilderCalcularSalario calcularSalario; 

    public Director(BuilderCalcularSalario calcularSalario) {
        this.calcularSalario = calcularSalario;
    }
    
    public void calcularSalario(String tipoColaborador, float salarioBruto){
        this.tipoColaborador = tipoColaborador; 
        this.salarioBruto = salarioBruto;
        
        if(this.tipoColaborador.equals("Assalariado")){
            calcularSalario.calcularDescontos(salarioBruto); 
            System.out.println("Salario final do Assalariado: "+calcularSalario.calcularSalarioFinal(salarioBruto));
        }else {
            calcularSalario.calcularComissao(salarioBruto); 
            calcularSalario.calcularDescontos(salarioBruto); 
            System.out.println("Salario final do Comissionado: "+calcularSalario.calcularSalarioFinal(salarioBruto));
        }
    }

    public String getTipoColaborador() {
        return tipoColaborador;
    }

    public void setTipoColaborador(String tipoColaborador) {
        this.tipoColaborador = tipoColaborador;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }


}
