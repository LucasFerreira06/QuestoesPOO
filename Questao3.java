import java.util.Scanner;

public class Questao3 {
	public static void main (String[] args) {
		Scanner valor = new Scanner(System.in);
		System.out.print("Digite o valor do produto:");
		float produto = valor.nextFloat();
		int opcaoDesconto;
		opcaoDesconto = 1;
		System.out.print("Você deseja adicionar desconto?:");
		float opcaoDesconto1 = valor.nextFloat();
		if(opcaoDesconto1 == 1) {
			System.out.print("Digite o valor do desconto:");
			float opcaoDesc1 = valor.nextFloat();
			float desconto = produto - opcaoDesc1;
			System.out.print("O valor do desconto é:" + desconto);
		}
		else if (opcaoDesconto1 != 1) {
			System.out.print("Programa encerrado!");
			}
		}
	}