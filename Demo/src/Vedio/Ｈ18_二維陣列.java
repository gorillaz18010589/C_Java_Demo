package Vedio;
//多為觀念：一為下去還有一為的概念
//陣列記憶體表現方式：一維中還有一維,所以他是一種記憶體指向,指向到另一個地方去
//記憶體一為可以在一為,只要記憶體夠可以無限多為
//寫遊戲數學碰撞事情 牛頓第一第二第三定律
public class Ｈ18_二維陣列 {

	public static void main(String[] args) {

		//1.可以用矩陣方式證明的3X4二維陣列
		int [][] ary1;
		ary1 = new int[3][4];  // 3 X 4
		//查看裡面得元素個素
		System.out.println(ary1.length); //3 =>因為從一為觀念眼睛看下去裡面一開始只有三個元素
		System.out.println(ary1[0].length); //4 =>在來到下一為0房間裡面4個元素
		System.out.println(ary1[1].length); //4 =>在來到下一為0房間裡面4個元素
		System.out.println(ary1[2].length); //4  =>在來到下一為0房間裡面4個元素
		System.out.println("====================");
		//一次尋訪二為陣列德元素並印出來//ary1 = new int[3][4];
		for(int[] sub : ary1) { //1.尋訪第一為,肚子裡還是一為
			for(int v : sub) {  //2.訓訪到第一為在一為裡面的房間就拿到int元素了
				System.out.print(v +" "); //print不換行
			}
			System.out.println(); 
		}
		System.out.println("====================");
//		0 0 0 0 
//		0 0 0 0 
//		0 0 0 0 

		
		//2.此種方式可以更廣義定義,你就說不上是幾乘擠了,這是用指向方式只要記憶體夠可以無限多為
		int[][] ary2; //宣告二維陣列還未初始化
		ary2 = new int [3][]; //宣告一為陣列初始化三個位置0,1,2 ,//一為陣列下看元素為3
		ary2[0] = new int[2]; // 一為裡面在一為0的記憶體指向的房間有2個元素
		ary2[1] = new int[3];// 一為裡面在一為1的記憶體指向的房間有3個元素
		ary2[2] = new int[4]; // 一為裡面在一為2的記憶體指向的房間有4個元素
		System.out.println(ary2.length);
		System.out.println(ary2[0].length);
		System.out.println(ary2[1].length);
		System.out.println(ary2[2].length);	
		//一次尋訪二為陣列德元素並印出來//aryy2 =>
//		0 0 
//		0 0 0 
//		0 0 0 0 
				for(int[] sub : ary2) { //1.尋訪第一為,肚子裡還是一為
					for(int v : sub) {  //2.訓訪到第一為在一為裡面的房間就拿到int元素了
						System.out.print(v +" "); //print不換行
					}
					System.out.println(); 
				}

				



	}

}
