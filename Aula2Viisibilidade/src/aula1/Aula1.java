package aula1;
public class Aula1 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = true;    //não da pq esse atributo está como privado. Ex caixa
        c1.tampar();            // consigo tampar a caneta mesmo o atributo estando privado pq o método tampar está publico. Ex caixa.
        c1.status();
        c1.rabiscar();
        
    
    }
    
  }
