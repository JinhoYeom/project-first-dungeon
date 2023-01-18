package greedy.com.dungeon;

import java.util.Scanner;

public class TownMenu {

	public static void main(String[] args) {

		Store store = new Store();
		Player player = new Player();
		Gold gold = new Gold();
		DungeonMenu dg = new DungeonMenu();

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("=========== 마을 메뉴 ============");
			System.out.println("현재 최대 기록 : " + dg.record);
			System.out.print("현재 체력 : " + player.health + "hp ");
			System.out.println("현재 데미지 : " + player.damage + "dmg");
			System.out.println("현재 골드 : " + gold.towngold + "gold");
			System.out.println("1. 던전 들어가기");
			System.out.println("2. 강화 상점");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			int no = sc.nextInt();

			switch(no) {
			case 1 : dg.dungeonMenu();
				break;
			case 2 :store.storeMenu();
			break;
			case 9 :System.out.println("게임을 종료합니다"); 
			return;
			default : System.out.println("번호를 다시 입력해주세요");
			break;
			}
		}


	}

}
