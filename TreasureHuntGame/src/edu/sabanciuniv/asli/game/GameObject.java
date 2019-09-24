package edu.sabanciuniv.asli.game;

public class GameObject {
	
	private int posX;
	private int posY;
	
	
	public GameObject(int posX, int posY) {
		super();
		this.posX = posX;
		this.posY = posY;
	}


	@Override
	public String toString() {
		return "GameObject [posX=" + posX + ", posY=" + posY + ", toString()=" + super.toString() + "]";
	}


	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	

}
