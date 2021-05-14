package accessmodifiers;

public class Test {

	public String herkese = "public deðiþken";
	protected String korumalý = "protected deðiþken";
	String düz = "default deðiþken";
	private String gizli = "private deðiþken";
	
	
	public String getGizli() {
		return this.gizli;
	}
	
	public static void main(String[] args) {
		
		Test testObjesi = new Test();
		
		System.out.println("Eriþebildiðim deðiþkenler : " + testObjesi.gizli +
		testObjesi.düz + " " + testObjesi.herkese + " " + testObjesi.korumalý);

	}
}
