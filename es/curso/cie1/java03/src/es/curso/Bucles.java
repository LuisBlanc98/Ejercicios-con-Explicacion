package es.curso.cie1.java03.src.es.curso;

public class Bucles {
//tipos basicos en minuscula (byte int double float boolean)
//los demas en mayuscula
    public static void main(String[] args) {
        
        String cadena="hola que tal estas";
    int contador=0;
    for (int i=0;i<cadena.length();i++) {
    char letra=cadena.charAt(i);
    if (letra=='a') {
    System.out.println(letra);
    contador++;
    }
}
    System.out.println(contador);
    }
    }
 

