//import java.util.*;
public class testAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scanner = new Scanner(System.in);
		Account nishad = new Account("Nishad",1000);
		System.out.println(nishad);
		int next = nishad.getNextAccountNumber();
		System.out.println(next);
		Account name = new Account("name");
		System.out.println(name);
		next = Account.getNextAccountNumber();
		System.out.println(next);
	}

}
