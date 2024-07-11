package excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroNegativoForaIntervalo extends RuntimeException {

	private String nomeDoAtributo;

	public NumeroNegativoForaIntervalo (String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}

	public String getMessage() {
		return String.format("O Atributo '%s' está fora do intevalo", nomeDoAtributo);
	}
}
