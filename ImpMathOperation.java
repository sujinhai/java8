package java8;

public class ImpMathOperation {
	
	//a,b都是普通的参数，mathOperation指定了具体的运算逻辑
	public int operate(int a,int b,MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
	
	public static void main(String args[]) {
		ImpMathOperation t = new ImpMathOperation();
		
		//以下的动作就相当在实现接口的同时也指定了具体的方法逻辑。
		//普通的加满乘除
		MathOperation add = (a,b) -> a+b;
		MathOperation sub = (int a,int b) -> a-b;
		MathOperation mul = (int a,int b) -> a*b;
		MathOperation div = (int a,int b) -> {return a/b;};
		//定义特殊的逻辑计算
		MathOperation type1 = (int a,int b) -> (a+b)*a;
		MathOperation type2 = (int a,int b) -> (a+100)*(b-30);
		
		
		System.out.println(t.operate(1, 2, add));
		System.out.println(t.operate(3, 4, sub));
		System.out.println(t.operate(1, 2, mul));
		System.out.println(t.operate(3, 4, div));
		System.out.println(t.operate(3, 4, type1));
		System.out.println(t.operate(3, 4, type2));
		
	}
		
}
