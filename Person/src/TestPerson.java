public class TestPerson {

	public static void main(String[] args) {
		Person ram = new Person("Ram",30,9,1980);
		Person shyam = new Person("Shyam",1,8,1980);
		ram.display();
		shyam.display();
		shyam.olderOne(ram);
	}

}
