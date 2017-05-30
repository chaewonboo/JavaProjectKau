
public class Human implements Valuable{
	private String name;
	private int age;
	public Human(String name, int age){
		this.name=name;
		this.age=age;
	}
	@Override public double EstimateValue(int month){
		return month*Double.POSITIVE_INFINITY;
	}
	@Override public double EstimateValue(){
		return EstimateValue(1);
	}
	public String toString(){
		return String.format("Human name:%s\n registered age: %d\n", name, age);
	}
}
