package builder;

public class FlatBreadBuilder extends BreadBuilder{

	public FlatBreadBuilder() {
		this.name = "American Flatbread";
	}
	public BreadBuilder addFlour() {
		this.ingredients.add("flour");
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
		this.ingredients.add("Rye Grain");
		return this;
	}

}
