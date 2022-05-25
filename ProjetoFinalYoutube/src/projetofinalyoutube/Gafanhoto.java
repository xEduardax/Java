package projetofinalyoutube;
public class Gafanhoto extends Pessoa {
   private String login;
   private int totAssistindo;

    public Gafanhoto(String nome, int idade, String login) {
        super(nome, idade);
        this.login = login;
        this.totAssistindo = 0;
    }
   
     public void viuMaisUm() {
   
    }

     public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setToAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\nlogin=" + login + ", totAssistindo=" + totAssistindo + '}';
    }

   
}
