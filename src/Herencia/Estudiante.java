package Herencia;

public class Estudiante extends Persona {

    private String NIA;

    public Estudiante(String nombre, int edad,String NIA) {
        super(nombre, edad);
        this.NIA=NIA;
    }

    public void setNIA(String NIA) {
        this.NIA = NIA;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEdad(int edad){
        super.setEdad(edad);
    }
    public String toString(){
        return ""+nombre+" "+getEdad()+" "+NIA;
    }
}
