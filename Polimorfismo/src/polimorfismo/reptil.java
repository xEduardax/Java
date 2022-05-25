package polimorfismo;
public class reptil extends Animal {
    private String corEscama;
    
    @Override
    public void Locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void Alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void EmitirSom() {
        System.out.println("Som de reptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
