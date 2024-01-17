public class Persona {
    private String nombre;
    private String apellido;
    
    public Persona(){
        this.nombre="";
        this.apellido="";
    }

    public String getApellido() {
        return apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
