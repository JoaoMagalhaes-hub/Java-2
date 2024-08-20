public class Conta {

        int numero;
        String nome;
        double saldo;
        double limite;
    
        public void sacar( double saldo){
            double novoSaldo = this.saldo - limite;
            this.saldo = novoSaldo;
        
        }
        public Conta(){
            System.out.println("Conta VAZIA criada.");

        }
        public Conta(int numero, String nome, double saldo, double limite) {
            this.numero = numero;
            this.nome = nome;
            this.saldo = saldo;
            this.limite = limite;
        }
    }

