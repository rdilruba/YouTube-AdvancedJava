package accessmodifiers;

public class Eri�imTest {

	public static void main(String[] args) {
		
		Test testObjesi = new Test();
		
		System.out.println("Eri�ebildi�im de�i�kenler : " +
		testObjesi.d�z + " " + testObjesi.herkese + " " + testObjesi.korumal�);

		System.out.println("Gizli :" + testObjesi.getGizli());
	}

}
