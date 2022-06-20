

public class User{
  private String userName;
  private int password;
  private double balance;

  public User(String userName, int password){
    this.userName = userName;
    this.password = password;
  } 

  public User(String userName, int password, double balance) {
    this.userName = userName;
    this.password = password;
    this.balance = balance;
  }

  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }
  public int getPassword() {
    return password;
  }
  public void setPassword(int password) {
    this.password = password;
  }
  public double getBalance() {
    return balance;
  }
  public void setBalance(double balance) {
    this.balance = balance;
  }
}