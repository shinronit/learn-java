public class Bank {
    private String customerName;
    private double balance;
    private String accountNumber;
    private String email;
    private String phoneNumber;

    public Bank(){
        this("56789",00,"name","email"," number");
        System.out.println("Empty Constructer called");
    }
    public Bank(String number, double balance,String customerName, String email, String phoneNumber){
        System.out.println("Account Parameters called");
        this.phoneNumber = phoneNumber;
        this.accountNumber = number;
        this.email = email;
        this.customerName = customerName;
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getphoneNumber(){
        return this.phoneNumber;
    }
    public String getEmail(){
        return this.email;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void withdrawFunds(int balanceToWithdraw){
        double i = getBalance();
        if(i<balanceToWithdraw){
            System.out.println("Insufficient funds");
        }else {
            i -= balanceToWithdraw;
            System.out.println("Withdraw successfull : " + balanceToWithdraw);
            System.out.println("Balance left " + i);
            this.balance = i;
        }
    }
    public void depositFunds(int fundsToDeposit){
        double i = getBalance();
        i += fundsToDeposit;
        System.out.println("Funds deposited successfully : " + fundsToDeposit);
        System.out.println("Balance left : " + i);
        this.balance = i;
    }
}
