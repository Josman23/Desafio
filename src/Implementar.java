import mx.com.sintelti.desafios.oporx.Solucion;

public class Implementar implements Solucion { //Se implementa la interfaz Solucion

    @Override
    public String convertir(String entrada) { //Implementación del método convertir de la Interfaz Solución

        String cadenaRetornada = "", vareableX = ""; //Crea una variable que sirve para almacenar una cadena de texto y retornar la misma, cuando se ejecute el método.

        for(int i=1; i <= entrada.length(); i++){ //Declaración del ciclo for, El cual se ejecutará dependiendo al total de caracteres de la cadena de entrada.

          String  letraSustraida=entrada.substring(i-1,i); //Sustrae un carácter de una cadena de texto y lo almacena en la variable letraSustraida.

            if(letraSustraida.equalsIgnoreCase("o")){ //Declara un if que compara la letra sustraída con el carácter “O” mayúscula o minúscula

                vareableX =vareableX+"x"; //Concatena una letra X a la variableX dependiendo del total de letras O en una posición.
                cadenaRetornada=cadenaRetornada+vareableX; //Concatena la cadena de letras X a la variable de retorno.

            }else{ //Declaración del else que se ejecuta si la condición del if no se cumple.
                cadenaRetornada=cadenaRetornada+letraSustraida; //Concatenación de la letra sustraída a la variable de retorno.
            } //Fin del if y else

        } //Fin del ciclo for
        return cadenaRetornada; //Retorno de una variable.
    } // Fin del método convertir
} // Fin de la clase Implementar