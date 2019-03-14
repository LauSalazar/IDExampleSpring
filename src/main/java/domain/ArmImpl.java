package domain;

public class ArmImpl implements Arm{
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void move() {
		System.out.println("Moving arm: "+type);
		
	}

}
