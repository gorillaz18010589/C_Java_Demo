package d1_desgin_duck;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("默不作聲");
	}


}
