package Vedio;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

//目的：產生樂透好,因為set元素不重複,且沒有順序性
/*
* Collection:其中兩個最大的系列是一個叫set(集合)一個叫list
* set:這組東西,東西不會重複,你丟重複進去的東西他不會收
* set:資料是亂排序的,沒有順序性
* set:順序跟排序是沒有關係的,1,2,3叫順序裡面東西是亂丟的
* Interface Set<E>set還是介面,所以要HashSet等來實作
* iterator()：迭代器,就是一個一個取出來的意思,像釣魚捲線器把線沉底,一個方向一隻一隻把魚拉起來,拉完後就沒有了,所以一次拿完全部東西
*/

/*
 * 犯行：你想丟的資料型別
 * 做犯行你丟什麼資料叫要什麼型別,我們丟了Integer那就只能整數在裡面,你丟String或byte都不行
 * //只要是Ｃollection都可以for eachfor each拿資料更好用
 * */

/*
 * treeSet:特性,元素獨一無二,但有排序
 * 
 * 
 * */
public class Ｈ48_HashSet_樂透範例 {
	public static void main(String[] args) {
		
		//1.隨機產生1~46的數字,5個號碼
		HashSet<Integer> set = new HashSet<>();
		while(set.size() <6) {
		int  rand =	(int)(Math.random()*46+1);
		set.add(rand);
		}
		System.out.println(set.toString());//[32, 35, 19, 38, 44, 45]
		
		//2.尋訪撈出一個一個元素
		  for(Integer i : set) {
			  System.out.println(i);//撈出資料一個一個//32.35.19.38.44.45
		  }
		  
		  System.out.println("========================");
		  
		  //3.用Arrays.sort去排序元素
		  Object[] obj = set.toArray(); //轉成物件陣列
		  Arrays.sort(obj); //排序物件元素
		  
		  //4.尋訪一個一個撈出來
		  for(Object o : obj) {
			  System.out.println(o);  //19.32.35.38.44.45 以排序完成
		  }
		  
		  
		  //5.直接用treeSet特性直接排序,只是HashSet換成TreeSet即可排序
			TreeSet<Integer> set2 = new TreeSet();
			while(set2.size() <6) {
			int  rand =	(int)(Math.random()*46+1);
			set2.add(rand);
			}
			System.out.println(set2.toString());
			
			//尋訪
			  for(Integer i : set2) {
				  System.out.println(i);//撈出資料一個一個// 6,32,34,40,44,45
			  }
	}

}
