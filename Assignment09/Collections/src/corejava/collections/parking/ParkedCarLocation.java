package corejava.collections.parking;

public class ParkedCarLocation {

	private int floor;
	private int section;
	
	public ParkedCarLocation(int floor, int section) {
		this.floor = floor;
		this.section = section;
	}
	
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	
	
}