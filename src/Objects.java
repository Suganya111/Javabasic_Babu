
public class Objects {
	private int length;
	private int breadth;
	public Objects(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
		
	}
	public void setlength(int lenght) {
		this.length=length;
	}
	public int getlength() {
		return length;
	}
	public void setbreadth(int breadth) {
		this.breadth=breadth;
	}
	public int getbreadth() {
		return breadth;
	}
	public int area() {
		return length*breadth;
	}
	public int perimeter() {
		return 2*(length+breadth);
		
	}
	public String tostring() {
		return String.format("length - %d,breadth - %d,area - %d, perimeter - %d", length,breadth,area(),perimeter());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objects objs=new Objects(10,20);
		objs.setbreadth(10);
		System.out.println(objs);

	}

}
