import java.util.Scanner;

public class AtmProject {

	public static void main(String[] args) {
		int pin = 2486;
		int balance = 26875;

		int debit = 0;
		int credit = 0;

		String name;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter your Pin number : ");
		int password = s.nextInt();

		if (password == pin) {
			System.out.println("Enter Your Name");
			name = s.next();
			System.out.println("Hello Mr/Ms - " + name);

			while (true) {
				System.out.println("Press 1 to Check your balance");
				System.out.println("Press 2 to credit amount");
				System.out.println("Press 3 to debit amount");
				System.out.println("Press 4 to take your receipt");
				System.out.println("Press 5 to Exit");

				int option = s.nextInt();
				switch (option) {
				case 1:
					System.out.println("Your Current Balance :" + balance);
					break;
				case 2:
					System.out.println("How much amount you credit your account?");
					credit = s.nextInt();
					System.out.println("Successfully your amount Credited");
					balance = credit + balance;
					break;
				case 3:
					System.out.println("How much amount you want?" );
					debit = s.nextInt();
					if (debit > balance)

						System.out.println("you have insufficient balance, check your account balance");
					else
						System.out.println("Take your Amount !");
					balance = balance - debit;
					break;
				case 4:
					System.out.println("Thanks for Visiting Axis Bank");
					System.out.println("Your debited Amount :" + debit);
					System.out.println("Your Credited Amount :" + credit);
					System.out.println("And Your Current Account Balance is :" + balance);
					break;

				}
				if (option == 5) {
					System.out.println("ThankYou..!");
					break;
				}
			}

		} else {
			System.out.println("your Password is Wrong");
		}

	}

}
