package basic;

public class Pen {
  String col;
  String com;
  float price;
  public Pen(String color,String com,float price) {
	  this("red","class");
	  this.col=color;
	  this.com=com;
	  this.price=price;
	  System.out.println("cons with 3 val");
  }
  public Pen(String color,String com) {
	  this("red");
	  this.col=color;
	  this.com=com;
	  System.out.println("cons with 2 val");
  }
  public Pen(String color) {
	  //this("red","class",10.0f);
	  System.out.println("cons with 1 val");
  }
  public static void main(String[] args) {
	  System.out.println("Main");
	  Pen p=new Pen("red","class",10.0f);
	  System.out.println(p.col);
	  System.out.println( p.com);
	  System.out.println(p.price);
	 
  }
}
