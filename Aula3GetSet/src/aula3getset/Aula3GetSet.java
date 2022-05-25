
package aula3getset;
public class Aula3GetSet {
    public static void main(String[] args) {
      Caneta C1 = new Caneta("NIC", "Amarelo", 0.4f);  //Aqui eu to usando o método construtor para ja usar uma caneta default
      C1.status();
      Caneta C2 = new Caneta ("Faber", "Laranja", 1.5f);
      C2.status();
      
     /*C1.setModelo("BIC");
      C1.modelo = "BIC";   //Esse pode fazer a mudança direto pq o atributo está público
     
      C1.setPonta(0.5f);
      //C1.ponta = "BIC";   //Esse não pode fazer a mudança pq o atributo é privado 
      C1.status();
    
      System.out.println("Tenho uma caneta " + C1.getModelo() + " de ponta " + C1.getPonta());*/
    
    
    
    }
    
}
