package programa;

import entidades.Conta;
import entidades.ContaCorrente;
import entidades.Poupança;

public class Principal {

    public static void main(String[] args){

        Conta x = new ContaCorrente(001,"Bob", 200.0,0.0);
        Conta y = new Poupança(002,"Ana",400,1);
        x.sacar(200);
        y.sacar(250);

        System.out.println(x);
        System.out.println(y);

        /*ContaCorrente cc = new ContaCorrente(001, "Bob", 200.0, 0.0);

          //UPCASTING
          Conta acc1 = cc;
          Conta acc02 = new ContaCorrent(002, "Maria" ,300.0 ,200.0);
          Conta acc03 = new Poupança(003, "Ana",400,1)
          //DOWCASTING cc2 = (ContaCorrente) acc02
          cc2.emprestimo(200);
          System.out.println(cc2);
          Poupança p1 = (Poupança) acc03
          p1.aplicarRendimento()
          System.out.println(p1)

          if(cc2 instanceof ContaCorrente){
              ContaCorrente cc3 = (ContaCorrente) cc2;
              cc3.emprestimo(200.0);
              System.out.println("Emprestimo concedito! Saldo: " + cc3.getSaldo());
              //cc3.sacar(200.0);
              System.out.println("Valor sacado: " + cc3.sacar(200.0));
              System.out.println(cc3);
            }

            if(acc03 instanceof Poupança){
                Poupança cp = (Poupança) acc03;
                System.out.println(cp);
                cp.aplicarRendimento();
                System.out.println("Saldo com rendimento: " + cp.getSaldo());
                System.out.println("Valor sacado: " + cp.scar(200.0));
            }*/

            /*ContaCorrente contaCorrente = new ContaCorrente(001, "Carlos" , 500);
            contaCorrente.depositar(1000);
            System.out.println(contaCorrente);
            contaCorrentes.sacar(500);
            System.out.println(contaCorrente);

            Poupança poupança = new Poupança(002, "Maria", 100, 10);
            System.out.println(poupança);
            poupança.aplicarRendimento();
            System.out.println(poupança); */
    }
}
