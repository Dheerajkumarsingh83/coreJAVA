package THISKEYWORD;

class Demo
{
 Double width, height, depth;
 Demo (double w, double h, double d)
 {
  this.width = w;
  this.height = h;
  this.depth = d;
 }
 public static void main(String[] args) {
	 Demo d = new Demo(10,20,30);
	 System.out.println("width = "+d.width);
	 System.out.println("height = "+d.height);
	 System.out.println("depth = "+d.depth);
 }
}