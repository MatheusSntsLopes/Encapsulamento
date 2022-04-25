public class TesteConta {
    public static void main(String[]args){
        ContaCorrente conta = new ContaCorrente("2334", "2332", true, 500, 233, 222, -10);

        System.out.println("Saldo da conta " + conta.getNumero() + "= " + conta.getSaldo());
        
        boolean saqueEfetuado = conta.realizarSaque(10);
        if (saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        } else {
            System.out.println("Não foi possivel realizar saque, Saldo insuficiente");
        }

        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("Tentativa de saque de 500 reais");
        if (saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        } else {
            System.out.println("Não foi possivel realizar saque, Saldo insuficiente");
        }
        
        System.out.println("Deposito de 500 reais");
        conta.depositar(500);
        conta.consultarSaldo();

        if(conta.verificarUsoChequeEspecial()){
            System.out.println("Esta usando cheque especial");
        } else{
            System.out.println("Não esta usando cheque especial");
        }
        conta.realizarSaque(600);
        conta.consultarSaldo();
        if(conta.verificarUsoChequeEspecial()){
            System.out.println("Esta usando cheque especial");
        } else{
            System.out.println("Não esta usando cheque especial");
        }
    }
}
