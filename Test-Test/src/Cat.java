class Cat extends Animal {

	int age;

	public Cat(int catsAge) {

		age = catsAge;

	}

	public void meow() {

		System.out.println("Meow!");

	}

	public void run(int feet) {

		System.out.println("Your cat ran " + feet + " feet!");

	}

	public int getAge() {

		return age;

	}

	public static void main(String[] args) {

		Cat butch = new Cat(5);
		butch.meow();
		butch.run(30);
		int butchAge = butch.getAge();
		System.out.println(butchAge);
		butch.checkStatus();

	}

}