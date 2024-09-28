import java.util.Scanner;

public class contadorfluxo {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro:");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro:");
		int parametroDois = terminal.nextInt();
		
		terminal.close();

		try {
			
			contar(parametroUm, parametroDois);
		
		}catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws Exception {
		if (parametroUm > parametroDois) {	
			throw new Exception("O segundo parâmetro deve ser maior que o primeiro!");
		}
		
		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
		
	}
}
