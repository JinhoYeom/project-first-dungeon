package greedy.com.dungeon;

public class DungeonMenu {

	static int record = 0;
	
	public void dungeonMenu() {
		record++;
		
		while(true) {
			System.out.println("============= 던전 ===========");
			System.out.println();
			System.out.println("1. 왼쪽 방");
			System.out.println("2. 가운데 방");
			System.out.println("3. 오른쪽 방");
			System.out.println("4. 마을로 돌아간다");
		}
	}

}
