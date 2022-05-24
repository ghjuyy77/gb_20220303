package override;

public class Navy extends Unit{
	
	public Navy(String name) {
		super(name);
	}
	
	public void attack() {
		super.attack();
		System.out.println(this.getName() + " >> 어뢰발사 ");
		System.out.println(this.getName() + " >> 지상상륙 ");
	}

}
