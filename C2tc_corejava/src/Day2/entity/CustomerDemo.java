package Day2.entity;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		c1.setCid(1);
		c2.setCid(2);
		c3.setCid(3);
		c1.setCname("Priyaa");
		c2.setCname("Kavishri");
		c3.setCname("Malarvizhi");
		c1.setCity("puducherry");
		c2.setCity("puducherry");
		c3.setCity("puducherry");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
