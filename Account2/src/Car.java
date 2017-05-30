
public class Car implements Valuable{
	private String name;
	private double price;
	
	public Car(String name, double price){
		this.name=name;
		this.price=price;
	}
	@Override public double EstimateValue(int month){
		price=price*0.8;
		for(int i=0; i<month; i++){
			price=price*0.99;
		}
		return price;
	}
	@Override public double EstimateValue(){
		return EstimateValue(1);
	}
	public String toString(){
		return String.format("car name: %s\n initial price: %f\n", name, price);
	}
}
