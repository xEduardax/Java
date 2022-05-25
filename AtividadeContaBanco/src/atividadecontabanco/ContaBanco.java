package atividadecontabanco;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("-----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public ContaBanco(){   //método construtor 
        this.setSaldo(0); 
        this.setStatus(false);
    }
    
    public void setNumConta(int n){
            this.numConta = n;
    }
    
    public int getNumConta() {
        return this.numConta;
    }
   
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public String getTipo(){
        return this.tipo;
    }
            
    public void setDono(String d){
        this.dono = d;
    }
    
    public String getDono() {
        return this.dono;
    }
    
    public void setSaldo(float s){
            this.saldo = s;
    }
    
    public float getSaldo() {
        return this.saldo;
    }
    
    public void setStatus(boolean st){
        this.status = st;
    }
    
    public boolean getStatus() {
        return this.status;
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
             this.setSaldo(50);
        } else if (t == "CP"){
             this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
             System.out.println("Conta não pode ser fechada porque ainda tem dinheiro ");
        } else if (this.getSaldo() < 0){
             System.out.println("Conta não pode ser fechada pois tem débito");
        } else { 
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
   
    public void depositar( float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else { 
             System.out.println("Impossível depositar em uma conta fechada");
        }
    }
    
    public void sacar(float v) {
        if (this.getStatus()) {
             if (this.getSaldo() >= v) {
             this.setSaldo(this.getSaldo() - v);
             System.out.println("Saque realizado na conta de " + this.getDono());
             } else {
                System.out.println("Saldo insuficiente");
        }
        } else {
             System.out.println("Impossível sacar de uma conta fechada");
        }
    }

    public void pagarMensal(){
       int v = 0;     //variavel local
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossivel pagar uma conta fechada");
        }
    
    
    }      
}
