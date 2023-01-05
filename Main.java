
public class Main {

	public static void main(String[] args) {
		
		Fighter f1 = new Fighter("A", 10, 120, 100, 30); //String name, int damage, int health, int weight, int dodge
		// dodge, hasarý blocklama yüzdesi
		Fighter f2 = new Fighter("B", 20, 85, 85, 40); //String name, int damage, int health, int weight, int dodge
		
		Match match = new Match(f1, f2, 85, 100); //Fighter f1, Fighter f2, int minWeight, int maxWeight
		
		match.run();

	}

}
