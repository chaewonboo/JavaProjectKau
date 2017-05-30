//가치매기는 자격 상
public class Example52 implements Example5 {
	private String name;
	private double price;
	
	public Example52(String name, int price){
		this.name=name;
		this.price=price;
	}
	@Override
	public double EstimateValue(int month){
		price=price*0.8;
		for(int i=0; i<month; i++){
			price=price*0.99;
		}
		return price;
	}
	@Override
	public double EstimateValue(){
		return EstimateValue(1);
	}
	
	public String toString(){
		return String.format("Car name: %s\n initial price:%f \n", name, price);
	}
}
