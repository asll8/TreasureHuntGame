package edu.sabanciuniv.asli.game;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Game {
	
	private static int boardSize;
	private ArrayList<GameObject> gameObjects;
	private Player player;
	private Robot robot;
	private Treasure treasure;
	

	public Game(int boardSize) {
		super();
		this.boardSize = boardSize;
		
		Random rnd = new Random();
	
		Tree tree1 = new Tree(rnd.nextInt(boardSize), rnd.nextInt(boardSize));
		Tree tree2 = new Tree(rnd.nextInt(boardSize), rnd.nextInt(boardSize));
		
		House house = new House(rnd.nextInt(boardSize), rnd.nextInt(boardSize));
		
	    treasure = new Treasure(rnd.nextInt(boardSize), rnd.nextInt(boardSize));
	    
	    robot = new Robot(rnd.nextInt(boardSize), rnd.nextInt(boardSize));
	    
	    player = new Player(rnd.nextInt(boardSize), rnd.nextInt(boardSize), player.getPreviousDistance());
		
	    gameObjects = new ArrayList<>();
	    
	    gameObjects.add(tree1);
	    gameObjects.add(tree2);
	    gameObjects.add(house);
	    gameObjects.add(robot);
	    gameObjects.add(treasure);
	    
	}


	public static void main(String[] args) {
	
		
		while(boardSize< 5) {
		
		String bs = JOptionPane.showInputDialog("Please enter the board size: ");
		
	    boardSize = Integer.valueOf(bs);
	
		
		if(boardSize<5) {
			
			JOptionPane.showMessageDialog(null, "Board size cannot be less than 5 cells");
			
		} 
		
		
		}
		
		Game game = new Game(boardSize);
		
		game.play();
		
		
	}
		
	
	public void play() {
		

		for (int i = 1; i <= 10; i++) {
			
			JOptionPane.showMessageDialog(null, "This is your " + i + "th turn");
			
			String position = JOptionPane.showInputDialog("You are in position x:" + player.getPosX() + " y: " + player.getPosY());
			
			String x = JOptionPane.showInputDialog("Please enter a new x coordinate");
			
			String y = JOptionPane.showInputDialog("Please enter a new y coordinate");
			
			int xx = Integer.valueOf(x);
			
			int yy = Integer.valueOf(y);
			
			
			if(xx > boardSize) {
				
				JOptionPane.showMessageDialog(null, "You cannot go outside the board!!");
				
			}else if(yy > boardSize) {
				
				JOptionPane.showMessageDialog(null, "You cannot go outside the board!!");
				
			}
			
			if(gameObjects.get(i).getClass().getCanonicalName().equals("Tree") ||
					gameObjects.get(i).getClass().getCanonicalName().equals("House")) {
				
				if(gameObjects.get(i).getPosX() == xx && gameObjects.get(i).getPosY() == yy) {
					
					JOptionPane.showMessageDialog(null, "You cannot go forward, there is a " + 
					gameObjects.get(i).getClass().getCanonicalName() + " in here. ");
				}
				
			}
			
			if(gameObjects.get(i).getClass().getCanonicalName() == "Treasure") {
				
				if(gameObjects.get(i).getPosX() == xx && gameObjects.get(i).getPosY()== yy) {
					
					JOptionPane.showMessageDialog(null, "Congrats, You've reached the Treasure!!!");
					JOptionPane.showMessageDialog(null, "You won the game!!!");
					System.exit(0);
				}
			}
			
			if(gameObjects.get(i).getClass().getCanonicalName()=="Robot") {
				
				if(gameObjects.get(i).getPosX()==xx && gameObjects.get(i).getPosY() == yy) {
					
					JOptionPane.showMessageDialog(null, "Ouuww, You've hit the Robot...");
					JOptionPane.showMessageDialog(null, "You lost the game..");
					System.exit(0);
				}
			}
			
			robot.setPosX(new Random().nextInt(boardSize));
			robot.setPosY(new Random().nextInt(boardSize));
			
			if(gameObjects.get(i).getClass().getCanonicalName() == "Treasure") {
				
				if(robot.getPosX() == gameObjects.get(i).getPosX() && robot.getPosY() == gameObjects.get(i).getPosY()) {
					
					JOptionPane.showMessageDialog(null, "Opps, Robot found the Treasure..");
					JOptionPane.showMessageDialog(null, "You've lost the game..");
					System.exit(0);
				}
			}
			
			if(calculateDistance() > (boardSize/2)) {
				
				JOptionPane.showMessageDialog(null, "You're getting far from the treasure");
			}else {
				
				JOptionPane.showMessageDialog(null, "You're getting close to the treasure");
			}
			
			if(i == 10) {
				
				JOptionPane.showMessageDialog(null, "End of turns..");
			}
		}
		
		
	}
	
	
	private double calculateDistance() {

		private sampleFunction() {
			return xy;
		}
		
		int x1 = player.getPosX();
		
		int y1 = player.getPosY();
		
		int x2 = treasure.getPosX();
		
		int y2 = treasure.getPosY();
		
		double distance = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
		
		return distance;
	}
}
