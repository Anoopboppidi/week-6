package builder;

public class PackState implements State {
	BreadController breadController;

	public PackState(BreadController breadController) {
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

		System.out.println("Kneading is already done");
	}

	@Override
	public void doBaking() {

		System.out.println("Kneading is already done");
	}

	@Override
	public void doPacking() {
		//LETS BUILD BREAD WITH BUILDER PATTERN
		System.out.println("Bread is ready and packed");
		BreadBuilder breadBuilder = new FlatBreadBuilder();
		Bread bread = breadBuilder.addFlour().addRyeGrain().addSalt().addWater().build();
		bread.prepare();
		bread.weighing();
		bread.kneading();
		bread.proofing();
		bread.rising();
		bread.shaping();
		bread.baking();
		bread.spraying();
		bread.packing();

		System.out.println("----------Rye Bread--------");
		breadBuilder = new RyeBreadBuilder();
		bread = breadBuilder.addFlour().addRyeGrain().addSalt().addWater().build();
		bread.prepare();
		bread.weighing();
		bread.kneading();
		bread.proofing();
		bread.rising();
		bread.shaping();
		bread.baking();
		bread.spraying();
		bread.packing();
	}
	public String toString() {
		return " packing";
	}
}
