package d1_desgin_duck;
/*
 *(1) .FlyBehavior來代表飛的行為，QuackBehavior代表叫的行為，而讓每一種行為具體類來實現該行為接口。
    在此，我們有兩個接口，FlyBehavior和QuackBehavior，還有它們對應的類，負責實現具體的行為：
    (2).FlyWithWings,Quack等類別去實作飛行行為，跟瓜瓜行為
    (3).
    將應用中可能需要變化的部分，獨立出來，不要和那些不變的代碼混在一起。
 * */
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior; 
	
	public void swim() {
		System.out.println("所有的鴨子都會漂浮，甚至誘餌");
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	//鴨子不是自己叫,而是將這個行為委託給QuackBehavior,所參考的物件
	public void performQuack() {
		quackBehavior.quack();
	}
	
    public abstract void display();//各種外觀不一樣，所以為抽象

	
	
}
