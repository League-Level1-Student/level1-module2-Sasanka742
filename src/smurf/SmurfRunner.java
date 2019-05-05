package smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf Handy = new Smurf("Handy");
		System.out.println(Handy.getName());
		Handy.eat();
		System.out.println();
		Smurf Papa = new Smurf("Papa");
		System.out.println(Papa.getName());
		System.out.println(Papa.getHatColor());
		System.out.println(Papa.isGirlOrBoy());
		System.out.println();
		Smurf Smurfette = new Smurf("Smurfette");
		System.out.println(Smurfette.getName());
		System.out.println(Smurfette.getHatColor());
		System.out.println(Smurfette.isGirlOrBoy());
	}
}
