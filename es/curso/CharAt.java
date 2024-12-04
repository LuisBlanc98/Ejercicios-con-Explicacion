package es.curso;
public class CharAt {

    public static void main(String[] args) {
        
        String cadena1= "hola";
        for (int i=0;i<cadena1. length();i++) {

            System.out.println(cadena1.charAt(i));
        }
   
        for (int i=cadena1.length()-1;i>-1;i--) {

            System.out.println(cadena1.charAt(i));
   
    }
}
}
