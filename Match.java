
public class Match {
	Fighter f1;
	Fighter f2;
	
	int minWeight;
	int maxWeight;
	
	Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){ //Constructor method
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}
	
	void run() {
		if(isCheck()) {
			while(this.f1.health > 0 && this.f2.health > 0) {
				System.out.println("===== YENI ROUND =====");
				this.f2.health = this.f1.hit(this.f2); // f1 f2 ye vuruyor.
				if(isWin()) { // kazanan varsa d�ng�y� bitir.
					break;
				}
				
				this.f1.health = this.f2.hit(this.f1); // f2 f1 e vuruyor.
				if(isWin()) {
					break;
				}
				
				System.out.println(this.f1.name + " Sa�l�k : " + this.f1.health);
				System.out.println(this.f2.name + " Sa�l�k : " + this.f2.health);
			}
			
		}else {
			System.out.println("Sporcular�n a��rl�klar� uyu�muyor");
		}
	}
	
	boolean isCheck() {
		return ((this.f1.weight <= maxWeight && this.f1.weight >= minWeight) && (this.f2.weight <= maxWeight && this.f2.weight >= minWeight));
	}
	
	boolean isWin() {
		
		if(this.f1.health == 0) {
			System.out.println(this.f2.name + " kazand� !");
			return true;
		}
		
		if(this.f2.health == 0) {
			System.out.println(this.f1.name + " kazand� !");
			return true;
		}
		
		return false;
	}

}
