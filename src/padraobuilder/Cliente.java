package padraobuilder;
public class Cliente {

    public static void main(String[] args) {
        String tipoColaboradorAssalariado = "Assalariado"; 
        float valorSalarioBrutoAssalariado = 1000;
        
        String tipoColaboradorComissionado = "Comissionado"; 
        float valorSalarioBrutoComissionado = 2000;
        
        BuilderCalcularSalario calcularSalario; 
        
        if(tipoColaboradorAssalariado.equals("Assalariado")){
           calcularSalario = new ProductCalcularAssalariado();
        }else{
            calcularSalario = new ProductCalcularComissionado();
        }
        
        Director diretor = new Director(calcularSalario);
        
        diretor.calcularSalario(tipoColaboradorAssalariado, valorSalarioBrutoAssalariado);
        diretor.calcularSalario(tipoColaboradorComissionado, valorSalarioBrutoComissionado);
    }
}
