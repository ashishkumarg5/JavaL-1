public class RectangleDriver{
	public static void main(String args[])
	{
		Rectangle ref=new Rectangle();
		ref.length=139.5f;
		ref.width=19f;
		ref.area = ref.calculateArea(ref.length,ref.width);
		ref.perimeter = ref.calculatePerimeter(ref.length, ref.width);
		
		Rectangle ref1 =new Rectangle();
		ref1.length=122f;
		ref1.width=90.3125f;
		ref1.area = ref1.calculateArea(ref1.length,ref1.width);
		ref1.perimeter = ref1.calculatePerimeter(ref1.length, ref1.width);
		
		System.out.println(ref.area);
		System.out.println(ref.perimeter);
		System.out.println(ref1.area);
		System.out.println(ref1.perimeter);
	}
}

class Rectangle{
	float length;
	float width;
	float area;
	float perimeter;

	float calculateArea(float l, float w){
		return l * w;
	}
	
	float calculatePerimeter(float l, float w){
		return ((2*l) + (2*w));
	}
}