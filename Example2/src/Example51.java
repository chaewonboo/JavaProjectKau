//가치매기는 자격을 부여해야 하니까! 
public class Example51 implements Example5{
	private String name;
	private int age;
	
	public Example51(String name, int age){
		this.name=name;
		this.age=age;
	}
	@Override 
	public double EstimateValue(int month){
		return month*Double.POSITIVE_INFINITY;
	}
	@Override
	public double EstimateValue(){
		return EstimateValue(1);
	}
	public String toString(){
		return String.format("Human name: %s\n initial price:%d \n", name, age);
	}
}
