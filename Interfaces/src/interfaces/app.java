package interfaces;

public class app {

    public static void main(String[] args) {
            
        Perro per = new Perro();
        per.mostrarTipoDeAnimal();
        per.mostrarVida();
        String nombre = per.mostrarNombre();
        
        System.out.println(nombre);
        
    }
    
}
