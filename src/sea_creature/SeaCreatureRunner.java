package sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature SpongeBob = new SeaCreature("SpongeBob");
		SpongeBob.eat();
		SpongeBob.laugh();
		SeaCreature Patrick = new SeaCreature("Patrick");
		System.out.println(Patrick.getName());
		Patrick.eat();
		Patrick.laugh();
		SeaCreature Squidward = new SeaCreature("Squidward");
		System.out.println(Squidward.getName());
		Squidward.eat();
		Squidward.laugh();
		
	}
}
