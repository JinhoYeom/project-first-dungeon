package greedy.com.dungeon;

import java.util.Scanner;

public class Store {

	Scanner sc = new Scanner(System.in);
	Gold gold = new Gold();
	Player player = new Player();

	private int hpgold = 10;
	private int dmggold = 10;

	public void storeMenu() {
		while(true) {
			System.out.println("========== 강화 상점 =============");
			System.out.println("현재 보유 골드 : " + gold.towngold);
			System.out.println("1. hp 강화(" + hpgold + "gold 필요)");
			System.out.println("2. dmg 강화(" + dmggold + "gold 필요)");
			System.out.println("3. 마을로 돌아가기");
			System.out.print("메뉴 선택 : ");
			int no = sc.nextInt();

			switch(no) {
			case 1 : hpgold += gold.hpUpgrade(hpgold); 
			break;
			case 2 : dmggold += gold.dmgUpgrade(dmggold);
			break;
			case 3 : return;
			}
		}
	}
}

