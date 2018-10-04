import mx.com.sintelti.desafios.oporx.Solucion;

public class Implementar implements Solucion { //Se implementa la interfaz Solucion

    @Override
    public String convertir(String entrada) { //Implementación del método convertir de la Interfaz Solución

        String cadenaRetornada = ""; //Crea una variable que sirve para almacenar una cadena de texto y retornar la misma, cuando se ejecute el método.
        int posicionInicioSubstring = 0; //Crea e inicializa una variable en 0. Que sirve como posición de inicio al momento de sustraer un carácter de una cadena de texto.
        int totalDeLetrasO = 0; //Crea e inicializa una variable en 0. Que sirve como contador de letras “O”

        for(int i=1; i <= entrada.length(); i++){ //Declaración del ciclo for, El cual se ejecutará dependiendo al total de caracteres de la cadena de entrada.

            String letraSustraida=entrada.substring(posicionInicioSubstring,i); //Sustrae un carácter de una cadena de texto y lo almacena en la variable letraSustraida.

            if(letraSustraida.equalsIgnoreCase("o")){ //Declara un if que compara la letra sustraída con el carácter “O” mayúscula o minúscula

                totalDeLetrasO ++; //Se incrementa la variable que funge como contador de letras O.
                String vareableX = ""; //Crea una variable que almacenara la cadena de X

                for(int O=0; O < totalDeLetrasO; O++ ){ //Declara un ciclo for para crear una cadena de letras X, dependiendo al total de letras O en una posición del texto.
                     vareableX =vareableX+"x"; //Concatena una letra X a la variableX dependiendo del total de letras O en una posición.
                } //Fin del ciclo for

                cadenaRetornada=cadenaRetornada+vareableX; //Concatena la cadena de letras X a la variable de retorno.

            }else{ //Declaración del else que se ejecuta si la condición del if no se cumple.
               cadenaRetornada=cadenaRetornada+letraSustraida; //Concatenación de la letra sustraída a la variable de retorno.
            } //Fin del if y else
            posicionInicioSubstring ++; //Incremento de la variable de posición de inicio del Substring.
        } //Fin del ciclo for
        return cadenaRetornada; //Retorno de una variable.
    } // Fin del método convertir
} // Fin de la clase Implementar
