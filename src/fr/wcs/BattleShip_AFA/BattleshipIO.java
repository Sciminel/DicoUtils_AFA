package fr.wcs.BattleShip_AFA;

import java.util.Scanner;

public class BattleshipIO {
	Scanner sc = new Scanner(System.in);

	public void print(String str){
		System.out.println(str);
		}

	public void printBoard(String[][] str){
		
		System.out.println("  1 2 3 4 5 ");
		
		for(int i = 0; i < str.length; i++){
			switch (i) {

			case 0:
				System.out.print("a ");
				break;

			case 1:
				System.out.print("b ");
				break;

			case 2:
				System.out.print("c ");
				break;

			case 3:
				System.out.print("d ");
				break;

			case 4:
				System.out.print("e ");
				break;
			};
			for(int j = 0; j < str[0].length; j++) {
				System.out.print(str[i][j] + " ");
				}
			System.out.println("");
		}
	}
	public void askTarget(){
		System.out.println("Pick your target: (ex: C1 )");
		}

	public String readTarget(){
		return sc.nextLine();
		}
}
