package aula1;
public class Aula1 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor ="Azul";
        c1.ponta = 0.5f;      //Aqui é um atributo
        c1.tampar();
        c1.rabiscar();
        c1.status();          //Aqui é chamando o método status  
    
        Caneta c2 = new Caneta();    //criando outro objeto, outra caneta
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    
    
    }
    
  }
