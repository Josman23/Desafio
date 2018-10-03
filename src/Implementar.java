import mx.com.sintelti.desafios.oporx.Solucion;

// Se implementa la interfas Solucion
public class Implementar implements Solucion {

    @Override
    public String convertir(String entrada) {

        String cadenaRetornada = "";
        int posicionInicioSubstring = 0;
        int totalDeLetrasO = 0;

        for(int i=1; i <= entrada.length(); i++){

            String letraSustraida=entrada.substring(posicionInicioSubstring,i);

            if(letraSustraida.equalsIgnoreCase("o")){

                String vareableX = "";

                for(int O=0; O <= totalDeLetrasO; O++ ){
                     vareableX =vareableX+"x";
                }

                cadenaRetornada=cadenaRetornada+vareableX;
                totalDeLetrasO ++;

            }else{
               cadenaRetornada=cadenaRetornada+letraSustraida;
            }
            posicionInicioSubstring ++;
        }
        return cadenaRetornada;
    }
}
