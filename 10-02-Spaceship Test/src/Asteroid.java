
public class Asteroid extends Main {

	private String xposition;
	private String yposition;
	private String direction;
	private int speed;

	public Asteroid(String xposition, String yposition, String direction, int speed) {
		super();
		this.xposition = xposition;
		this.yposition = yposition;
		this.direction = direction;
		this.speed = speed;
	}

	public String getXposition() {
		return xposition;
	}

	public void setXposition(String xposition) {
		this.xposition = xposition;
	}

	public String getYposition() {
		return yposition;
	}

	public void setYposition(String yposition) {
		this.yposition = yposition;
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

	@Override
	public String toString() {
		return "Asteroid [xposition=" + xposition + ", yposition=" + yposition + ", direction=" + direction + ", speed="
				+ speed + ", getXposition()=" + getXposition() + ", getYposition()=" + getYposition()
				+ ", getDirection()=" + getDirection() + ", getSpeed()=" + getSpeed() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
