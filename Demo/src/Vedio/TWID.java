package Vedio;
//https://www.youtube.com/watch?v=TmXZtmToYho&feature=youtu.be
//https://www.youtube.com/watch?v=05Nue2wIPA8&feature=youtu.be
//只要這個物件能夠成行,他裡面的身分證一定是合理的
//1.可以判斷男生女生 不是1就是2
//2.你可以查詢你的身分證號,但不能改
//3.也可以查詢你的所在地
//4.設計類別一定要有意義
//*建構式：你對這個建構式的期待是什麼,這邊期待是身分證字號產生器
//*大小寫定義：屬性全小寫,動詞後首自大寫
//*this的概念：就是我這個物件所產生出來的那個(this)物件,所以屬性id就是this(那個物件) .(裡面的id)
//*this 寶寶就是自己物件的概念this 跟朕一樣
//*this建構式再將該物件初始化,已經有腳踏車把它變藍色,所以早就有物件了,才敢講this
//*static存在的意義：不用物件實體化就可以用,Math.random也不用物件實體化,但為什麼方在裡面,分類的概念而已
//*satic:可以使用在跟物件屬性無關的地方,因為你沒有物件實體化所以玩不了該物件的屬性
//*static:針對你傳遞進來的參數做處理
//身分證字號的邏輯：1.長度要為10瑪 2.第一碼要為英文字 3.第二馬不是1就是2  4.第三馬到最後都要是數字

//正規表示法：
//H_7有詳細介紹
//*1945年就有人發明,利用數學符號來做模型
//*透過符號,幾乎所有都有支援
//String.matches(String regex)
//email格式也可以用,
//java命名規則：[a-zA-Z$_][a-zA-Z0-9$_]* => 第一個字可以a~z大小寫和_ 第二個字可以a~z大小寫家0~9數字和

//7..身分證字號檢查成功後要將英文字轉成特定數字
/*
 *因為沒有Ａ＿Ｚ對應的數字沒有照順序,可以用陣列處理 
 * 
 * */

/*9大基本型別都有物件類別,稱為wripper包裝類別
 * 1.因為他把基本型別包裝成物件
 * */

/* 10.建構式設計概念：this() =>呼叫本類別其他建構式的應用
 * 這四個建構是定位都是產生器,所以雞給最後一個TWID(boolean isMale , int area)去做演算即可,不用寫四次吧
 * 因為這個要產生男生或女生,地區int只是個條件,條件參數輸入即可,條件ok給下一個處理,最後交給最後一個建構是處理演算,邏輯不用寫4
 * 建構式如果邏輯一樣用重複寫反而容易出錯,且維護性差,且有一天如果想改一個小小東西,因為有的改有的沒改反而影響
 * this() =>呼叫本類別的其他建構式
 * 所以男生女生你給我一組true/false參數我推給public TWID(boolean isMale) {	}處理即可
 * 建構是裡面的第一道敘述句,不寫是super叫爸,寫有兩種情況, 1.super()父類別其他建構式 2.this() =>呼叫本類別其他建構式
 * 好處：邏輯都是產生一個身分證字號,但彈性很大,邏輯丟給一個建構式處理,其他建構式負責接收參數,丟給最後一個建構是處理邏輯罷了
 * */

public class TWID {
	private String id; //參數id
	
	//1.定位在什麼都不給你,你幫我產生一組亂數
	public TWID() {
		//this(boolean isMale) =>呼叫本類別此boolean參數建構式,推給他去處理
		// 產生0,1兩個亂數,等於0的為true,1的為false
		this((int)(Math.random()*2) ==0);
		
	}
	//2.產生男生或女生的身分證但區域亂數(true/false決定男女生)(建構式)
	public TWID(boolean isMale) {
		
		//使用者輸入了true/false,我們有了使用者輸入的男女生參數,再來隨機產生亂數區域即可
		//public TWID(boolean isMale , int area)  呼叫本類別的此建構式,因為有了使用者的男女生,我們區域隨機產生自己處理即可
		this(isMale, (int)(Math.random()*26)); 
		
	}
	//3.產生指定地區的身分證但男女生亂數(輸入int產生指定那個地區得身分證)
	public TWID(int area) {
		//呼叫本類別的此建構式public TWID(boolean isMale , int area) ,男女生亂數,區域依你給我的參數,剩下演算交給下面處理
		this((int)(Math.random()*2) ==0, area);
	}
	
	//4.產生指定性別,跟地區的身分證(最終都有來這的處理演算建構式)
	public TWID(boolean isMale , int area) {
		
	}
//	//這裡參數也是id那建構式肚子裡的id跟屬性id要怎麼區分
//	//就是生命範圍與他越接近的那個所以這邊id(String id) 那屬性id就改用this.id 朕的概念
//	//也有可能是詞窮呀,想不到新的變數id名稱
//	//但因為如果對方丟的是hank這種奇怪字串無法區別,所以暫時註解
//	public TWID(String id) {  
//		this.id = id;  //傳遞近來的參數id裝入到屬性id裡
//	}
	
	//6.static,不用物件實體化就可以用
	public static void m1() {
		System.out.println("Hello World");
	}
	//7.檢查身份證是否合理 (針對你傳遞進來的id參數判斷是否合理回傳true/false)
	public static boolean checkId (String id) {
		//A.宣告一開始都是false,如果都是false直接return掉
		boolean ret = false;
		
		//B.如果有符合正規表示法的身分證的話
		if(id.matches("[A-Z][12][0-9]{8}")) {
			String letters ="ABCDEFGHJKLMNPQRSTUVXYWZIO"; //10~35的對應數字,A=10 0+10
			//C.抽出身分證字號的第一個字字元
			char c0 = id.charAt(0);  //取得字串內的指定字元
			System.out.println(c0);
			//D.取得的英文字再ltters的第幾個位置,再加10
			int n12 = letters.indexOf(c0) +10;//因為char 是0~655所以自動轉型int,這邊變數名稱是配合身分證字號邏輯
			System.out.println(n12);
			
			//E.取得十位數跟個位數
			int n1 = n12/10 ; //取得十位數
			int n2 = n12%10; //取得個位數
			System.out.println("n1:" + n1 +"n2:" +n2);
			
			//F.取得n3~n11
			int n3 = Integer.parseInt(id.substring(1,2)); //抓取幾到幾之間的字串位置(1.開始位置2.結束位置)
			int n4 = Integer.parseInt(id.substring(2,3));
			int n5 = Integer.parseInt(id.substring(3,4));
			int n6 = Integer.parseInt(id.substring(4,5));
			int n7 = Integer.parseInt(id.substring(5,6));
			int n8 = Integer.parseInt(id.substring(6,7));
			int n9 = Integer.parseInt(id.substring(7,8));
			int n10 = Integer.parseInt(id.substring(8,9));
			int n11= Integer.parseInt(id.substring(9,10));
			System.out.println(n3+"\n" +n4 +"\n" +n5 +"\n" +n6 +"\n" +n7+"\n" +n8 +"\n" +n9+"\n" +n10 +"\n" +n11);
			
			//G.套入身分證公式
			int sum = n1 *1  + n2*9 + n3 *8 + n4*7 + n5*6 + n6*5 + n7*4 + n8*3 +n9*2 + n10*1 + n11*1;
			System.out.println(sum);
			
			//H回傳如果sum%10 ==0 代表合格
			 ret = sum% 10 == 0;
		}
		
		return ret;
	}
	//1.讓你可以看id但不能改
	public String getId() {
		return id;
	}
}
