package builder;
import java.util.*;
public class Bread {
	String name;
	List<String> ingredients;
	public void addIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
	void prepare() {
		System.out.println("\nPrepare " + name);
		System.out.println("Place the ingredients in a bowl");
		for(String ingredient : ingredients) {
			System.out.println("ingredient : " + ingredient);
		}
	}
	void weighing() {
		System.out.println("\nWeighing and mixing ingredients");
	}
	void kneading() {
		System.out.println("By kneading the dough the network of gluten is formed and air bubbles.");
	}
	void proofing() {
		System.out.println("Leave the dough for 30 to 50 minutes");
	}
	void rising() {
		System.out.println("Divide the dough into pieces");
	}
	void shaping() {
		System.out.println("Fold the dough to be used in baking fun");
	}
	void baking() {
		System.out.println("Bake at temparature of 200 to 260 Celcius");
	}
	void spraying() {
		System.out.println("Lighly spray with water");

	}
	void packing() {
		System.out.println("Cool the bread down, cut it and pack it\n");
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("-----" + this.name + "-----\n");
		for(String ingredient: ingredients) {
			display.append(ingredient + "\n");
		}
		return display.toString();
	}
}
