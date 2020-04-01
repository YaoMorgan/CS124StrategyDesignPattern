
import hairPackage.*;
import weaponPackage.*;

abstract class Minion {
	private hairStyle hairStyle;
	private Weapon weapon;
	
	//constructor with the different stuff
	public Minion(hairStyle hairStyle, Weapon weapon) {
		this.hairStyle = hairStyle;
		this.weapon = weapon;
	}
	
	//characteristic methods
	public void speak() {
		String[] phrases = {"Gelato!", "Kanpai!", "Papoy?", "Bello", "BEE DO BEE DO BEE DO", "Stupa", "Tulaliloo ti amo", "Sa la ka!", "Poopaye"};
		System.out.println("says: " + phrases[(int) (Math.random()*9)]);
	}
	public void laugh() {
		System.out.println("hehehe");
	}
	public void hair() {
		hairStyle.hair();
	}
	public void useWeapon() {
		weapon.useWeapon();
	}
	
	//setters
	public void setHairStyle(hairStyle hairStyle) {
		this.hairStyle = hairStyle;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public abstract void print();
	
}

//characters // can also be separated into another package for cleanliness 
class Bob extends Minion {
	public Bob(hairStyle hairStyle, Weapon weapon) {
		super(hairStyle, weapon);
	}
	public void print() {
		System.out.println("Bob");
		speak(); laugh(); hair(); useWeapon();
	}
}
class Stuart extends Minion {
	public Stuart(hairStyle hairStyle, Weapon weapon) {
		super(hairStyle, weapon);
	}
	public void print() {
		System.out.println("Stuart");
		speak(); laugh(); hair(); useWeapon();
	}
}
class Kevin extends Minion {
	public Kevin(hairStyle hairStyle, Weapon weapon) {
		super(hairStyle, weapon);
	}
	public void print() {
		System.out.println("Kevin");
		speak(); laugh(); hair(); useWeapon();
	}
}
class Carl extends Minion {
	public Carl(hairStyle hairStyle, Weapon weapon) {
		super(hairStyle, weapon);
	}
	public void print() {
		System.out.println("Carl");
		speak(); laugh(); hair(); useWeapon();
	}
}
class Jerry extends Minion {
	public Jerry(hairStyle hairStyle, Weapon weapon) {
		super(hairStyle, weapon);
	}
	public void print() {
		System.out.println("Jerry");
		speak(); laugh(); hair(); useWeapon();
	}
}
class Tim extends Minion {
	public Tim(hairStyle hairStyle, Weapon weapon) {
		super(hairStyle, weapon);
	}
	public void print() {
		System.out.println("Tim");
		speak(); laugh(); hair(); useWeapon();
	}
}
class Dave extends Minion {
	public Dave(hairStyle hairStyle, Weapon weapon) {
		super(hairStyle, weapon);
	}
	public void print() {
		System.out.println("Dave");
		speak(); laugh(); hair(); useWeapon();
	}
}
