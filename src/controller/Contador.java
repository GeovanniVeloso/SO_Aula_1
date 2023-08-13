package controller;

public class Contador {
	
	public Contador() {
		super();
	}
	
	public void Contador_1000(){
		int [] vetor = new int [1000];
		long tempoInicial = System.nanoTime();
		
		for (int i = 0; i<1000; i++) {
			vetor[i] = 0;
		}
		
		long tempoFinal = System.nanoTime();
		
		double tempoTotal = tempoFinal - tempoInicial;
		
		tempoTotal = tempoTotal/Math.pow(10, 9);
		
		System.out.println("Tempo do contador de 1000 é igual a "+tempoTotal+" segundos");
	}
	
	public void Contador_10000() {
		int [] vetor = new int [10000];
		long tempoInicial = System.nanoTime();
		
		for (int i = 0; i<10000; i++) {
			vetor[i] = 0;
		}
		
		long tempoFinal = System.nanoTime();
		
		double tempoTotal = tempoFinal - tempoInicial;
		
		tempoTotal = tempoTotal/Math.pow(10, 9);
		
		System.out.println("Tempo do contador de 10000 é igual a "+tempoTotal+" segundos");
	}
	
	public void Contador_100000() {
		int [] vetor = new int [100000];
		long tempoInicial = System.nanoTime();
		
		for (int i = 0; i<100000; i++) {
			vetor[i] = 0;
		}
		
		long tempoFinal = System.nanoTime();
		
		double tempoTotal = tempoFinal - tempoInicial;
		
		tempoTotal =tempoTotal/Math.pow(10, 9);
		
		System.out.println("Tempo do contador de 100000 é igual a "+tempoTotal+" segundos");
	}
}
