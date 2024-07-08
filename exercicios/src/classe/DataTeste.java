package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		//Data data1 = new Data();
		
		//data1.ano = 2023;
		//data1.mes = 8;
		//data1.dia = 1;
		
		Data d1 = new Data();
		System.out.println(d1.obterDataFormatada());
		
		Data d2 = new Data(19,8,2023);
		System.out.println(d2.obterDataFormatada());
	}
	
}
