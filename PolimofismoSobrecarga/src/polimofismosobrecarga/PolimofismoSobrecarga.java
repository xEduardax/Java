package polimofismosobrecarga;
public class PolimofismoSobrecarga {
    public static void main(String[] args) {
        //Animal x = new Animal(); // não vai deixar pq é classe abstrata
        Cachorro c = new Cachorro();
        
        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
    
}
