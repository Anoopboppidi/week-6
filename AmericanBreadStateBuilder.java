package builder;

public class AmericanBreadStateBuilder {

	public static void main(String[] args) {
		BreadController breadController = new BreadController();
		System.out.println(breadController);

		breadController.rise();
		breadController.pack();
		breadController.bake();

		System.out.println(breadController);
		breadController.weigh();

		System.out.println(breadController);
		breadController.knead();

		System.out.println(breadController);

		breadController.rise();

		System.out.println(breadController);

		breadController.bake();

		System.out.println(breadController);

		breadController.pack();

	}

}
