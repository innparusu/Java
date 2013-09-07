package samples.sample031;

public class Average implements BasicValueIFace {

	@Override
	public int getValue(int[] array) {
		int sum = 0;
		for (int n : array){
			sum += n;
		}
		return sum/array.length;
	}

	@Override
	public String getValueName() {
		return "Average";
	}

}
