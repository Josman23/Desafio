
public class Main {

    public static void main(String[] args){

        String entrada = "Hola Mundo colima.";  // Crea una variable que contiene la cadena de entrada.

        Implementar implementa= new Implementar(); //Crea una Instancia de la clase Implementar
        String mensajeRetornado = implementa.convertir(entrada); //
        System.out.println(mensajeRetornado); //Imprime en pantalla el mensaje retornado por el método convertir.
    }
}
