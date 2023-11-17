package abstraction;

public class Childcraft extends Parentcraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Childcraft c = new Childcraft();
		c.engine();
		c.safetyguidelines();
		c.yeshwnath();
		c.bodycolour();

	}

	@Override
	public void bodycolour() {
		// TODO Auto-generated method stub
		System.out.println("this method we can abstract method");
		
	}

}
