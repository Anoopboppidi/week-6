package builder;

public class WeighState implements State {
	BreadController breadController;
	public WeighState(BreadController breadController) {
		this.breadController = breadController;
	}

	@Override
	public void doWeighing() {
		System.out.println("Weigh the flour, sugar and other ingredients and mix them ");
		breadController.setState(breadController.getKneadState());
	}

	@Override
	public void doKneading() {
		System.out.println("Kneading not ready");

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
		return " weighing";
	}

}
