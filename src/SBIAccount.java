import java.util.UUID;

public class SBIAccount implements BankAccountInterface{


    private String name;
    private String accountNo;
    private String IFSCCode;
    private String password;
    double balance;

    final double rateIfInterest= 6.2;

    final  String IFSC = "SBI374873";

    public SBIAccount() {
    }

    public SBIAccount(String name, String password, double balance) {
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
            return "Your Balance is "+ this.balance;
        }
        return  "Incorrect Password !!";
    }

    @Override
    public String addMoney(double amount) {

        this.balance += amount;
        return "Amount Added Successfully. New Balance is "+ this.balance;
    }

    @Override
    public String withdrawMoney(double amount, String password) {
      if(this.password.equals(password))
      {
          if(this.balance < amount)
          {
              return "Insufficient Balance !!";
          }
          else
          {
              this.balance -= amount;
              return "Amount Deducted Successfully. New Balance is "+ this.balance;
          }
      }

      return "Incorrect Password !!";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword))
        {
            this.password = newPassword;
            return "Password Change Successfully !!";
        }
        return "Incorrect Password !!";
    }

    @Override
    public double calculateInterest(int year)
    {
        return (this.balance*year*rateIfInterest)/100.0;
    }

    @Override
    public String toString() {
        return "SBIAccount{" +
                "name='" + name + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", IFSCCode='" + IFSCCode + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", rateIfInterest=" + rateIfInterest +
                ", IFSC='" + IFSC + '\'' +
                '}';
    }
}
