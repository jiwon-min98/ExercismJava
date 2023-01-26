class BankAccount{
    private int balance = 0;
    private boolean isAccountOpen = false;

    public void open(){
        isAccountOpen = true;
    }
    public void close(){
        isAccountOpen = false;
    }

    public synchronized int getBalance() throws BankAccountActionInvalidException{
        checkIfAccountisNotClosed();
        return balance;
    }

    public synchronized void deposit(int amount) throws BankAccountActionInvalidException{
        checkIfAccountisNotClosed();
        checkIfAmountisPositive(amount);
        balance += amount;
    }

    public synchronized void withdraw(int amount) throws BankAccountActionInvalidException{
        checkIfAccountisNotClosed();
        checkIfAmountisPositive(amount);
        checkIfAccountIsNotEmpty();
        checkIfBalanceIsGreaterThenAmountToWithdraw(amount);
        balance -= amount;
    }

    private void checkIfAccountisNotClosed() throws BankAccountActionInvalidException{
        if (!isAccountOpen) throw new BankAccountActionInvalidException("Account closed");
    }

    private void checkIfAmountisPositive(int amount) throws BankAccountActionInvalidException{
        if (amount <0) throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
    }

    private void checkIfBalanceIsGreaterThenAmountToWithdraw(int amount) throws BankAccountActionInvalidException{
        if (balance < amount) throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
    }

    private void checkIfAccountIsNotEmpty() throws BankAccountActionInvalidException{
        if (balance == 0) throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
    }


}