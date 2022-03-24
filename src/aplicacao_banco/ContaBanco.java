package aplicacao_banco;

public class ContaBanco implements InterConta {
    
    private int numConta;
    private String cliente;
    protected String tipoConta;
    private double saldo;
    private boolean status;
    private String cpf;
    private static final int TAMANHO_CPF = 14;

    public ContaBanco(int numConta, String cliente, String tipoConta,String cpf) {
        this.numConta = numConta;
        this.cliente = cliente;
        this.tipoConta = tipoConta;
        this.cpf = cpf;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
       if(cpf.length() == TAMANHO_CPF){
        this.cpf = cpf;
        }
        else{
            System.out.println("CPF inválido");
    }   
    }
   
    @Override
    public void abrirConta(String t) {
         this.setTipoConta(t);
        this.setStatus(true);
        
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } 
        else if ("CP".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("CONTA ABERTA COM SUCESSO");
         }
    @Override
    public void fecharConta() {
         if (this.getSaldo() > 0) {
            System.out.println("Favor zerar a conta antes de fechar.");    
        } 
        else if (this.getSaldo() < 0){
            System.out.println("Favor pagar débito antes de fechar.");
        }
        else {
            this.setStatus(false);
            System.out.println("CONTA FECHADA COM SUCESSO");
    }}
    @Override
    public void sacar(double valor) {
        if (this.getStatus()){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado com successo!");
            }
            else {
                System.out.println("Saldo insuficiente!");
            }
            }
        else {
            System.out.println("Impossível sacar com a conta fechada!");
        }
        }    
    @Override
    public void depositar(double valor) { 
    if (this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado na conta de " + getCliente());
        }
        else {
            System.out.println("Impossível realizar deposito em conta fechada");
        }}      

    @Override
    public void pagarMensalidade(double valor) {
         valor = 0;
        if ("CC".equals(getTipoConta())) {
            valor=12.00;
        } else if ("CP".equals(getTipoConta())) {
            valor=20.00;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade paga com sucesso");
        }
        else {
            System.out.println("Impossivel pagar mensalidade com uma conta fechada");
        }
    }
    @Override
    public void statusConta() {
        
    }

    void abrirConta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
    

    
        
     
   
    

    

