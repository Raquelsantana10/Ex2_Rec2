package Controller;

public class OperacoesController {
	
	public OperacoesController() {
		super();
	}
	
	public String binario(int N) {
		//Condição de Parada: Quando o valor informado chegar á zero.
		if (N == 0) {
			return "";
		} else {
			int x = N % 2;
			N = N / 2;
			String s = String.valueOf(x);
			return binario(N) + s;//Retorna a função concatenando com o resto da divisão por 2, armazenado em "s";
		}
	}
}
