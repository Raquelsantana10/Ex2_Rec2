package Controller;

public class OperacoesController {
	
	public OperacoesController() {
		super();
	}
	
	public String binario(int N) {
		//Condi��o de Parada: Quando o valor informado chegar � zero.
		if (N == 0) {
			return "";
		} else {
			int x = N % 2;
			N = N / 2;
			String s = String.valueOf(x);
			return binario(N) + s;//Retorna a fun��o concatenando com o resto da divis�o por 2, armazenado em "s";
		}
	}
}
