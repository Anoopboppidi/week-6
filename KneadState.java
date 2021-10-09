package builder;

public class KneadState implements State {
	BreadController breadController;

	public KneadState(	BreadController breadController) {
		this.breadController = breadController;
	}

	@Override
	public void doWeighing() {

		System.out.println("Weighing is already done");
	}

	@Override
	public void doKneading() {
		System.out.println("Kneading the dough");
		breadController.setState(breadController.getRiseState());

	}

	@Override
	public void doRising() {

		System.out.println("Rising not ready");
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
		return " kneading";
	}

}
