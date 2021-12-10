package Vedio;
//擲骰子單純版
public class H_16_摋骰子 {

	public static void main(String[] args) {
		
		//宣告6個數字摋到次數得值
		int p1,p2,p3,p4,p5,p6;
		
		//6個數字都初始化
		p1 = p2 =p3 =p4 =p5 =p6 =0;
		
		//摋100次產生1~6的亂數
		for(int i=0; i<100; i++) {
				int point = (int)(Math.random()*6+1); //產生1~6的值	
					//當摋到各點時＋＋
					switch(point) {
						case 1 : p1++ ;break;
						case 2 : p2++ ;break;
						case 3 : p3++ ;break;
						case 4 : p4++ ;break;
						case 5: p5++ ;break;
						case 6: p6++ ;break;
					}
		}
		
		System.out.printf("1點出現現%d次\n",p1);
		System.out.printf("2點出現現%d次\n",p2);
		System.out.printf("3點出現現%d次\n",p3);
		System.out.printf("4點出現現%d次\n",p4);
		System.out.printf("5點出現現%d次\n",p5);
		System.out.printf("6點出現現%d次\n",p6);
	
	}

}
