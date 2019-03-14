package domain;

public class RobotImpl implements Robot{
	
	private Head head;
	private Arm leftArm;
	private Arm rigthArm;
	private Leg leftLeg;
	private Leg rigthLeg;
	
	@Override
	public void move() {
		head.move();
		leftArm.move();
		rigthArm.move();
		leftLeg.move();
		rigthLeg.move();
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public Arm getLeftArm() {
		return leftArm;
	}

	public void setLeftArm(Arm leftArm) {
		this.leftArm = leftArm;
	}

	public Arm getRigthArm() {
		return rigthArm;
	}

	public void setRigthArm(Arm rigthArm) {
		this.rigthArm = rigthArm;
	}

	public Leg getLeftLeg() {
		return leftLeg;
	}

	public void setLeftLeg(Leg leftLeg) {
		this.leftLeg = leftLeg;
	}

	public Leg getRigthLeg() {
		return rigthLeg;
	}

	public void setRigthLeg(Leg rigthLeg) {
		this.rigthLeg = rigthLeg;
	}
}
