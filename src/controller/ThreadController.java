package controller;

import java.util.concurrent.Semaphore;

public class ThreadController extends Thread {
	private int id;
	static Semaphore semBD = new Semaphore(1);
	
	public ThreadController (int id){
		this.id = id;
	}
	
	//Metodo run
	public void run() {
		if (id % 3 == 1) { 
			int tempobd = 1000;
			
			int tempocalc = (int) (Math.random() * 800)+200;
			System.out.println("Thread #" + id + " calculando.");
			try {
				sleep(tempocalc);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println("Thread #" + id + " cálculo terminado.");
			
			
			try {
				semBD.acquire();
				transacaoBD(id, tempobd);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semBD.release();
			}
			
			
			tempocalc = (int) (Math.random() * 800)+200;
			System.out.println("Thread#" + id + " calculando.");
				try {
					sleep(tempocalc);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println("Thread#" + id + " cálculo terminado.");
			
			
			try {
				semBD.acquire();
				transacaoBD(id, tempobd);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semBD.release();
			}
			
			
		}
		
		if (id % 3 == 2) { 
			int tempobd = 1500;
			
			int tempocalc = (int) (Math.random() * 1000)+500;
			System.out.println("Thread#" + id + " calculando...");
			try {
				sleep(tempocalc);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread#" + id + " cálculo terminado.");
			
			
			try {
				semBD.acquire();
				transacaoBD(id, tempobd);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semBD.release();
			}
			
			
			tempocalc = (int) (Math.random() * 1000)+500;
			System.out.println("Thread#" + id + " calculando.");
			try {
				sleep(tempocalc);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread#" + id + " cálculo terminado.");
			
			
			try {
				semBD.acquire();
				transacaoBD(id, tempobd);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semBD.release();
			}
			

			tempocalc = (int) (Math.random() * 1000)+500;
			System.out.println("Thread#" + id + " calculando.");
			try {
				sleep(tempocalc);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread#" + id + " cálculo terminado.");
			
			try {
				semBD.acquire();
				transacaoBD(id, tempobd);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semBD.release();
			}
			
		}
		
		
		if (id % 3 == 0 ) { 
			int tempobd = 1500;
			

			int tempocalc = (int) (Math.random() * 1000)+1000;
			System.out.println("Thread#" + id + " calculando.");
			try {
				sleep(tempocalc);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread#" + id + " cálculo terminado.");
			
			
			try {
				semBD.acquire();
				transacaoBD(id, tempobd);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semBD.release();
			}
			
			
			tempocalc = (int) (Math.random() * 1000)+1000;
			System.out.println("Thread#" + id + " calculando.");
			try {
				sleep(tempocalc);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread#" + id + " cálculo terminado.");
			
			
			try {
				semBD.acquire();
				transacaoBD(id, tempobd);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semBD.release();
			}
			
			tempocalc = (int) (Math.random() * 1000)+1000;
			System.out.println("Thread#" + id + " calculando.");
			try {
				sleep(tempocalc);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread#" + id + " cálculo terminado.");
			
			
			try {
				semBD.acquire();
				transacaoBD(id, tempobd);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semBD.release();
			}
			
		}
		
	}
	
	//Transação no BD
	public void transacaoBD(int id, int tempobd) {
		System.out.println("Transação no Bancod e Dados sendo realizada pela Thread " + id + ".");
		try {
			sleep(tempobd);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread#" + id + " terminou a transação!");
		
	}
	
	

}
