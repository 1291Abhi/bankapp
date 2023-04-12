import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //features
        //1-bank account creation
        //2-withdraw balance
        //3-add balance
        //4-check balance
        Scanner sc=new Scanner(System.in);
        SBIBank sbiAccount=new SBIBank(1000,"Abhinesh Singh","abhi12345");

        sbiAccount.addMoney(500);
        System.out.println(sbiAccount.checkBalance());
        if(!sbiAccount.withdrawMoney(2000))
            System.out.println("Minimum balance exceeded");
        else
            System.out.println("Balance withdraw successfully");
        SBIBank sbiAccount2=new SBIBank();
        sbiAccount2.setName("Abhi");
        sbiAccount2.setPassword("abcd1234");


    }
}