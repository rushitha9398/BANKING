
public class Banking {

	static double cb=50000.00;
	static void checkBal() {
		System.out.println("current balance"+cb);
	}
	static void withdraw(double wa) {
		if(wa<=cb) {
			cb=cb-wa;
			System.out.println("successfully amount has withdraw");
			System.out.println("current balance:"+cb);
		}
		else {
			System.out.println("Insufficient funds-------");
		}
	}
	static void deposit(double da) {
		cb=cb+da;
		System.out.println("amount deposit"+da);
		System.out.println("current balance"+cb);
			
		}
	}
	


