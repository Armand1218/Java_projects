class TestBankAccount {
    
    public static void main(String[] args) {

        BankAccount newPersonAccount = new BankAccount();
        newPersonAccount.depositMoney(1300, "savings");
        newPersonAccount.depositMoney(400, "checking");
        newPersonAccount.depositMoney(1200, "checking");
        newPersonAccount.newWithdrawal(900, "savings");
        newPersonAccount.newWithdrawal(600, "checking");

        BankAccount newPersonAccount2 = new BankAccount();
        newPersonAccount2.depositMoney(1500, "checking");
        newPersonAccount2.depositMoney(900, "savings");
        newPersonAccount.newWithdrawal(1400, "Checking");
        newPersonAccount.newWithdrawal(900, "Savings");
        newPersonAccount.newWithdrawal(10000, "Checking");

        System.out.println("-----newPersonAccount Balance-----");
        System.out.println("Checking " + newPersonAccount.getCheckingBalance());
        System.out.println("Savings " + newPersonAccount.getSavingsBalance());
        //newPersonAccount.displayAccountTotal();
        System.out.println("-----newPersonAccount2 Balance-----");
        System.out.println("Checking " + newPersonAccount2.getCheckingBalance());
        System.out.println("Savings " + newPersonAccount2.getSavingsBalance());
        //newPersAccount2.displayAccountTotal();
        System.out.println("-----Both Accounts Total-----");
        System.out.println(BankAccount.totalAmounts);
    }
}
