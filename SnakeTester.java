
public class SnakeTester{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snake cobra = new Snake();
		cobra.breed ="cobra";
		cobra.color ="black";
		cobra.isPoisonous =true;
		cobra.LifeSpan =50;
		cobra.lengthInMeters =1;

		System.out.println("Details of Cobra: ");
		System.out.println("Color of Cobra: " + cobra.color);
		System.out.println("Breed of Cobra: " + cobra.breed);
		System.out.println("Poisonous or not: " + cobra.isPoisonous);
		System.out.println("Life span of Cobra: " + cobra.LifeSpan);
		System.out.println("Length of Cobra in Meters: " + cobra.lengthInMeters);

		cobra.color ="Brown";
		System.out.println("Changed color of Cobra: " + cobra.color);
		System.out.println( );

		Snake rattleSnake = new Snake();
		rattleSnake.breed = "Rattle";
		rattleSnake.color = "dusty";
		rattleSnake.isPoisonous = true;
		rattleSnake.LifeSpan = 25;
		rattleSnake.lengthInMeters = 2;
		
		System.out.println("Details of RattleSnake : ");
		System.out.println("Color of RattleSnake : " + rattleSnake.color);
		System.out.println("Breed of : RattleSnake " + rattleSnake.breed);
		System.out.println("Poisonous or not: " + rattleSnake.isPoisonous);
		System.out.println("Life span of RattleSnake : " + rattleSnake.LifeSpan);
		System.out.println("Length of RattleSnake in Meters: " + rattleSnake.lengthInMeters);

	}

}
