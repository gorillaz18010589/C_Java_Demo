package d1_desgin_duck;

public class Suack implements  QuackBehavior{

	@Override
	public void quack() {
		System.out.println("啾啾聲");		
	}

}
