package fr.wcs.BattleShip_AFA;

import java.util.Random;

public class Battleship {

	public static String target = "";
	public static int [] coord = new int[2];
	public static int lineDest, lineCruise;
	
	// entrée & sortie
	public static BattleshipIO bio = new BattleshipIO();
	
	// Plateaux
	public static String[][] board = new String[5][5];
	public static String[][] boardCPU = new String[5][5];
	
	// Création des bateaux
	public static Boat destroyer = new Boat(1);
	public static Boat cruiser = new Boat(2);
	public static Boat battleship = new Boat(3);

	public static Boat destroyerCPU = new Boat(1);
	public static Boat cruiserCPU = new Boat(2);
	public static Boat battleshipCPU = new Boat(3);
	
	
	public static void main(String[] args) throws InterruptedException {


		
		// Initialisation du plateau
		board = fillBoard(board);
		boardCPU = fillBoard(boardCPU);

		for (int i = 1; i <= 3; i++) {
			bio.print("Enter your coordinates for the boat with " + i + " part(s)");
			target = bio.readTarget();

			switch (i) {

			case 1:
				coord = coordonees(target);
				board[coord[0]][coord[1]] = "D";   
				break;
			case 2:
				coord = coordonees(target.substring(0, 2));
				board[coord[0]][coord[1]] = "C";
				coord = coordonees(target.substring(2));
				board[coord[0]][coord[1]] = "C";
				break;
			case 3:
				coord = coordonees(target.substring(0, 2));
				board[coord[0]][coord[1]] = "B";
				coord = coordonees(target.substring(2, 4));
				board[coord[0]][coord[1]] = "B";
				coord = coordonees(target.substring(4));
				board[coord[0]][coord[1]] = "B";
				break;
			}
		}

		
		// Placement du 1er bateau 
		coord = randomCPU(5);
		boardCPU[coord[0]][coord[1]] = "D";
		lineDest = coord[0];
		
		// Placement du 2eme bateau
		coord = randomCPU(4);
		while (coord[0] == lineDest) {
			coord = randomCPU(4);
		}
		boardCPU[coord[0]][coord[1]] = "C";
		boardCPU[coord[0]][coord[1] + 1] = "C";
		lineCruise = coord[0];
		
		// Placement du 3eme bateau
		coord = randomCPU(3);
		while (coord[0] == lineDest || coord[0] == lineCruise)  {
			coord = randomCPU(3);
		}
		boardCPU[coord[0]][coord[1]] = "B";
		boardCPU[coord[0]][coord[1] + 1] = "B";
		boardCPU[coord[0]][coord[1] + 2] = "B";
		
		startGame();
		

	}

	public static int[] randomCPU(int max) {
		
		// Génération aléatoire de coordonnées
		int[]rcpu = new int[2];
		Random rand = new Random();
		rcpu[0] = rand.nextInt(5);
		rcpu[1] = rand.nextInt(max);
		return rcpu;

	}
	
	public static String[][] fillBoard(String[][] board) {
		for (int line = 0; line < board.length; line++) {

			for (int column = 0; column < board[0].length; column++) {
				board[line][column] = ".";
			}
		}
		return board;
	}

	public static int[] coordonees(String str) {
		char x = str.charAt(0);
		char y = str.charAt(1);
		int coord[] = new int[2];

		//Retourne la ligne du tableau
		switch (x) {

		case 'A':
			coord[0] = 0;
			break;

		case 'B':
			coord[0] = 1;
			break;

		case 'C':
			coord[0] = 2;
			break;

		case 'D':
			coord[0] = 3;
			break;

		case 'E':
			coord[0] = 4;
			break;
		}
		
		//Retourne la colonne du tableau
		switch (y) {

		case '1':
			coord[1] = 0;
			break;

		case '2':
			coord[1] = 1;
			break;

		case '3':
			coord[1] = 2;
			break;

		case '4':
			coord[1] = 3;
			break;

		case '5':
			coord[1] = 4;
			break;
		}
		// retourne le tableau XY
		return coord;
	}

	public static void startGame() throws InterruptedException {
		
		int boatCPU = 6, boat = 6;
		boolean playing = true;
		String[][] complete = new String[5][5];
		complete = fillBoard(complete);
		while (playing) {
			bio.printBoard(board);
			bio.print("__________");
			bio.printBoard(complete);
			bio.askTarget();
			target = bio.readTarget();
			coord = coordonees(target);
			if (boardCPU[coord[0]][coord[1]] == "D" ||
					boardCPU[coord[0]][coord[1]] == "C" || 
					boardCPU[coord[0]][coord[1]] == "B") {
				bio.print("BOOM!!!");
				boatCPU--;
				boardCPU[coord[0]][coord[1]] = "X";
				complete[coord[0]][coord[1]] = "X";
			}
			else {
				bio.print("You failed");
				boardCPU[coord[0]][coord[1]] = "#";
				complete[coord[0]][coord[1]] = "#";
				
			}
			if (boatCPU == 0) {
				bio.print("You win!");
				break;
			}
			bio.print("CPU playing..");
			Thread.sleep(1500);
			bio.printBoard(board);
			bio.print("__________");
			bio.printBoard(complete);
			coord = randomCPU(5);
			while (board[coord[0]][coord[1]]== "#" ||
					board[coord[0]][coord[1]] == "X") {
				coord = randomCPU(5);
			}
			if (board[coord[0]][coord[1]] == "B" ||
					board[coord[0]][coord[1]] == "C" ||
					board[coord[0]][coord[1]] == "D") {
				bio.print("CPU got you...");
				boat--;
				board[coord[0]][coord[1]] = "X";
			}
			else {
				bio.print("CPU failed");
				board[coord[0]][coord[1]] = "#";
			}
			if (boat == 0) {
				bio.print("You lose!!!");
				break;
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}