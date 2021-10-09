package builder;
import java.util.*;
public abstract class BreadBuilder {

	String name;
	List<String> ingredients = new ArrayList<String>();
	public abstract BreadBuilder addFlour();
	public abstract BreadBuilder addWater();
	public abstract BreadBuilder addSalt();
	public abstract BreadBuilder addRyeGrain();

	public Bread build() {

		Bread bread = new Bread();
		bread.setName(this.name);
		bread.addIngredients(ingredients);
		return bread;
	}
}
