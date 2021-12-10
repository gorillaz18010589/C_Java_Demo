package ob;
//*static存在的意義：不用物件實體化就可以用,Math.random也不用物件實體化,但為什麼方在裡面,分類的概念而已

import Vedio.TWID;

public class H_6_TWID執行 {

	public static void main(String[] args) {

		//1.用static方法,不用物件實體化就可以直接玩,但是因為沒有物件實體化,你也玩不到物件的屬性
		TWID.m1(); //Hello World
		
		//2.判斷第一個字是否為英文字
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String pwd = "H123594585";
		
		//取得第一個數字
		String a = pwd.substring(0,1);
		System.out.println(a);
		
		//是否有包英文
		if(letters.contains(a)) {
			System.out.println("有包含英文字");
		}else {
			System.out.println("沒有包含英文字");
		}
		
		//========================以上為簡單示範
		
		//3.開始測試正規表示法的驗證身分證號是否正確
		if(TWID.checkId("M140051653")) {
			System.out.println("正確");
		}else {
			System.out.println("不正確");
		}
	}

}
