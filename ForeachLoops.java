
class ForeachLoops{

	public static void main(String args[]){
		 String[] _sMyList = {"A","B","C","D","E","F"};
		  double[] myList = {5, 4.8,5.0, 1.5};
		
      // Print all the array elements
	  System.out.println(" *****************************************\n Print all the array elements \n *****************************************");
      for (int i = 0; i < myList.length; i++) {
         System.out.println(myList[i] + " ");
      }
	   System.out.println(" *****************************************\n  Print all the array elements myList double  \n *****************************************");
      // Print all the array elements
      for (double element: myList) {
         System.out.println(element);
      }
	     System.out.println(" *****************************************\n  Print all the array elements _sMyList String  \n *****************************************");
      // Print all the array elements
      for (String element: _sMyList) {
         System.out.println(element);
      }
     
      // Summing all elements
      double total = 0;
      for (int i = 0; i < myList.length; i++) {
         total += myList[i];
      }
	    System.out.println(" *****************************************\n Summing all elements \n *****************************************");
      System.out.println("Total is " + total);
      
      // Finding the largest element
      double max = myList[0];
      for (int i = 1; i < myList.length; i++) {
         if (myList[i] > max) max = myList[i];
      }
	  System.out.println(" *****************************************\n  Finding the largest element \n *****************************************");
      System.out.println("Max is " + max);  
	}
}