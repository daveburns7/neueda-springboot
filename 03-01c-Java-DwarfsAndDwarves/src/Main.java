import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();

		Dwarf sleepy = new Dwarf("Sleepy", "Disney", "Sleepy.png");
		dwarfs.add(sleepy);
		Dwarf happy = new Dwarf("Happy", "Disney", "Happy.png");
		dwarfs.add(happy);
		Dwarf doc = new Dwarf("Doc", "Disney", "Doc.png");
		dwarfs.add(doc);
		Dwarf grumpy = new Dwarf("Grumpy", "Disney", "Grumpy.png");
		dwarfs.add(grumpy);
		Dwarf bashful = new Dwarf("Bashful", "Disney", "Bashful.png");
		dwarfs.add(bashful);
		Dwarf dopey = new Dwarf("Dopey", "Disney", "Dopey.png");
		dwarfs.add(dopey);
		Dwarf sneezy = new Dwarf("Sneezy", "Disney", "Sneezy.png");
		dwarfs.add(sneezy);

		Dwarf thorin = new Dwarf("Thorin Oakenshield", "Tolkien", "ThorinOakenshield.png");
		dwarfs.add(thorin);
		Dwarf dwalin = new Dwarf("Dwalin", "Tolkien", "Dwalin.png");
		dwarfs.add(dwalin);
		Dwarf balin = new Dwarf("Balin", "Tolkien", "Balin.png");
		dwarfs.add(balin);
		Dwarf gloin = new Dwarf("Gloin", "Tolkien", "Gloin.png");
		dwarfs.add(gloin);
		Dwarf kili = new Dwarf("Kili", "Tolkien", "Kili.png");
		dwarfs.add(kili);
		Dwarf fili = new Dwarf("Fili", "Tolkien", "Fili.png");
		dwarfs.add(fili);
		Dwarf dori = new Dwarf("Dori", "Tolkien", "Dori.png");
		dwarfs.add(dori);
		Dwarf nori = new Dwarf("Nori", "Tolkien", "Nori.png");
		dwarfs.add(nori);
		Dwarf ori = new Dwarf("Ori", "Tolkien", "Ori.png");
		dwarfs.add(ori);
		Dwarf oin = new Dwarf("Óin", "Tolkien", "Óin.png");
		dwarfs.add(oin);
		Dwarf bifur = new Dwarf("Bifur", "Tolkien", "Bifur.png");
		dwarfs.add(bifur);
		Dwarf bombur = new Dwarf("Bombur", "Tolkien", "Bombur.png");
		dwarfs.add(bombur);
		Dwarf bofur = new Dwarf("Bofur", "Tolkien", "Bofur.png");
		dwarfs.add(bofur);

		System.out.println("Snow White's Dwarfs are: ");
		System.out.println("The Company of Thorin are: ");
		for (Dwarf dwarf : Dwarf) {
			if (dwarfs.getAuthor().equals("Disney")) {
				System.out.println("\t" + dwarfs.getName() + ": ");
			}
		}
	}
}
