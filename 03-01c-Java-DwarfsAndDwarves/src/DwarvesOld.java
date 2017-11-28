import java.util.ArrayList;

public class DwarvesOld {

	public static void main(String[] args) {

		ArrayList<String> dwarfs = new ArrayList<String>();

		dwarfs.add("Doc");
		dwarfs.add("Grumpy");
		dwarfs.add("Happy");
		dwarfs.add("Sleepy");
		dwarfs.add("Bashful");
		dwarfs.add("Sneezy");
		dwarfs.add("Dopey");

		ArrayList<String> dwarves = new ArrayList<String>();

		dwarves.add("Thorin Oakenshield");
		dwarves.add("Dwalin");
		dwarves.add("Balin");
		dwarves.add("Gloin");
		dwarves.add("Kili");
		dwarves.add("Fili");
		dwarves.add("Dori");
		dwarves.add("Nori");
		dwarves.add("Ori");
		dwarves.add("Óin");
		dwarves.add("Bifur");
		dwarves.add("Bombur");
		dwarves.add("Bofur");

		System.out.println("The Disney Dwarfs are: ");
		for (int i = 0; i < dwarfs.size(); i++) {
			System.out.println(dwarfs.get(i));
		}

		System.out.println("The Tolkien Dwarves are: ");
		for (int i = 0; i < dwarves.size(); i++) {
			{
				System.out.println(dwarves.get(i));
			}

		}
	}
}
