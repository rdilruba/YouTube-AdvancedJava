package accessmodifiers;

public class Test {

	public String herkese = "public degisken";
	protected String korumali = "protected degisken";
	String düz = "default degisken";
	private String gizli = "private degisken";
	
	
	public String getGizli() {
		return this.gizli;
	}
	
	public static void main(String[] args) {
		
		Test testObjesi = new Test();
		
		System.out.println("Erisebildigim degiskenler : " + testObjesi.gizli +
		testObjesi.düz + " " + testObjesi.herkese + " " + testObjesi.korumali);

	}
}
