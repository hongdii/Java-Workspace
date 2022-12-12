package pakage3.model.vo;

public abstract class Animal {
	private String name;
	private String kinds;
	
	// 클래스 다이어그램에서 #은 default임 아무 접근제한자를 붙히지않은상태
	Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", kinds=" + kinds + "]";
	}
	
	public abstract void speak();
}
