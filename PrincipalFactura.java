public class PrincipalFactura {

public static void main(String[] args) {
        
        Factura1 f= new Factura1();
        f.importe=100;
        System.out.println(f.importe);
        System.out.println(f.calcularConIVA(100));
        System.out.println(f.calcularSoloIVA(100));
                        
   }

}
             