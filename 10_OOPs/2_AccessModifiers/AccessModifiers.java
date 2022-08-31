class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "shivam123ortan";
        // myAcc.password = "abcd"; --> This is wrong

        myAcc.setPassword("abcd");
    }    
}
