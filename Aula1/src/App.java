
public class App {
    public static void main(String[] args) {
        
        // Criação do Objeto
        Conta conta1 = new Conta();
        Conta conta2 = new Conta(2, "José", 1000, 5000);
        
        //Utilização dos estados
        
        conta1.limite = 10000;
        conta1.saldo = 5000;
        conta1.nome = "João Gabriel";
        conta1.numero = 01;

        //Utilização do comportamento
        
        conta1.sacar(650);
    }
}
