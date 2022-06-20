
import java.util.ArrayList;
import java.util.Scanner;


public class Atm {
  private User user;
  private ArrayList<User> users = new ArrayList();
  int userIndex;

  public Atm() {
    users.add(new User("X", 123, 500));
    users.add(new User("Y", 456, 1000));
    
  }

  public ArrayList<User> getUsers(){
    return users;
  }
  public void setUsers(ArrayList<User> users) {
    this.users = users;
  }

  private boolean  isLogin = false;
  public boolean isLogin() {
    return isLogin();
  }
  public void setLogin(boolean isLogin) {
    this.isLogin = isLogin;
  }

  public Atm(User user) {
    this.user = user;
  }
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
  public void login(User user) {
    boolean userNameFalse = true;
    boolean passwordFalse = true;

    while(userNameFalse) {
      System.out.println("Kullanıcı Adı: ");
			Scanner inputcard = new Scanner(System.in);
			String userName = inputcard.nextLine();

      for(int i = 0; i < users.size(); i++) {
				if(users.get(i).getUserName().equals(userName)) { 
					userNameFalse = false;
					userIndex = i;
					break;  
        }
				else {
					userNameFalse = true;
				}
			}
			if(userNameFalse) {
				System.out.println("Kullanıcı sistemde bulunamadı! ");
			}
			  
    }
    while(passwordFalse) { 

			 System.out.println("PAROLA: ");
			 Scanner inputpass = new Scanner(System.in);
			 int password = inputpass.nextInt();
			 
			 for(int i = 0; i < users.size(); i++) {
					if(users.get(userIndex).getPassword() == password) {
						passwordFalse = false; 
						isLogin = true;
						break;
					}
					else {
						passwordFalse = true;
					}
			 }
       if(passwordFalse) { 
					System.out.println(" HATALI!");
			 }
    }
  }

  public void withdrawal() {  
		
		 if(isLogin) { 
			System.out.println("CEKİLECEK MİKTAR: ");
			Scanner input = new Scanner(System.in);
			double balance = input.nextDouble();
			
			if (balance < users.get(userIndex).getBalance()) {

				users.get(userIndex).setBalance(users.get(userIndex).getBalance() - balance);
				System.out.println("GUNCEL BAKIYE: " + users.get(userIndex).getBalance()+"\n");
			}else 
				System.out.println("Bakiye negatif olamaz !");
			
			}

	}

	public void Deposit() { 

		if (isLogin) {

	
		System.out.println("YATIRMAK ISTEDIGINIZ TUTAR: ");
		Scanner input  = new Scanner(System.in);
		double balance = input.nextDouble();
		
		this.users.get(userIndex).setBalance(this.users.get(userIndex).getBalance() + balance);
    System.out.println("Islem basarili \n");
		System.out.println("Güncel Bakiye: " + users.get(userIndex).getBalance()+"\n");
		
	    }
				
	}
			
	public void currentBalance() { 
		
		System.out.println("BAKIYE: " + this.users.get(userIndex).getBalance());
	}
	
	
	
	public void logout() {
		isLogin = false;
		System.out.println("CIKIS YAPILDI");
	}
	
}
