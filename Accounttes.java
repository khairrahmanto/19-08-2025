public class Accounttes {
    public static void main(String[] args){
        Savingaccount sa0001 = new Savingaccount();
        sa0001.balance = 1000;
        sa0001.name = "Khair";
        sa0001.interestRate = 0.02;
        Savingaccount sa0002 = new Savingaccount();
        sa0002.balance = 2000;
        sa0002.name = "Bill";

        sa0001.displayCustomer();
        sa0002.displayCustomer();
    }//end method main
    

}
