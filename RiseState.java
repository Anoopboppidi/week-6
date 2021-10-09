package builder;

public class RiseState implements State {
	BreadController breadController;

	public RiseState(BreadController breadController) {
		this.breadController = breadController;
	}

	@Override
	public void doWeighing() {
		System.out.println("Weighing is already done");

	}

	@Override
	public void doKneading() {
		System.out.println("Kneading is done");

	}

	@Override
	public void doRising() {
		System.out.println("The dough is rising");
		breadController.setState(breadController.getBakeState());

	}

	@Override
	public void doBaking() {
		System.out.println("Baking not ready");

	}

	@Override
	public void doPacking() {
		System.out.println("Packaging not ready");

	}
	public String toString() {
		return " rising";
	}

}
