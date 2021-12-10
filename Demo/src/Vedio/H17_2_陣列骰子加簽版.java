package Vedio;
//目的當摋到大於6時德機率減少
public class  H17_2_陣列骰子加簽版{
	public static void main(String[] args) {
		int [] p = new int [6]; 
		
		//摋100次將1~6的亂數放進去
		for(int i=0; i<100; i++) {
			int point = (int)(Math.random()*6); // point = 0~5的亂數
			p[point] ++;   //6個位置隨便亂摋,摋到的裡面位置值point＋1,point代表次數
		}
		
		int[] ans = new int[6];
		ans[1]++;
		System.out.println(ans[1]);
		for(int i=0; i<p.length; i++) {
			System.out.printf("骰子%d出現%d次\n",i+1,p[i]);  //i +1 才會變成 1~6 , p[i]代表查詢他們各個元素裡面的直
		}
		
//		骰子1出現14次
//		骰子2出現21次
//		骰子3出現16次
//		骰子4出現14次
//		骰子5出現19次
//		骰子6出現16次
	}

	}


