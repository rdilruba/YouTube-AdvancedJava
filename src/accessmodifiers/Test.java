package accessmodifiers;

public class Test {

	public String herkese = "public de�i�ken";
	protected String korumal� = "protected de�i�ken";
	String d�z = "default de�i�ken";
	private String gizli = "private de�i�ken";
	
	
	public String getGizli() {
		return this.gizli;
	}
	
	public static void main(String[] args) {
		
		Test testObjesi = new Test();
		
		System.out.println("Eri�ebildi�im de�i�kenler : " + testObjesi.gizli +
		testObjesi.d�z + " " + testObjesi.herkese + " " + testObjesi.korumal�);

	}
}
