package builder;

public class BreadController {
	State weighState;
	State kneadState;
	State riseState;
	State bakeState;
	State packState;
	State state;

	public BreadController() {
		weighState = new WeighState(this);
		kneadState = new KneadState(this);
		riseState = new RiseState(this);
		bakeState = new BakeState(this);
		packState = new PackState(this);

		state = weighState;

	}
	public void weigh() {
		state.doWeighing();

	}
	public void knead() {
		state.doKneading();
	}
	public void rise() {
		state.doRising();
	}
	public void bake() {
		state.doBaking();
	}
	public void pack() {
		state.doPacking();
	}
	public State getState() {
		return this.state;
	}
	public void setState(State state) {
		this.state = state;

	}
	public State getWeighState() {
		return weighState;
	}
	public State getKneadState() {
		return kneadState;
	}
	public State getRiseState() {
		return riseState;
	}
	public State getBakeState() {
		return bakeState;
	}
	public State getPackState() {
		return packState;
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n------- New York Bakery -------");
		result.append("\nBread is " + state + "\n");
		return result.toString();
	}
}
