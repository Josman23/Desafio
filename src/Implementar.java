import mx.com.sintelti.desafios.oporx.Solucion;

// Se implementa la interfas Solucion
public class Implementar implements Solucion {

    @Override
    public String convertir(String entrada) {

        String cadenaRetornada=null;
        int posicionInicio=0;

        for(int i=1; i <= entrada.length(); i++){

            String letraSustraida=entrada.substring(posicionInicio,i);

            if(letraSustraida == "o" || letraSustraida == "O" ){

            }else{

            }

            posicionInicio ++;
        }
        return null;
    }
}
