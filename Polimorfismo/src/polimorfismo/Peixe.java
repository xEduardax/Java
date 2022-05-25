package polimorfismo;
public class Peixe extends Animal {
    private String corEscama;
    
    @Override
    public void Locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void Alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void EmitirSom() {
        System.out.println("Peixe não faz som");
    }
    
    public void SoltarBolha() {
        System.out.println("Soltou uma bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
