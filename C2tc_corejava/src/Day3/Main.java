package Day3;

public class Main {
	public static void main(String[] args) {
        // Create Student object
        Student s = new Student();

        // Create Commission object using constructor
        Commission emp = new Commission("Priyaa", "Puducherry", "45678909876", 93000);

        System.out.println("Name : " + emp.getName());
        System.out.println("Address : " + emp.getAddress());
        System.out.println("Phone : " + emp.getPhone());
        System.out.println("Sales Amount : Rs " + emp.getSalesAmount());

        emp.setSalesAmount(96000);
        System.out.println("Updated Sales Amount : Rs " + emp.getSalesAmount());
    }

}
