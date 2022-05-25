package polimorfismo;
public class Polimorfismo {
    public static void main(String[] args) {
    
     //Animal a1 = new Animal(); // como animal é uma classe abstrata, não pode instanciar objetos
    
     Mamifero m = new Mamifero();
     reptil r = new reptil();
     Peixe p = new Peixe();
     Aves a = new Aves();
     Canguru c = new Canguru();
     Cachorro k = new Cachorro();
     Cobra n = new Cobra();
     Tartaruga t = new Tartaruga();
     Goldfish g = new Goldfish();
     Arara ar = new Arara();
     
     /*m.Locomover();
     r.Locomover();
     p.Locomover();
     a.Locomover();
     c.Locomover();
     k.Locomover();
     k.EmitirSom();
     c.EmitirSom();*/
    
    /*m.Locomover();
    k.Locomover();
    c.Locomover();*/
    
    r.Locomover();
    t.Locomover();
    
    
    }
    
   
    
   

    



}
