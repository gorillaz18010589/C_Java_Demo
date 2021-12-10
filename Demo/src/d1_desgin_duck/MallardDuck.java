package d1_desgin_duck;
//	綠頭鴨
//1.繼承Duck
//2.display()為傅類別Duck的抽象方法,因為每隻鴨子外觀不同所以抽象讓後代實作
//3.quackBehavior 為Duck屬性他是呱呱叫行為為interface = new  Quack() ->為已經實作呱呱叫行為的類別

public class MallardDuck extends Duck{
 
	public MallardDuck (){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	@Override
	public void display() {
			System.out.println("我是一隻真的綠頭鴨");
	}

}
