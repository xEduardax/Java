package polimorfismo;
public abstract class Animal {
    protected float peso;
    protected int idade, membros;
    
    public abstract void  Locomover();
    public abstract void Alimentar();
    public abstract void EmitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    
    
}
