
public class Main {
	public static void main (String[] args) {
		//excercise #2
		Rectangle rec = new Rectangle();
		rec.setHeight(10);
		rec.setWidth(15);
		System.out.println("new Rectangle: width= "+rec.getWidth()+" height= "
				+rec.getHeight()+" perimeter: "+rec.getPremieter()+" area: "+rec.getArea());;
		
		//excercise #3
		//rodesac arainicializebul obieqtze vcdilob metodis gamodzaxebas
		//		Rectangle rec; 
		//		rec.getArea();
		
		//rodesac null-ze vcdilob emtodis gamodzaxebas
		//		Rectangle rec = null;
		//		rec.getArea();
		
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle();
		System.out.println(rec1==rec2);
		
		rec1 = rec2;
		System.out.println(rec1==rec2);
		
		
		
		
		//excercise #5
		//compile time error
		//	int k = 5;
		//	int k;
		
		//araa erori kompilaciis radgan k cvladi mxolod if-shi cocxlobs
		if(1==1) {
			int k=5;
		}
		int k=3;
		
	}
	
	//excercise#4
	public int compareTwoRecs (Rectangle rec1, Rectangle rec2) {
		if(rec1.getArea()>rec2.getArea()) {
			return 1;
		}else if(rec1.getArea()<rec2.getArea()) {
			return -1;
		}else {
			return 0;
		}
	}
}
