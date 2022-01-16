package Creation_client_class;

 abstract class Account {


    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public int getAccount_number() {
        return Account_number;
    }

    public void setAccount_number(int account_number) {
        Account_number = account_number;
    }

    public Client getFirst() {
        return first;
    }

    public void setFirst(Client first) {
        this.first = first;
    }

    protected String Label;
    protected int Balance;
    protected int Account_number;
    Client first;


    public Account(String label, Client Premier, int Acc_number) {


        this.Label = label;
        this.first = Premier;
        this.Account_number = Acc_number;

    }

    public String toString() {
        return this.getLabel() + " " + this.getBalance() + " " + this.getAccount_number() + this.getFirst();
    }
}
