package polimorfismo;
public class Canguru extends Mamifero {
 
    @Override
    public void Locomover() {
        System.out.println("Saltando");
    }

    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }
}
