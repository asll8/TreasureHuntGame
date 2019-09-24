package edu.sabanciuniv.asli.game;

public class Robot extends GameObject implements Movable {

	
	
	
	public Robot(int posX, int posY) {
		super(posX, posY);
		
	}

	@Override
	public void move(int x, int y) {	
		setPosX(x);
		setPosY(y);
	}

	@Override
	public String toString() {
		return "Robot [toString()=" + super.toString() + ", getPosX()=" + getPosX() + ", getPosY()=" + getPosY() + "]";
	}
	
	
	

}
