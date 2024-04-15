// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //HDFC
//     HDFCAccount HrishiAcc = new HDFCAccount("Hrishi", "Hrishi@123" , 2000);
//
//        System.out.println(HrishiAcc); //printed the attributes via String
//
//        //fetch balance
//        System.out.println(HrishiAcc.fetchBalance("random")); // wrong password
//        System.out.println(HrishiAcc.fetchBalance("Hrishi@123")); // Correct password
//
//        //add money
//        System.out.println(HrishiAcc.addMoney(100000));
//
//        //withdraw
//        System.out.println(HrishiAcc.withdrawMoney(200000,"Hrishi@123"));
//        System.out.println(HrishiAcc.withdrawMoney(50000,"Hrishi@123"));
//        System.out.println(HrishiAcc.withdrawMoney(50000,"Hrishi@111"));
//
//        //changePassword
//        System.out.println(HrishiAcc.changePassword("Hrishi@123","Neha@123"));
//        System.out.println(HrishiAcc.fetchBalance("Neha@123"));
//
//        //calculate Interest
//        System.out.println("Interest for 5 years on current balance will be"+ HrishiAcc.calculateInterest(5));


        //SBI

        SBIAccount nehaAcc = new SBIAccount("Neha", "Neha@12", 5000);
        System.out.println(nehaAcc);


        //fetch balance
        System.out.println(nehaAcc.fetchBalance("random"));
        System.out.println(nehaAcc.fetchBalance("Neha@12"));

        //add money
        System.out.println(nehaAcc.addMoney(100000));

        //withdraw
        System.out.println(nehaAcc.withdrawMoney(200000,"Neha@12"));
        System.out.println(nehaAcc.withdrawMoney(5000,"Neha@12"));
        System.out.println(nehaAcc.withdrawMoney(50000,"Hrishi@111"));

        //changePassword
        System.out.println(nehaAcc.changePassword("Neha@12","Hrisha@123"));
        System.out.println(nehaAcc.fetchBalance("Hrisha@123"));


        //calculate Interest
       System.out.println("Interest for 5 years on current balance will be "+ nehaAcc.calculateInterest(5));
        }
    }
