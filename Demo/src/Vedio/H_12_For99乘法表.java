package Vedio;
//數學叫矩陣,程式是陣列,兩個是不一樣的
//電腦記憶體存放是很笨的他是線性的,他連平面跟空間都沒有所以他是如何表現的呢
//Java是強型別語言,所以你int[]就只能放int跟JS弱型別語言隨便放不一樣
//陣列宣告放入固定元素後,裡面的個數不能再改 >byte[] b = new byte[3]; 就是3個
//*所以元素跟個素不會變的用Array，元素個素會變得用List資料結構等
//例：就像鞋櫃,衣櫃,碗櫃,你去買回來鞋櫃所以宣告,能放幾雙就幾雙,所以你要去鞋櫃就去鞋櫃找就像你宣告int就到這裡面找
//當你完成初始化第一次給值,肚子裡就有東西清清楚楚





public class H_12_For99乘法表 {

	public static void main(String[] args) {
		// Array 是大於 Matrix矩陣的
		// Java裡面的Arrray他是Object
		
		//我想宣告一個整數陣列名字叫a,他有整數陣列的空間,每一個元素都是int型別
		int[]a;
		//宣告一個byte[]並且第一次給值進行初始化,因為陣列是物件,所以要new一個空間裡面有3個元素
		byte[] b = new byte[3];
		
		//當你完成初始化第一次給值,肚子裡就有東西清清楚楚,所以有0
		System.out.println(b[0]);//0
		System.out.println(b[1]);//0
		System.out.println(b[2]);//0
		System.out.println("==========================");
		
		//1.查看陣列裡的個數方式
		a = new int[4];
		System.out.println(a.length); //4
		
		//2.用index方法尋訪陣列尋訪裡面元素的方式(如果在意index的話可以用這招)
		for(int i =0; i<a.length; i++) {
			System.out.println("int[4]:" + a[0]); //0,0,0,0
		}
		//3.for-each尋訪,不需要index跑陣列裡的每個元素(存粹只是想要裡面的值)
		for(int v : a) { //for(1.肚子裡元素int 加變數名v : 2.要被尋訪的東西)
			System.out.println(v); //0,0,0,0
		}
		
		//4.1初始化時給值的方式
		int [] hg = new int [] {0,1,2,3};
		for(int i :hg) {
			System.out.println(i); //0,1,2,3
		}
		//4.2初始化時給值的方式直接給值(此招只能宣告同時直接給值)
				int [] hgd = {97,98,99};//97,98,99
				for(int i :hgd) {
					System.out.println(i); //
				}
		
		
		//超過給值的元素但沒,但沒編譯沒罵錯,因為你只要放 //int>0 合理他不會罵,int可以放兩億多個
//		System.out.println(b[3]);//Runtime出錯,因為這個位置沒元素了
		System.out.println("==========================");

		//查看8大基本型別初始化後肚子裡的東西是何物
		int[] i = new int[1]; 
		byte[] c = new byte[1];
		long[] l = new long[1];
		short[] s = new short[1];
		float [] f = new float[1];
		boolean [] d = new boolean[1];
		long[] e = new long[1];
		double[] g = new double[1];
		System.out.println("int[]:"+i[0]);//int[]:0
		System.out.println("byte[]:" +c[0]);//byte[]:0
		System.out.println("long[]:"+ l[0]); //long[]:0
		System.out.println("short[]:" +s[0]); //short[]:0
		System.out.println("float[]:" +f[0]); //float[]:0.0
		System.out.println("boolean[]:" +d[0]); //boolean[]:false
		System.out.println("long[]:" +e[0]);//long[]:0
		System.out.println("double[]:" + g[0]); //double[]:0.0


		

		
		
		
		
		

		
		
		
		
		
	}

}
