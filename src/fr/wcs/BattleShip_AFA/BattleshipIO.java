package fr.wcs.BattleShip_AFA;

import java.util.Scanner;

public class BattleshipIO {
	Scanner sc = new Scanner(System.in);

	public void print(String str){
		System.out.println(str);
		}

	public void printBoard(String[][] str){
		
		for(int i = 0; i < str.length; i++){
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


//	public static void main(String Args[]){
//
//		BattleshipIO BS = new BattleshipIO();
//		String[][] Battle =  {
//				{"A1", "A2", "A3"},
//				{"B1", "B2", "B3"},
//				{"C1", "C2", "C3"}
//		};
//		
//		BS.printBoard(Battle);
// 		
//		
		
		//		DicoIO test = new DicoIO();
//		String[] str = {"lol", "lul", "lel", "lal"};
//		test.print("Yo ma fonction print marche!!!");
//		test.printArr(str);
//		test.menu();
//		test.print("Mot lu:");
//		System.out.println(test.readWord());
//		test.print("Choix:");
//		System.out.println(test.readChoice());
//		}
	

