
public class Spaceship extends Main {

	private String xposition;
	private String yposition;
	private String direction;
	private int speed;
	private int ammo;
	private int lives;

	public Spaceship(String xposition, String yposition, String direction, int speed, int ammo, int lives) {
		super();
		this.xposition = xposition;
		this.yposition = yposition;
		this.direction = direction;
		this.speed = speed;
		this.ammo = ammo;
		this.lives = lives;
	}

	public Spaceship() {

	}

	public String getXposition() {
		return xposition;
	}

	public void setXposition(int i) {
		this.xposition = i;
	}

	public String getYposition() {
		return yposition;
	}

	public void setYposition(int i) {
		this.yposition = i;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAmmo() {
		return ammo;
	}

	public void setAmmo(int ammo) {
		this.ammo = ammo;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	@Override
	public String toString() {
		return "Spaceship [xposition=" + xposition + ", yposition=" + yposition + ", direction=" + direction
				+ ", speed=" + speed + ", ammo=" + ammo + ", lives=" + lives + ", getXposition()=" + getXposition()
				+ ", getYposition()=" + getYposition() + ", getDirection()=" + getDirection() + ", getSpeed()="
				+ getSpeed() + ", getAmmo()=" + getAmmo() + ", getLives()=" + getLives() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
