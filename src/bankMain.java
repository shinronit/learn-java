public class bankMain {
    public static void main(String[] args) {
        Bank b = new Bank();//("12121212",9999,"CJ","cj@shinmails.com","9129121212")
        b.setPhoneNumber("1212121212");
        b.setEmail("Cj@shinmails.com");
        b.setCustomerName("ModedAp");
        b.setBalance(9999);
        b.setAccountNumber("8289138123818912");

        System.out.println("Account Name " + b.getCustomerName());
        System.out.println("Account Number : " + b.getAccountNumber());
        System.out.println("Balance " + b.getBalance());
        System.out.println("Phone Number : " + b.getphoneNumber());
        System.out.println("Email  : " + b.getEmail());
    }
}
