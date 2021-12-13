import java.util.Scanner;

public class Turing {
	
	int CONT;
	char FITA [];

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Turing MAQ = new Turing();
		Scanner entrada = new Scanner(System.in);
		String palavra;
		System.out.println("Entre com uma palavra: ");
		palavra = entrada.nextLine();
		MAQ.Iniciar(palavra);
	}
	
	public void Iniciar(String SENTENCA) {
		CONT = 0;
		FITA = SENTENCA.toCharArray();
		q0();
	}
	
	public void q0() {
		// A letra T irá representar o fim da fita
		if (CONT < FITA.length) {
			if (FITA[CONT] == 'T') {
				FITA[CONT] = 'T';
				CONT++;
				q4();
			}
			else if (FITA[CONT] == 'B') {
				FITA[CONT] = 'B';
				CONT++;
				q3();
			}
			else if (FITA[CONT] == 'a') {
				FITA[CONT] = 'A';
				CONT++;
				q1();
			}
			else {
				qerro();
			}
		}
		else {
			qerro();
		}
	}
	
	public void q1() {
		if (CONT < FITA.length) {
			if (FITA[CONT] == 'a') {
				FITA[CONT] = 'a';
				CONT++;
				q1();
			}
			else if (FITA[CONT] == 'B') {
				FITA[CONT] = 'B';
				CONT++;
				q1();
			}
			else if (FITA[CONT] == 'b') {
				FITA[CONT] = 'B';
				CONT--;
				q2();
			}
			else {
				qerro();
			}
		}
		else {
			qerro();
		}
	}
	public void q2() {
		if (CONT < FITA.length) {
			if (FITA[CONT] == 'a') {
				FITA[CONT] = 'a';
				CONT--;
				q2();
			}
			else if (FITA[CONT] == 'B') {
				FITA[CONT] = 'B';
				CONT--;
				q2();
			}
			else if (FITA[CONT] == 'A') {
				FITA[CONT] = 'A';
				CONT++;
				q0();
			}
			else {
				qerro();
			}
		}
		else {
			qerro();
		}
	}
	public void q3() {
		if (CONT < FITA.length) {
			if (FITA[CONT] == 'B') {
				FITA[CONT] = 'B';
				CONT++;
				q3();
			}
			else if (FITA[CONT] == 'T') {
				FITA[CONT] = 'T';
				CONT++;
				q4();
			}
			else {
				qerro();
			}
		}
		else {
			qerro();
		}
	}
	public void q4() {
		String palavra = "";
		for(int i = 0; i < FITA.length - 1; i++) {
			palavra = palavra + FITA[i];
		}
		System.out.println("Palavra aceita: " + palavra);
	}
	public void qerro() {
		String palavra = "";
		for(int i = 0; i < FITA.length; i++) {
			if(FITA[i] == 'T') {
				palavra = palavra;
			}else {
				palavra = palavra + FITA[i];
			}
			
		}
		System.out.println("A palavra não aceita: " + palavra);
	}

}
