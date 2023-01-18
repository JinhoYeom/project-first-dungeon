package greedy.com.dungeon;

public class Gold {
	
	Player player = new Player();

    private int towngold = 30;

	public void PlayerGoldInformation() {
		System.out.println("현재 보유한 골드는 " + towngold + "gold 입니다.");
	}

	public int hpUpgrade(int hpgold) {
		if(hpgold > towngold) {
			System.out.println("골드가 " + (hpgold - towngold) + "만큼 부족합니다.");
			return 0;
		}
		towngold = towngold - hpgold;
		player.upgradeHealth();
		return 10;
	}

	public int dmgUpgrade(int dmggold) {
		if(dmggold > towngold) {
			System.out.println("골드가 " + (dmggold - towngold) + "만큼 부족합니다.");
			return 0;
		}
		towngold = towngold - dmggold;
		player.upgradeDamage();
		return 10;

	}
}
