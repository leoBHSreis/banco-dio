package aplicacao_banco;

public class Aplicacao_Banco {

    public static void main(String[] args) {
       ContaBanco c[] = new ContaBanco[3];
       c[0] = new ContaBanco(1,"João","CP","111.222.333-44");
       c[1] = new ContaBanco(2,"Maria","CC","222.333.444-55");
       c[2] = new ContaBanco(3,"José","CP","333.444.555-66");
       
       c[0].abrirConta();
       
        
    }
    
}
