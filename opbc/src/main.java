public class main {
    public static void main(String[] args) {

        //objeto persona
        Persona persona = new Persona();

        persona.setEdad(22);
        int edad = persona.getEdad();
        System.out.println("Edad: " + edad);

        persona.setNombre("Arnoldo Magaña");
        String nombre = persona.getNombre();
        System.out.println("Nombre: "+nombre);

        persona.setTelefono("31211110000");
        String telefono = persona.getTelefono();
        System.out.println("Telefono: "+telefono);
    }
}

class Persona{

    // variables privadas
    private int edad;
    private String nombre;
    private String telefono; 

    // set y get de edad
    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    //set y get de nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    //set y get de telefono
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }

}
