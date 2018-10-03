import mx.com.sintelti.desafios.oporx.Solucion;

// Se implementa la interfas Solucion
public class Implementar implements Solucion {

    @Override
    public String convertir(String entrada) {

        String cadenaRetornada = null;
        int posicionInicioSubstring = 0;
        int totalDeLetrasO = 0;

        for(int i=1; i <= entrada.length(); i++){

            String letraSustraida=entrada.substring(posicionInicioSubstring,i);

            if(letraSustraida == "o" || letraSustraida == "O" ){

                totalDeLetrasO ++;

                for(int O=1; O <= totalDeLetrasO; O++ ){

                }
            }else{

            }

            posicionInicioSubstring ++;
        }
        return null;
    }
}
