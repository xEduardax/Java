package heranca02;
public class Heranca02 {
    public static void main(String[] args) {
       //Pessoa p1 = new Pessoa(); não pode pq a classe é abstrata 
       /*Visitante v1 = new Visitante();
       v1.setNome("Beatriz");
       v1.setIdade(20);
       v1.setSexo("F");
       System.out.println(v1.toString());*/
    
     /* Aluno a1 = new Aluno();
      a1.setNome("Claudio");
      a1.setMatricula(1111);
      a1.setCurso("Informatica");
      a1.setIdade(16);
      a1.setSexo("M");
      a1.pagarMensalidade();
      System.out.println(a1.toString());*/
    
      Bolsista b1 = new Bolsista();
      b1.setMatricula(1215);
      b1.setNome("Jubileu");
      b1.setBolsa(12);
      b1.setSexo("M");
      b1.setIdade(16);
      b1.pagarMensalidade();
      System.out.println(b1.toString());
    
      /*Professor p1 = new Professor();
      p1.setNome("Roberto");
      p1.setEspecialidade("Professor de História");
      p1.receberAumento();
      System.out.println(p1.toString());*/
      
     /*Tecnico t1 = new Tecnico();
     t1.setNome("Clovis");
     t1.praticar();*/
    }
    
}
