package tbawhile;

import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

		 System.out.print("Deseja ver a tabuada? (Sim/Não): ");
	     String resposta = scanner.next();

	     while (resposta.equalsIgnoreCase("Sim")) {
	    	 System.out.print("Informe o número para ver a tabuada: ");
	         int numero = scanner.nextInt();
	         int i = 1;
	         
	         System.out.println();
	         System.out.println("-=-=-=-=- Tabuada do " + numero + " -=-=-=-=-");
	         
	         while (i <= 10) {
	        	 int resultado = numero * i;
	             System.out.println(numero + " x " + i + " = " + resultado);

	             i++;
	         }

	     System.out.print("Deseja continuar com outra tabuada? (Sim/Não): ");
	     resposta = scanner.next();
	        
	     }
	       
	     scanner.close();
	     System.out.println("Fim da aplicação.");
	    
	}
}
