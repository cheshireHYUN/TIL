package Exercise;

public class PlaneExample {
	public static void main(String[] args) {
		Plane plane1 = new Plane("º¸À×","º¸À× 747",450);
		System.out.println("Á¦Á¶»ç: "+plane1.getManufacture());
		System.out.println("¸ðµ¨¸í: "+plane1.getModel());
		System.out.println("ÃÖ´ë½Â°´¼ö: "+plane1.getMaxNumberOfPassengers());
		System.out.println();
		
		
		Plane plane2 = new Plane("º¸À×","º¸À× 777",500);
		System.out.println("Á¦Á¶»ç: "+plane2.getManufacture());
		System.out.println("¸ðµ¨¸í: "+plane2.getModel());
		System.out.println("ÃÖ´ë½Â°´¼ö: "+plane2.getMaxNumberOfPassengers());
		System.out.println();
		
		Plane plane3 = new Plane();
		plane3.setManufacture("·ÏÈ÷µå ¸¶Æ¾");
		plane3.setModel("F-22");
		plane3.setMaxNumberOfPassengers(-10);
		
		System.out.println("Á¦Á¶»ç: "+plane3.getManufacture());
		System.out.println("¸ðµ¨¸í: "+plane3.getModel());
		System.out.println("ÃÖ´ë½Â°´¼ö: "+plane3.getMaxNumberOfPassengers());
		System.out.println();
		
		System.out.println("»ý»êµÈ ºñÇà±âÀÇ ¼ö: "+Plane.getNumberOfPlanes());
		
		
	}
}
