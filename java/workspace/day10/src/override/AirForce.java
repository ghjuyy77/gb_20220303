package override;

public class AirForce extends Unit{

	public AirForce(String name) {
		super(name);
	}
	public void attack() {
		super.attack();
		System.out.println(this.getName() + " >> 공중공격 ");
		System.out.println(this.getName() + " >> 지상이륙 ");
	}

}
