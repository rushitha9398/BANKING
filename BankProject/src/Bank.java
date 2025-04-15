 import java.util.Scanner;
public class Bank {
	public static void main(String[]args) throws InterruptedException{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("choose the option");
		String continuechoice;
		
	do {
		System.out.println("//seclect an option------");
	      Thread.sleep(1000);
				
		System.out.println("withdraw amount 1");
		Thread.sleep(1000);
		System.out.println("deposit amount 2");
		Thread.sleep(1000);
		System.out.println("check balance 3");
		Thread.sleep(1000);
		int operation=sc.nextInt();
		switch(operation) {
		case 1:System.out.println("Enter the amount withdraw");
		double wa=sc.nextDouble();
		 Banking.withdraw(wa);
		 break;
		case 2:System.out.println("Enter deposit amount");
		double da =sc.nextDouble();
		Banking.deposit(da);
		case 3:System.out.println("display the current balance");
		Banking.checkBal();
		break;
		default:System.out.println("invalid option please enter correct option");
		 
		break;
		case 0:System.out.println("Thank you");
			
		}
		System.out.println("do you want to perform amount transaction?(y/n):");

         continuechoice=sc.next();
	}
	while(continuechoice.equalsIgnoreCase("Yes"));
	 System.out.println("Thank you for your banking system");
}
}