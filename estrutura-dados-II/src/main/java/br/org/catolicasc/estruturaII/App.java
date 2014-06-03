package br.org.catolicasc.estruturaII;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		int vet[] = { 3, 6, 2, 4, 5, 1, 7, 9, 0, 8 };
		X(vet);
		
		for (int i = 0; i < 10; i++) {
			System.out.print(vet[i]+", ");
		}
	}
	
	public static void X(int vet[]){
		int  aux;
		int cont = 0;
		for (int i = 1; i < vet.length; i++) {
			for (int j = 0; j < 2; j++) {
				if(vet[j] > vet[i]){
					cont ++;
					aux = vet[j];
					vet[j] = vet[i];
					vet[i] = aux;
				}
			}
			
		}
		System.out.println(cont);
	}
	
}
