package polimorfismo;
public class Cachorro extends Mamifero {
    
    @Override
    public void EmitirSom() {
        System.out.println("Latindo");
    }

    public void enterrarOsso() {
        System.out.println("Enterrou o Osso");
    }
}
