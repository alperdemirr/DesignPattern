
public class Test {

	public static void main(String[] args) {
		
		Strategy strategySum = new Sum();
		Context context = new Context(strategySum);
		int res = context.executeStrategy(1, 2);
		System.out.println("Result " + res);

		Strategy strategySubtract = new Sum();
		Context context2 = new Context(strategySubtract);
		res = context2.executeStrategy(3, 2);
		System.out.println("Result " + res);
	}

}
