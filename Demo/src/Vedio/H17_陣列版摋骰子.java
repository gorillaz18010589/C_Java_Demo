package Vedio;
// 判斷式? true時做什麼： false時做什麼
//加簽就是靠此方式讓4,5,6被抽到機率提升
//一維陣列範例
public class H17_陣列版摋骰子 {

	public static void main(String[] args) {
		int [] p = new int [6]; 
		
		//摋100次將1~6的亂數放進去
		for(int i=0; i<10000; i++) {
			int point = (int)(Math.random()*9); // point = 0~8的9個亂數
			
			//加簽：當<小於6時保持原狀,但大於等於6時-3  , 7,8,9  -3  => 4,5,6 所以4,5,6被抽到次數大大提升
			p[point >=6 ? point-3:point] ++;
			//1.判斷是 ？ 2. true的話做什麼: 3,否則false做什麼
		}
		
		for(int i=0; i<p.length; i++) {
			System.out.printf("骰子%d出現%d次\n",i+1,p[i]);  //i +1 才會變成 1~6 , p[i]代表查詢他們各個元素裡面的直
		}
		
		//骰子1出現1161次
//		骰子2出現1146次
//		骰子3出現1097次
//		骰子4出現2201次
//		骰子5出現2193次
//		骰子6出現2202次

	}

}
