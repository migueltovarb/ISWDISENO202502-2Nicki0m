package account;

public class ProgramaAccount {

    public static void main(String[] args) {

        Account account1 = new Account("AC019", "NICOL");
        Account account2 = new Account("AC020", "SOFIA", 500);

        System.out.println("ESTADO INICIAL");
        System.out.println(account1);
        System.out.println(account2);

        System.out.println("\nDepositando 300 a account 1 ");
        account1.credit(300); // amount = 300
        System.out.println(account1);

        System.out.println("\nRetirando 100 de account 1 ");
        account1.debit(100); // amount = 100
        System.out.println(account1);

        // Intentar retirar más de lo que hay
        System.out.println("\nIntentando retirar 500 ");
        account1.debit(500);
        System.out.println(account1);

        // Transferir de account2 a account1
        System.out.println("\nTransfiriendo 200 de account2 a account1 ");
        account2.transferTo(account1, 200); // amount = 200
        System.out.println(account1);
        System.out.println(account2);

        // Transferir más de lo que hay
        System.out.println("\nIntentando transferir 1000 desde account 2 ");
        account2.transferTo(account1, 1000); 
        System.out.println(account1);
        System.out.println(account2);
    }
}
