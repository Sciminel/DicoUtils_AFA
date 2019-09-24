package fr.wcs.BattleShip_AFA;

public class Boat {

	private String[] position;
	private boolean active;
	
	public Boat(String[] position) {
		this.position = position;
		this.active = true;
	}
	
	public Boat() {
		//this.position = position;
		this.active = true;
	}

	public String[] getPosition() {
		return position;
	}

	public void setPosition(String[] position) {
		this.position = position;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
