import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {

		ArrayList<Spaceship> spaceships = new ArrayList<Spaceship>();
	
		Spaceship enterprise = new Spaceship("Enterprise");

		enterprise.setXposition(50);
		enterprise.setYposition(50);
		enterprise.setDirection("West");
		enterprise.setSpeed(75);
		enterprise.setAmmo(100);
		enterprise.setLives(3);
		
		
		ArrayList<Asteroid> asteroid = new ArrayList<Asteroid>();
		
		Asteroid lives = new Asteroid("");
		asteroid.add(lives);

		
		
		System.out.println("Snow White's Dwarfs are: ");

		for (Spaceship spaceship : spaceships) {
			if (spaceship.getAmmo().equals("")) {
				System.out.println("\t" + spaceship.getLives() + ": ");
			}
	}
	}
