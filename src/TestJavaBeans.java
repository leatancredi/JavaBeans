
import domain.*;

public class TestJavaBeans {
    public static void main(String[] args) {
    PersonaBean  persona = new PersonaBean();
    //el objeto debe ser serializable ya que puede ser transferido.(ejemplo: de servidor a servidor)
    //transforma el objeto a bits, para poder enviarlos por la red.
    persona.setNombre("Juan");
    persona.setApellido("Perez");
        System.out.println("persona nombre: = " + persona.getNombre());
        System.out.println("persona apellido: = " + persona.getApellido());
        
}
         
}
