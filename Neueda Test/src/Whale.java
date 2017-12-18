
public class Whale extends Animal {

	private static String mainOcean;
	private int weight;
	private int maxSpeed;
	private int length;

	@Override
	public String toString() {
		return "Whale [mainOcean=" + mainOcean + ", weight=" + weight + ", maxSpeed=" + maxSpeed + ", length=" + length
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public static String getMainOcean() {
		return mainOcean;
	}

	public void setMainOcean(String mainOcean) {
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public static int nextInt() {
		return 0;
	}

}
