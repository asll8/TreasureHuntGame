package edu.sabanciuniv.asli.game;

public class Player extends GameObject implements Movable {

	private int previousDistance;
	
	
	public Player(int posX, int posY, int previousDistance) {
		super(posX, posY);
		this.previousDistance = previousDistance;
	}
	
	@Override
	public void move(int x, int y) {
		setPosX(x);
		setPosY(y);
	}


	@Override
	public String toString() {
		return "Player [toString()=" + super.toString() + ", getPosX()=" + getPosX() + ", getPosY()=" + getPosY() + "]";
	}


	public int getPreviousDistance() {
		return previousDistance;
	}


	public void setPreviousDistance(int previousDistance) {
		this.previousDistance = previousDistance;
	}
	
	

}
