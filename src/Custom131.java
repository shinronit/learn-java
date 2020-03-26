public class Custom131 {
    public static void main (String[] args) {
        int walletBalance = 0;
        int hiddenWalletBalance = walletBalance;
        int plyerRank = 1;
        if (plyerRank==1){
            System.out.println("Rs 3000 has been awarded to your account.");
            walletBalance += 3000;
            hiddenWalletBalance = walletBalance;
        }
        if (walletBalance!=hiddenWalletBalance){
            System.out.println("Error regarding your wallet please check later");
            System.exit(0);

        }
    }
}
