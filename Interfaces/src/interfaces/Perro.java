
package interfaces;

/**
 *
 * @author sara
 */
public class Perro implements Animal, serVivo{

    @Override
    public void mostrarTipoDeAnimal() {
        System.out.println("soy un mamifero, perro");
    }

    @Override
    public String mostrarNombre() {
    
        return "tintin";
    }

    @Override
    public void mostrarVida() {
    
        System.out.println("estoy vivo y corro");
    }

  
   
    
    
}
