import java.util.UUID;

public class HDFCAccount implements BankAccountInterface{

    private String name;
   private String accountNo;
   private String IFSCCode;
   private String password;
    double balance;

    final double rateIfInterest= 7.1;

    final  String IFSC = "HDFC374873";

   //default constructor
    public HDFCAccount()
    {

    }
    //parameterised Constructor
    public HDFCAccount(String name, String password, double balance)
    {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    public void setIFSCCode(String IFSCCode) {
        this.IFSCCode = IFSCCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateIfInterest() {
        return rateIfInterest;
    }

    public String getIFSC() {
        return IFSC;
    }

    @Override
    public String fetchBalance(String password) {
   if(this.password.equals(password))
   {
       return "Your Balance Is:" + this.balance;
   }
   return "Incorrect Password";
    }

    @Override
    public String addMoney(double amount) {
        this.balance += amount;
        return "Amount Added Successfully. New Balance Is:" + this.balance;
    }

    @Override
    public String withdrawMoney(double amount, String password) {
    if(this.password.equals(password))
    {
     if(this.balance < amount)
    {
      return "Insufficient Balance";
    }
         this.balance =amount;
         return  "Amount Deducted Successfully. New Balance:"+ this.balance;
    }
    return "Incorrect Password";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword))
        {
           this.password = newPassword;
            return "Password Changed Successfully";
        }
        return "Incorrect Original Password";
    }

    @Override
    public double calculateInterest(int year) {
        return (this.balance*year*rateIfInterest)/100.0;
    }

    @Override
    public String toString() {
        return "HDFCAccount{" +
                "name='" + name + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", rateIfInterest=" + rateIfInterest +
                ", IFSC='" + IFSC + '\'' +
                '}';

    }
}
