package aplicacao_banco;
public class ContaPoupanca extends ContaBanco {

    public ContaPoupanca(int numConta, String cliente, String tipoConta, String cpf) {
        super(numConta, cliente, tipoConta, cpf);
    }

    @Override
    public void statusConta(){
        System.out.println("DADOS DA SUA CONTA POUPANÇA");
        System.out.println("Número da conta: "+getNumConta());
        System.out.println("Titular: "+getCliente());
        System.out.println("Saldo: "+getSaldo());
        System.out.println("Valor da mensalidade: R$20,00. ");
   
    }
    
}
