import java.util.Scanner;

public class Exerc�cio5 {

	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, soma;
		
		System.out.println("Digite 4 notas que voc� tirou no bimestre:\n ");
		
		System.out.print("Nota - 1: ");
		nota1 = leitor.nextFloat();
		
		System.out.print("Nota - 2: ");
		nota2 = leitor.nextFloat();
		
		System.out.print("Nota - 3: ");
		nota3 = leitor.nextFloat();
		
		System.out.print("Nota - 4: ");
		nota4 = leitor.nextFloat();
		
		System.out.println();
		
		soma = (nota1 + nota2 + nota3 + nota4) /4;
		System.out.println(soma);
		
		if (soma >7 || soma ==7) {
			System.out.printf("Media:%.1f\n", soma);
			System.out.println("Voc� foi Aprovado! Parab�ns!!");}
		
		else if (soma >= 3.5 || soma <7) {
			System.out.printf("Media:%.1f\n", soma);
			System.out.println("Voc� ficou em recupera��o.");}
		
		else if (soma <3.5) {
			System.out.printf("Media:%.1f", soma);
			System.out.println();
			System.out.println("Voc� foi reprovado.");}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
