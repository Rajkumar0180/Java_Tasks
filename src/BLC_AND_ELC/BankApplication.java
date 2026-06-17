package BLC_AND_ELC;

public class BankApplication {

	public static void main(String[] args) {
		BankAccount var1=new BankAccount();
		
		var1.setnumber(123456789);
		var1.setName("Rajkumar");
		var1.setBalance(5000);
		
		System.out.println("AC NO : "+var1.getNum());
		System.out.println("AC Name : "+var1.getName());
		System.out.println("AC Bal : "+var1.getBalance());
		
		
		
		var1.setBalance(3000);
		System.out.println("-------------------------");
		System.out.println("Balance Updated");
		System.out.println("-------------------------");
		
		System.out.println("AC NO : "+var1.getNum());
		System.out.println("AC Name : "+var1.getName());
		System.out.println("AC Bal : "+var1.getBalance());

	}

}
