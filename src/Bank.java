public interface Bank {
    int checkBalance(); //to check the balance remaining in the account

    boolean addMoney(int money);//to add money in the account

    boolean withdrawMoney(int money); //money to be withdraw

    int getROI();// rate of interest

    int totalInterest(int loanAmount, int time);//total amount of interest

}
