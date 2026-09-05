public class TallerArreglos {
    public static void main(String[] args) {
        String[]productos={"arroz","leche","pan","huevos"};
        int[]codigo={245,108,245,731};
        int[]cantidad={40,15,20,30};
        String mensaje= determinarCantidadMayor(productos, cantidad);
        System.out.println(mensaje);
        String resultado= mostrarConsoantes(productos);
        System.out.println(resultado);
        String nombreMayor=mayorLonguitud(productos);
        System.out.println(nombreMayor);
        String respuesta= contarVocales(productos);
        System.out.println(respuesta);
        
    }
    public static String determinarCantidadMayor(String[]productos, int []cantidad){
        int cantidadMayor=cantidad[0];
        String mensaje="el producto con mayor cantidades es:"+"\n";
        int posicion=0;
        for(int i=0; i<cantidad.length; i++){
            if(cantidad[i]>cantidadMayor){
                cantidadMayor=cantidad[i];
                posicion=i;
            }
        }
        mensaje+=productos[posicion];
        return mensaje;

    }
    public static String mostrarConsoantes(String[]productos){
        String resultado="";
        
        for(int i=0; i<productos.length; i++){
            char letra= productos[i].charAt(0);
            if(letra!='a' && letra!='e'&& letra!='i'&& letra!='0'&& letra!='u'){
                resultado+=productos[i]+"\n";
            }
        }
        return"los productos con consonantes son:"+"\n"+ resultado;
    

    }
    public static String mayorLonguitud(String[]productos){
        String nombreMayor=productos[0];

        for(int i=0; i<productos.length;i++){
            if(productos[i].length()>nombreMayor.length()){
                nombreMayor=productos[i]+"\n";

            }


        }
        
        return "el producto con mayor longuitud es:"+"\n"+nombreMayor;


    }
    public static String contarVocales(String[]productos){
        
        String respuesta="estos productos tienen la siguiente cantidad de vocales"+"\n";


        for(int i=0; i<productos.length; i++){
            int contadorVocales=0;
            for(int p=0; p<productos[i].length(); p++){

            char letraa=productos[i].charAt(p);
            if(letraa=='a'|| letraa=='e'|| letraa=='i'||letraa=='o'|| letraa=='u'){
                contadorVocales++;

            }



        }
        respuesta+=productos[i]+"="+contadorVocales+"\n";
        
    }
    
    return respuesta;
    
}
}    