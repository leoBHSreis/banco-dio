package aplicacao_banco;


public class ContaCorrente extends ContaBanco {

    public ContaCorrente(int numConta, String cliente, String tipoConta, String cpf) {
        super(numConta, cliente, tipoConta, cpf);
    }
@Override
    public void statusConta(){
        System.out.println("DADOS DA SUA CONTA CORRENTE");
        System.out.println("Número da conta: "+getNumConta());
        System.out.println("Titular: "+getCliente());
        System.out.println("Saldo: "+getSaldo());
        System.out.println("Valor da mensalidade: R$12,00. ");
}
 
    
    
    }
   
    
   
   

    

