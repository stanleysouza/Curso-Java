package fundamentos;

public class Wrappers {
	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("10000");
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		System.out.println(l/3);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c);
		System.out.println(c.toString().toUpperCase());
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		

	}
}
