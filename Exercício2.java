import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite a idade do nadador para saber sua categoria: ");
		idade = leitor.nextInt();
		
		System.out.println();
		
		if (idade >= 5 && idade <= 10) {
			System.out.print("Sua categoria � Infantil");}
		
		else if (idade >= 11 && idade <= 17) {
			System.out.print("Sua categoria � Juvenil");}
		
		else if (idade >= 18) {
			System.out.print("Sua categoria � Adulto");}
		
		else {
			System.out.print("Infelizmente sua idade n�o corresponde as categorias");
		}
		

	}

}
