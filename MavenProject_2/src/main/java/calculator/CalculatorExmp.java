package calculator;

public class CalculatorExmp implements Addition, Substraction, Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorExmp calc=new CalculatorExmp();
		
		int sum=calc.add(20, 30);
		System.out.println("Sum ="+sum);
		int diff=calc.subtract(50, 30);
		System.out.println("Difference ="+diff);
		int product=calc.multiply(20, 20);
		System.out.println("Product ="+product);

	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

}
