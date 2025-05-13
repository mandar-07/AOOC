public class area{
	public static void main(String args[]){
	   Area rec=new Area();
	     rec.setDim(5,4);
	    double res =rec.getArea();
	   System.out.println("Area is:"+res);
	}
}
class Area{
	int length;
	int breadth;
      
	public	void setDim(int l,int b){
	   length=l;
	   breadth=b;
	}

	double getArea(){
	  return length*breadth;
	}

}
