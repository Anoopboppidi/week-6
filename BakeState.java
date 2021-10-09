package builder;

public class BakeState implements State {
	BreadController breadController;
	public BakeState(	BreadController breadController) {
		this.breadController = breadController;
	}

	@Override
	public void doWeighing() {
		System.out.println("Weighing is already done");

	}

	@Override
	public void doKneading() {
		System.out.println("Kneading is already done");

	}

	@Override
	public void doRising() {
		System.out.println("Rising bread is already done");

	}

	@Override
	public void doBaking() {
		System.out.println("Baking Bread");
		breadController.setState(breadController.getPackState());

	}

	@Override
	public void doPacking() {
		System.out.println("Packaging not ready");

	}
	public String toString() {
		return " baking";
	}

}
