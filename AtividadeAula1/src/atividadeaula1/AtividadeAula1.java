package atividadeaula1;
public class AtividadeAula1 {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.nome = "Percy Jackson";
        l1.ano = 2012;
        l1.autor = "Rick Riordan";
        l1.folhear();
        l1.ler();
        l1.status();
        
        Livro l2 = new Livro();
        l2.nome = "Harry Potter";
        l2.ano = 1998;
        l2.autor = "J.K Rowling";
        l1.fechar();
        l2.ler();
        l2.status();
        
    }
        
        
        
    }
    



