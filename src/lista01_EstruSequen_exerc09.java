import java.util.Scanner;
/* Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Fahrenheit ==> Celsius.
* Descrição: 9. Faça um Programa que peça a temperatura em graus Fahrenheit,transforme e mostre 
a temperatura em graus Celsius. C = 5 * ((F-32) / 9).
* Data: 07/04/2023 */

public class lista01_EstruSequen_exerc09 {
    public static void main(String[] args) throws Exception {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Conversor de temperatura: Graus Fahrenheit -> Celsius\n"); 
		System.out.print("Digite a temperatura em Fahrenheit: ");
		double Fahrenheit = entrada.nextDouble();
		

		double Celsius = 5 * (( Fahrenheit - 32 ) / 9);

		System.out.println("\nA temperatura em Celsius é " + Celsius + " ºC\n");

        entrada.close();
		
	}
}
