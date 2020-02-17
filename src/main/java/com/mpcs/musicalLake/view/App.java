package com.mpcs.musicalLake.view;

import java.util.Scanner;

import com.mpcs.musicalLake.controller.ConcertController;
import com.mpcs.musicalLake.model.Concert;

public class App {

	public static void main(String[] args) {
		ConcertController controller = new ConcertController();
		String sound = "";
		int option = 1;
		System.out.println("************Search Sound************");
		
		
		try {

			while (option != 0) {
				System.out.println("Please enter a sound");
				Scanner scannerTwo = new Scanner(System.in);
				sound = scannerTwo.nextLine();
				
				System.out.println(controller.searchLyric(sound, controller.choiseSong(sound)));
				System.out.println("Enter 0 to exit");
				System.out.println("Enter 1 to continue");
				Scanner scanner = new Scanner(System.in);
				option = scanner.nextInt();
				
			}
			System.out.println("Bye");

		} catch (Exception e) {
			System.out.println("reload and enter a valid option ");
		}

	}

}
