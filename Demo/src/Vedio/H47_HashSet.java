package Vedio;

import java.util.HashSet;
import java.util.Iterator;

//陣列也算一種資料結構,可是java因為型別跟長度固定有時很難用,所以改用Collection
/*//Interface Collection<E>
 *  :犯行：指定這個<元素型別>,只要是物件通通可以丟進來,基本型別所存放的東西叫值
 * java的資料結構只能放物件不能放型別,但因為java8大基本型別都封裝了,所以你把基本型別丟進去他自動封裝
 * Collection:其中兩個最大的系列是一個叫set(集合)一個叫list
 * set:這組東西,東西不會重複,你丟重複進去的東西他不會收
 * set:資料是亂排序的,沒有順序性
 * set:順序跟排序是沒有關係的,1,2,3叫順序裡面東西是亂丟的
 * Interface Set<E>set還是介面,所以要HashSet等來實作
 * iterator()：迭代器,就是一個一個取出來的意思,像釣魚捲線器把線沉底,一個方向一隻一隻把魚拉起來,拉完後就沒有了,所以一次拿完全部東西
 
 * 
 * list:資料是一串一串的,資料是可以重複的
 * list:是有順序性的,有index存在
 * 資料結構的用法,依你的要順序或不順序,要重複或不重複而使用
 * */
public class H47_HashSet {
	public static void main(String[] args) {
			//1.宣告時就拿到這個物件丟基本型別會自動封裝成物件
			HashSet set = new HashSet();
			set.add("hank");
			set.add(123); //雖然丟的是int,但進去會自動封裝成物件 auto-boxing => Interger Objet
			set.add(12.3);
			//size() ：查詢這堆有幾個元素（回傳int幾個)
			System.out.println(set.size()); //3個
			
			//2.沒有重複性
			set.add("hank"); //這裡重複丟了一個一樣的hank,但並沒有被加進去
			set.add(567);
			System.out.println(set.size()); //顯示4個因為上面hank重複並沒有被加進去
			
			//3.沒有順序性
			System.out.println(set.toString());//[12.3, hank, 567, 123] 沒有照你丟的順序,這是亂丟的
			
			//4.用迭代器去尋訪元素
			Iterator  it = set.iterator(); //用迭代器物件（回傳迭代氣<你的資料結構>）
			while(it.hasNext()) { //當迭代器裡面的元素還有下一個時
				Object object = it.next(); //當還有下一個元素時(回傳該物件)
				System.out.println(object.toString()); //12.3,hank,567,123
			}
			
	
			//5.判斷裡面是否有為空,有元素false,沒元素true
			boolean  b = set.isEmpty(); 
			System.out.println(b);  //false,裡面有元素所有false
			
			//6.如果刪除的指定元素有在其中,刪除成功回傳true
			boolean c = set.remove("hank");
			System.out.println(c);
			
			//7.刪除裡面所有元素
			set.clear();
			System.out.println(set); //[] =>都清掉元素所以為空
	}

}
