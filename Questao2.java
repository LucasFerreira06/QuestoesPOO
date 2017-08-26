import java.util.Scanner;

public class Questao2 {
	public static void main (String[] args) {
	Scanner valor = new Scanner(System.in);
	System.out.print("Digite o valor do produto:");
	float produto = valor.nextFloat();
	float desconto = produto - 0.07f;
	System.out.print("Seu desconto é de:" + desconto);
	}
}