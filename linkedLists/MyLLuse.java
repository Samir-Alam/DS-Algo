package linkedLists;

public class MyLLuse {

	public static void main(String[] args) {

		MyLinkedList<String> myLL = new MyLinkedList<>();
		
		for(int i = 0; i<10; i++) {
			myLL.add(i+" Added");
		}
		myLL.set("Samir", 5);
		
//		myLL.add(12);
//		myLL.add(34);
		
		myLL.print();

	}

}
