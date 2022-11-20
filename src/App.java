//Faça um programa que converta da notação de 24 horas para a notação de 12 horas. Por exemplo, o programa deve converter 14:25 em 2:25 P.M. A entrada é dada em dois inteiros. Deve haver pelo menos duas funções: uma para fazer a conversão e uma para a saída. Registre a informação A.M./P.M. como um valor ‘A’ para A.M. e ‘P’ para P.M. Assim, a função para efetuar as conversões terá um parâmetro formal para registrar se é A.M. ou P.M. Inclua um loop que permita que o usuário repita esse cálculo para novos valores de entrada todas as vezes que desejar..
import java.util.Scanner;

class App {
	
	public void converter(int h, int m) {
		String a = "AM";
		String p = "PM";
		if ((h >= 13 && h <= 24) && (m > 0 && m < 60)) {
			switch(h) {
				case 13: h = 1; break;
				case 14: h = 2; break;
				case 15: h = 3; break;
				case 16: h = 4; break;
				case 17: h = 5; break;
				case 18: h = 6; break;
				case 19: h = 7; break;
				case 20: h = 8; break;
				case 21: h = 9; break;
				case 22: h = 10; break;
				case 23: h = 11; break;
				case 24: h = 12; break;
			}
			System.out.printf("%d:%d %s\n", h, m, p);
		} else if (h < 13){
			System.out.printf("%d:%d %s\n", h, m, a);
		} else {
			System.out.println("Digite Inválido.");
		}
	}
	
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
            App e = new App();
            
            int hora = 0; int minuto = 0;
            while(true) {
            	System.out.print("Digite h (999 quebra) : ");
            	hora = scan.nextInt();
            	if (hora == 999) {
            		break;
            	} else {					
            		System.out.print("Digite m: ");
            		minuto = scan.nextInt();					
            			
            		e.converter(hora, minuto);
            	}	
            }
        }	
	}
}