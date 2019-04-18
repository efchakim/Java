/**
 * A class to test the BankAccount class modules.
 * @author Diana Hakim
 */
class Main {
  double balance;
  double monthlyfee;
  int transactions_counter = 0;
  int transactions_number = 2;
  double transactions_fee = 1.00;
     /**
     * Sets the fee that will be taken away with every withdraw or deposit
     * @param init_fee represents the new fee. 
     */
    public void setfee(double init_fee) {  
        transactions_fee = init_fee;}
     /**
     * Sets the number of free transactions. 
     * @param init_ntransactions int number of free transactions
     */
    public void settransactions(int init_ntransactions) { 
        transactions_number = init_ntransactions;}
      /**
     * Creates a zero balance bank account.
     */
    public void account() { // if nothing is (here)
        balance = 0;    
        }
    
     /**
     * Creates a bank account with the given balance.
     * @param initBalance [or given balance] equals bank balance.
     */
    /*public void account(double initBalance) { // if a double is (here) 
        balance = initBalance;
        }*/
    public double account(double initBalance) { 
    balance = initBalance;
    return balance;
    }
    /**
     * return the current balance in bank account.
     * @return current bank balance
     */
    public double getBalance() {
        return balance;
    }
    /**
     * Transfers money from one account to another
     * Format example: John.transfer(Jane, 101.1) 
     * Jane gains 101.1, whereas John decreases 101.1 in their balance.  
     * @param that other bank account
     * @param amount double amount transfered to other bank account. 
     */
    public void transfer(Main that, double amount) { 
    this.balance -= amount; // take away from this.balance
    that.balance += amount; // add to that.balance
    }
        /**
     * Compute fee for the previous month, and reset free transactions 
     */
    public void deductMonthlyCharge() {
      // counter = Math.max(counter, ntransactions);
      monthlyfee = (transactions_counter - transactions_number) * transactions_fee;
      monthlyfee = Math.max(monthlyfee, 0);
      //System.out.println(monthlyfee);
      balance -= monthlyfee; // compute new balance
      System.out.println("With transaction fee, your balance is now: $"+ balance);
      transactions_counter = 0; // reset counter for new month
    }
         /**
     * Adds interest at the given rate to balance
     * @param rate represents the percent of interest
     */
    public void addInterest(double rate) {
       balance += (balance*rate)/100; }
    /**
     * Deposits money into the bank balance.
     * @param amount is the amount added to bank balance.
     */
    public void deposit(double amount) {
        transactions_counter += 1;
        //System.out.println(counter+". Deposit"); //
        balance += (amount);}
    /**
     * Withdraws money into the bank balance.
     * @param amount is the amount subtracted from bank balance.
     */
    public void withdraw(double amount) {
        if (balance <= amount){ // if cannot afford withdraw
            String err = "Cannot complete withdraw, insufficient funds. Your balance is: $ ";
            System.out.println(err + balance); // print string
        }
        else {transactions_counter += 1; 
              balance -= (amount);
            //System.out.println(counter+". Withdraw"); //
            //counter = Math.max(counter, ntransactions);
        }}
    public static void main(String[] args) {

        // Title "Balance History of momsSavings:"
        // create momsSavings bank acount
        Main momsSavings = new Main();
        System.out.println("\nMomsSavings:");
        double x = momsSavings.account(1000.001);
        System.out.println("$ "+momsSavings.getBalance());
        momsSavings.deposit(10.001);
        System.out.println("$ "+momsSavings.getBalance());
        momsSavings.withdraw(10.001);
        System.out.println("$ "+momsSavings.getBalance());
        momsSavings.withdraw(1010.001);
        momsSavings.deposit(3.1);
        System.out.println("$ "+momsSavings.getBalance());
        System.out.print("New Month: ");
        momsSavings.deductMonthlyCharge();
        
        System.out.println("\nDadsSavings:");
        Main dadsSavings = new Main();
        System.out.println("$ "+dadsSavings.getBalance());
        
        System.out.println("\nTransfer Balance");
        momsSavings.transfer(dadsSavings, 700);
        System.out.println("MomsSavings:"); // loses 700 
        System.out.println("$ "+momsSavings.getBalance());
        System.out.println("\nDadsSavings:"); // gains 700
        System.out.println("$ "+dadsSavings.getBalance());
    }
}
