package pl.stalostech.structural.composite;

public class Main {

	public static void main(String[] args) {

		Employee ceo = new Ceo();
		
		Employee manager1 = new Manager();
		Employee manager2 = new Manager();
		Employee manager3 = new Manager();
		
		Developer dev1 = new Developer();
		Developer dev2 = new Developer();
		Developer dev3 = new Developer();
		Developer dev4 = new Developer();
		
		ceo.add(manager1);
		ceo.add(manager2);
		ceo.add(manager3);
		
		manager1.add(dev1);
		manager1.add(dev2);
		
		manager2.add(dev3);
		
		manager3.add(dev4);
		
		print("", ceo);
	}
	
	public static void print(String space, Employee e) {
		System.out.println(space + e);
		for (Employee emp : e.getEmployees()) {
			print(space + " ", emp);
		}
	}
	
}
