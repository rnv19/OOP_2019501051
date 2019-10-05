public class bankAccount {
    private String account;
    private double balance;
    


    public bankAccount(){
        this.account = account;
        this.balance = balance;
    }
}


public class checkingAccount extends bankAccount{
    private double limit;
    public checkingAccount(){
        this.limit = limit;
    }
}

public class savingAccount extends bankAccount{
}

public class certificateOfDeposit extends bankAccount{
}

public static void main(String args[]){
}