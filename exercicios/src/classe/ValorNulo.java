package classe;

public class ValorNulo {
	public static void main(String[] args) {
		
		String s1 = "";
		System.out.print(s1.concat("!!!!"));
		
		String s2 = Math.random() > 0.5 ? "Opa" : null;
		if(s2 != null) {
			System.out.print(s2.concat("????"));
		}
		
	}
}
