package greedy.com.dungeon;
//플레이어의 체력과 데미지를 관리
public class Player {
	
	static int health = 100; 			// 최초 체력
	static int damage = 10; 			// 최초 데미지
	
	
	public void upgradeHealth() {
		health += 50;
		System.out.println("hp 강화가 완료됐습니다.");
	}
	
	public void upgradeDamage() {
		damage += 5;
		System.out.println("dmg 강화가 완료됐습니다.");
	}
	
	public void getHpDamage() {
		System.out.println("현재 체력 : " + health + "hp, 현재 데미지 : " + damage + "dmg"); 
	}
	
}
