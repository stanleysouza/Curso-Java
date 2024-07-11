package excecao;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {

		
		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());;// TODO: handle exception
		}
		try {
			geraErro2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}
		
		System.out.println("Fim :)");
	}
	
	//não checada ou nao verificadada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}
	//checada ou verificada
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro bem legal #02!");
	}
}
