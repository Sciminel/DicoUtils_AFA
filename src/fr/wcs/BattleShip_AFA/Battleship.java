package fr.wcs.BattleShip_AFA;
import java.util.Random;

public class Battleship {


	public static void main(String[] args) {

		String target = "";
		BattleshipIO bio = new BattleshipIO();
		String[][] board = new String[5][5];
		String[][] boardCPU = new String[5][5];

		board = fillBoard(board);

//		board[2][4] = "O";
//		board[1][1] = "X";
//		BIO.printBoard(board);

		for (int i = 1; i <= 3; i++) {
			bio.print("Entrez les coordonnées du bateau à " + i + " case(s)");
			target = bio.readTarget();


			switch (i) {

			case 1:
			Boat destroyer = new Boat(target);
			//Boat destroyerCPU = new Boat
			break;
			case 2:
			Boat cruiser = new Boat(target);

			break;
			case 2:
			Boat battleship = new Boat(target);

			break;
			}
		}

		
	}

	public static String[][] fillBoard(String[][] board) {
		for(int line = 0; line < board.length; line++) {

			for(int column = 0; column < board[0].length; column++) {
				board[line][column] = ".";
			}
		}
		return board;
	}

	public static String[][] putShit(String[][] board, int longueur) {
		return board;
	}



}
/*
Déroulement de la partie:
Le joueur et l'ordinateur placent leurs bateaux.
Les bateaux du joueur sont affichés sur le plateau.
Le joueur doit choisir une cible.
Le terminal affiche si la torpille a touché ou non le bateau.
L'ordinateur choisit une cible.
Le terminal affiche si la torpille a touché ou non le bateau.
Si un bateau est coulé on affiche le message à l'utilisateur.
Quand tous les bateaux d'un joueur sont coulés on affiche le nom du vainqueur.
(Après la partie, on demande au joueur si il veut continuer ou arrêter le jeu.)
*/



//Bataille navale

//Todo :
//Développer un jeu 'bataille navale' en Java, avec au moins une class Play.java avec une méthode main.

//Objectif du jeu :
//Le joueur doit définir le placement de ses bateaux.
//Le joueur essaye de couler tous les bateaux de son adversaire.

//Plateau de jeu:
//Le plateau est de 5 par 5 pour chacun des joueurs. L'utilisateur voit son
//plateau avec le placement de
//sa flotte. Il voit également le plateau de son adversaire mais uniquement le choc de ses torpilles.

//Bateaux:
//Les bateaux on des tailles différentes: 1, 2 et 3 cases. Ils sont détruits quand toutes
//les parties du bateau on été touchées.
