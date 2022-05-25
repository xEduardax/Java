package polimorfismo;
public class Aves extends Animal {
    private String corPena;
    
    @Override
    public void Locomover() {
        System.out.println("Voando");
    }

    @Override
    public void Alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void EmitirSom() {
        System.out.println("Som de ave");
    }
    
    public void fazerNinho() {
        System.out.println("Construiu um ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
    
}
