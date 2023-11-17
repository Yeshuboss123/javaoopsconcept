package Interface;

public class australiantraffic implements centraltraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		centraltraffic a =new australiantraffic();
		a.yellowlight();
		a.redstop();
		a.greengo();

	}

	@Override
	public void greengo() {
		System.out.println("U can go no need to wait");
		
	}

	@Override
	public void redstop() {
		System.out.println("u need to stop");
		
	}

	@Override
	public void yellowlight() {
		// TODO Auto-generated method stub
		System.out.println("Wait");
	}

}
