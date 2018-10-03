
public class Main {

    public static void main(String[] args){

        String entrada = "Hola Mundo.";  // Creamos una variable que contiene la cadena de entrada.

        Implementar implementa= new Implementar(); //Se crea una Instancia de la clase Implementar
        String mensajeRetornado = implementa.convertir(entrada); //
        System.out.println(mensajeRetornado);
    }
}
