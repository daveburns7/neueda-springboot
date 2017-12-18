import java.util.ArrayList;

public class WhaleWatcher<Average> extends Whale {

	public static void main(String[] args) {
	
		ArrayList<Whale> whale = new ArrayList<Whale>();
	
		Whale right = new whale("Right Whale");
		right.setMainOcean("Altantic");
		right.setWeight(2001);
		right.setMaxSpeed(21);
		right.setLength(16);
		
		Whale blue = new whale("Blue Whale");
		blue.setMainOcean("Pacific");
		blue.setWeight(2001);
		blue.setMaxSpeed(23);
		blue.setLength(16);
		
		Whale sperm = new whale("Sperm Whale");
		sperm.setMainOcean("Altantic");
		sperm.setWeight(1900);
		sperm.setMaxSpeed(20);
		sperm.setLength(40);
		
		Whale humpback = new whale("Humpback Whale");
		humpback.setMainOcean("Antarctic");
		humpback.setWeight(919);
		humpback.setMaxSpeed(13);
		humpback.setLength(13);

	public WhaleWatcher() {
		super();
	}

	@Override
	public String toString() {
		return "WhaleWatcher [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
		System.out.println("All details for this whale are: " + getWhale());

		for (Whale whale : Whale) {
			if (Whale.getMainOcean().equals("Altantic")) {
				System.out.println("\t" + Whale.getMainOcean() + ": ");
			}

			for (int i = 1; i <= getMaxSpeed(); i++) {
				System.out.print("The fastest whale is :" + i + ": ");
				int getMaxSpeed = Whale.nextInt();
			}

			Average avg = new Average();
			System.out.println("The average whale length is: " + avg.getLength(right, blue, sperm, humpback));

		}
	}
}
