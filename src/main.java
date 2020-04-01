import hairPackage.*;
import weaponPackage.*;
public class main {

	public static void main(String[] args) {
		//initializations
		hairStyle Spiky = new Spiky();
		hairStyle Combed = new Combed();
		hairStyle sproutCut = new sproutCut();
		
		Weapon Banana = new Banana();
		Weapon rayGun = new rayGun();
		Weapon rocketLauncher = new rocketLauncher();
		Weapon shrinkRay = new shrinkRay();
		
		//initialize characters
		Minion Bob = new Bob(Spiky, Banana);
		Bob.print();
		
		Minion Tim = new Tim(sproutCut, shrinkRay);
		Tim.print();
		
//		Minion Dave = new Dave(Combed, rocketLauncher);
//		Dave.print();
//		
//		Minion Kevin = new Kevin(Combed, rayGun);
//		Kevin.print();
//		
//		Minion Carl = new Carl(Spiky, Banana);
//		Carl.print();
//		
//		Minion Stuart = new Stuart(Combed, Banana);
//		Stuart.print();
		
		
		//you can change their behavior using setWeapon(weapon) or setHairStyle(hairStyle)
		
	}

}
