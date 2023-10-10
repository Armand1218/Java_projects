class BankAccount {
    private double checkingBalance;
    private double savingsBalance;

    public static int allAccounts = 0;
    public static double totalAmounts = 0;
    public static String accountNumber;

    public BankAccount() {
        BankAccount.allAccounts += 1;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
    }

    public void depositMoney(double amount, String account) {
        if (account == "checking") {
            this.checkingBalance += amount;
        }
        else {
            this.savingsBalance += amount;
        }
        this.totalAmounts += amount;
    }

    public void newWithdrawal(double amount, String account) {
        if (account == "checking") {
            if(amount > this.checkingBalance) {
                System.out.println("Insufficient amount, you can't withdraw any money.");
                return;
            }
            this.checkingBalance -= amount;
        }
        else {
            if(amount > this.savingsBalance) {
                System.out.println("Insufficient amount, you can't withdraw any money.");
                return;
            }
            this.savingsBalance -= amount;
        }
        this.totalAmounts -= amount;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }
}