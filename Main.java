import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main {
   
    public static void main(String[] args) {
    
        ArrayList<Persona> personas=new ArrayList<>();
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        Persona persona5 = new Persona();

      
        persona1.setNombre("Facundo");
        persona2.setNombre("Roberto");
        persona3.setNombre("Pablo");
        persona4.setNombre("Agustin");
        persona5.setNombre("German");
        persona5.setApellido("Ramiro");
        persona1.setApellido("Ramirez");
        persona2.setApellido("Garcia");
        persona3.setApellido("Morales");
        persona4.setApellido("Moreyra");
        persona5.setApellido("Cadelago");

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);
        
    
      
    
       Collections.sort(personas, new Comparator<Persona>() {
        @Override
        public int compare(Persona p1, Persona p2) {
            return new String(p1.getApellido()).compareTo(new String(p2.getApellido()));
        }
    });
    System.out.println("Ordenado por Apellido");
    for(int i=0;i<personas.size();i++){
        System.out.println("Apellido: "+personas.get(i).getApellido()+" Nombre: "+personas.get(i).getNombre());
    }




    System.out.println("Ordenado por Nombre");
    Collections.sort(personas, new Comparator<Persona>() {
        @Override
        public int compare(Persona p1, Persona p2) {
            return new String(p1.getNombre()).compareTo(new String(p2.getNombre()));
        }
    });
    for(int i=0;i<personas.size();i++){
        System.out.println("Apellido: "+personas.get(i).getApellido()+" Nombre: "+personas.get(i).getNombre());
    }
         
       }





        
    }

