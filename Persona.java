public class Persona {
    String nombre;
    int edad;
    //Métodos
    Persona(){
        //System.out.println("Estoy creando una persona");
        nombre ="Anónimo/a";
        edad=-1;
    }
    Persona (String n, int e) {
        nombre = n;
        edad = e;
    }
    String saluda(){
        return "Hola soy "+nombre+" y tengo "+edad;
    }
    boolean esMayorEdad(){
        boolean resultado = false;
        if(edad>=18){
            resultado = true;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "SOY Persona--<" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ">--";
    }
}
