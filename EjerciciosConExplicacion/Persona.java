package EjerciciosConExplicacion;

//la funcion constructora nos permite inicializar el objeto con unas propiedades concretas
//boton derecho--> accion codigo fuente -->getter and setter. Luego: boton derecho-->accion codigo fuente-->generate
//constructors
public class Persona {

    private String nombre;
    private int edad;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

}

