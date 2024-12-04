package es.curso.cie1.java03.src.es.curso;

public class Cadena3 {
    public static void main(String[] args) {
        
    String cadena="hola que x tal estas";
    int contador=0;
    
    //Lo de abajo significa: para que cuente desde el primer valor;que tenga la longitud de la cadena; y cuente de uno en uno
    for (int i=0;i<cadena.length();i++) {

        // si el valor que quiero sacar de la cadena es x
        if (cadena.charAt(i)=='x') {

            //variables bucles if funciones arrays
        //imprimeme el valor de la cadena; imprimeme la posicion de ese valor 
        System.out.println(cadena.charAt(i));
        System.out.println(contador++);
    }
    contador++;
    }
    }
}

