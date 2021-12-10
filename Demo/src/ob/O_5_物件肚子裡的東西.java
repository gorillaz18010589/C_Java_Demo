package ob;
//String是物件
//基本型別是裝其值,物件是裝記憶體位置,所以物件需要記憶體位置告訴我去哪裡找得到
//物件型別初始化new丟進去那就是記憶體位置
//String 在java裡是物件,比的是記憶體位置,比較是否是相同物件

public class O_5_物件肚子裡的東西 {

	public static void main(String[] args) {
		
		
		//當String看到“” 他會自動配出一個記憶體放進去
		//而當你s2 也用"hank" 有這個記憶體位置的東西噎,所以他也把他位置指向到同個記憶體
		//所以你比較是同個記憶體位置,所以true,所以他沒有用new這字眼,因此他不是因為值一樣而是因為記憶體位置指向一樣
		String s1 = "hank"; //1.直接拿到一個物件不用new的方法
		String s2 = "hank";
		System.out.println(s1 == s2); //true
		System.out.println("===============");
		
		//new出一個記憶體空間，不同的記憶體空間怎麼可能會一樣,所以是false
		String s3 = new String("hank");
		String s4 = new String("hank");
		System.out.println(s3 == s4 );//false
		
		//因為無法比較值所以有一招equals可以來比較內容是否一樣
		System.out.println(s3.equals(s4)); //true
		//8大基本型別這個比較的是肚子的東西值是否一樣,因為值一樣所以true
		int a =10 , b=10;
		System.out.println(a==b); //true
		
		//原生的Objec.equals在沒改寫的情況是跟兩個==好一樣,比較物件
		
	}

}
