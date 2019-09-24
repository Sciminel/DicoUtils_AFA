package fr.wcs.BattleShip_AFA;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Boat {

	private Random rand = new Random();
	private List<String> position = new ArrayList<>();
	private boolean active;
	public List<String> used = new ArrayList<>();

	public Boat(String str) {
		// TODO possible erreur pour 1 bateau
		for (int i = 0; i < str.length(); i += 2) {
			this.position.add(str.substring(i, i + 2));
		}
		this.active = true;
	}

	public void BoatCPU() {
		int ligne;
		int colonne;

		String posit = "";
		for (int i = 1; i < 4; i++) {
			switch (i) {
			case 1:
				ligne = this.rand.nextInt(4) + 1;
				colonne = this.rand.nextInt(4) + 1;
				this.position.add(String.valueOf((char) (colonne + 65) + (char) (ligne + 49)));
				break;
			case 2:
				if (isUsed(posit)) {

				}
				// used.add();

			}
		}
		this.active = true;

		// (char)(colonne+65)+(char)(ligne+49);
	}

	public void setPosition(String str) {
		for (int i = 0; i < str.length(); i += 2) {
			this.position.add(str.substring(i, i + 2));
		}
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isUsed(String pos) {
		return false;
	}
}
