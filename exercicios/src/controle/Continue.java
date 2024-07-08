package controle;

public class Continue {
	public static void main(String[] args) {
		for(int i = 0; i <100000; i++) {
			if(i % 7 == 1) {
				continue;
			}
			System.out.println(i);
		}
	}
}
