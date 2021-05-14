package accessmodifiers;

public class EriþimTest {

	public static void main(String[] args) {
		
		Test testObjesi = new Test();
		
		System.out.println("Eriþebildiðim deðiþkenler : " +
		testObjesi.düz + " " + testObjesi.herkese + " " + testObjesi.korumalý);

		System.out.println("Gizli :" + testObjesi.getGizli());
	}

}
