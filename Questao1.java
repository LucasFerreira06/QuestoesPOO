import java.util.Scanner;

public class Questao1 {
	public static void main (String[] args) {
	Scanner valor = new Scanner(System.in);
	System.out.print("Digite o peso:");
	float peso = valor.nextFloat();
	System.out.print("Digite a altura:");
	float altura = valor.nextFloat();
	float imc = peso/(altura*altura);
	System.out.print("Seu IMC é de:" + imc);
	}
}