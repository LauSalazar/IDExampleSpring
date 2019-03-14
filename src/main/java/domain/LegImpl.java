package domain;

public class LegImpl implements Leg{
	
	private String type;
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void move() {
		System.out.println("Moving leg: "+type);
	}

}
