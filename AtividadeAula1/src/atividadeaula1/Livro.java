package atividadeaula1;
public class Livro {
    String nome;
    String autor;
    int ano;
    boolean lendo;
    void status() {
            System.out.println("Livro: " + this.nome);
            System.out.println("Autor " + this.autor);
            System.out.println("Ano " + this.ano);
            System.out.println("Está folheando? " + this.lendo);
    }
    
    void ler () {
        if (lendo == false) {
             System.out.println("Não estou lendo");
        } else {
             System.out.println ("Eu estou lendo, leave me alone");
        }
    }
    
    
    
    void folhear() {
        this.lendo = true;
    }
    
    void fechar () {
        this.lendo = false;
    }

}
