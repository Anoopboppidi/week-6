package builder;

public class RyeBreadBuilder extends BreadBuilder{

	public RyeBreadBuilder() {
		this.name = "American Rye bread";
	}
	public BreadBuilder addFlour() {

		return this;
	}
	public BreadBuilder addWater() {
		this.ingredients.add("Water");
		return this;
	}
	public BreadBuilder addSalt() {
		this.ingredients.add("Salt");
		return this;
	}
	public BreadBuilder addRyeGrain() {
		this.ingredients.add("Rye Flour");
		return this;
	}

}
