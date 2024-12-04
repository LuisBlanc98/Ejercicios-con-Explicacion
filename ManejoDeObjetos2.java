public class ManejoDeObjetos2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Persona p1= new Persona();
        p1.edad=20;
        p1.nombre="luis";

        Persona p2= new Persona();
        p2.edad=15;
        p2.nombre="catalina";

        System.out.println(p1.edad);
        System.out.println(p1.nombre);

        //es un array
        //llevara corchetes
        //Person [] milista= new Persona[] {p1,p2};
        Persona[] lista = new Persona[2];
        lista[0]=p1;
        lista[1]=p2;
        int suma=0;
        for (int i=0;i<lista.length;i++) {

            System.out.println(lista[i].edad);
            System.out.println(lista[i].nombre);
            suma=suma+lista[i].edad;

        System.out.println("********");
        System.out.println(suma);
        

        }
    }
}
