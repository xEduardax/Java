package desafioproposto;
public class DesafioProposto {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[2];
        
        p[0]=  new Pessoa (" Beatriz", 20, "Feminino");
        p[1] = new Pessoa (" Eduarda", 21, " Feminino");
        p[2] = new Pessoa (" Cauã", 14, "Masculino");
               
        l[0] = new Livro (" Percy Jackson", " Rick Riordan", 370, p[1]);
        l[1] = new Livro (" Orgulho e preconceito", " Jane Austen", 380, p[0]);
    
        l[0].abrir();
        l[0].folhear(200);
        System.out.println(l[0].detalhes());
    }
    
}
