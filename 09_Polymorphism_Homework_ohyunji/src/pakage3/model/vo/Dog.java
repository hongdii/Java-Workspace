package pakage3.model.vo;

public class Dog extends Animal{
	
	public String PLACE = "애견카페";
	private int weight;
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
		// TODO Auto-generated constructor stub
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void speak() {
		
	}
}
