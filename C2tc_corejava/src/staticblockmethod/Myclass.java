package staticblockmethod;

public class Myclass {
	private int section;
	private static int srNo;
	
	//staticBlock
	static {
		System.out.println("-----Within Static Block-----");
		srNo=1000;
	}
	
	Myclass(){
		System.out.println("----Within Default Constructor-----");
		srNo++;
		section++;
	}

	@Override
	public String toString() {
		return "MyClass [Serial No= " + srNo+ ", Section=" + section + "]";
	}
	
	//static method
	static void display() {
		System.out.println("SerialNo. "+ srNo);
	}
}
