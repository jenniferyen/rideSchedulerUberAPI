
public class SchedulerAlgorithm {
	
	// private fields
	private int[] allPrices;
	private int benchmark = 0;
	private int POSITIVE_INFINITY;
	private int targetPrice = 0;
	
	public int algorithm (int[] inputs) {
		allPrices = inputs;
		
		// Loop through first ln(n) and find the max. This is the benchmark.
		for (int i = 0; i < (int) (Math.log(allPrices.length)); i++) {
			int smallest = 0;
			if (allPrices[i] < POSITIVE_INFINITY) {
				smallest = allPrices[i];
			}
			if (allPrices[i] < smallest) {
				smallest = allPrices[i];
				benchmark = smallest;
			}
		}
		
		// Loop through all prices. Find the next price lower than the benchmark.
		for (int price : allPrices) {
			// Benchmark should never equal 0 if inputs are correct.
			if (benchmark != 0) {
				if (price < benchmark) {
					// Make a call to the API
				}
			}
			targetPrice = price;
		}
		// This should be the price we're looking for. 
		return targetPrice;
	}
}
