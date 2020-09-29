package view;

import controller.ThreadController;

public class Main {

	public static void main(String[] args) {
		for(int i = 0; i<21; i++){
			Thread thread = new ThreadController(i);
			thread.start();
		}
		
	}

}
