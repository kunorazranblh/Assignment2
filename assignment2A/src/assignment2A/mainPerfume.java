package assignment2A;

public class mainPerfume{
	
	public static void main(String[] args) {

     Perfume f = new Perfume("For Him", "For Her");

     PerfumeBrand b = new PerfumeBrand ("DKNY", "CK", "Victoria Secret", "Givenchy", "Bulgari", "Hugo Boss");
     
     

System.out.println("Type of Perfume: " + f.getForMan());
b.run();
System.out.println(b.getBrand1());

System.out.println(b.getBrand5());

System.out.println(b.getBrand6());
System.out.println("");

System.out.println("Type of Perfume: " + f.getForWoman());
b.run1();
System.out.println(b.getBrand1());

System.out.println(b.getBrand2());

System.out.println(b.getBrand3());

System.out.println(b.getBrand4());

System.out.println(b.getBrand5());
System.out.println("");

	}
}

