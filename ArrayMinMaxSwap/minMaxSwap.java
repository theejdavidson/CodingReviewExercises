import java.lang.Math;// headers MUST be above the first class
// one class needs to have a main() method
public class minMaxSwap//Swaps the min and max values of a given array
{

  public static void main(String[] args)
  {
    int[] myArray = {2, 3, 9, 1};//initialize array with numbers to test
    int minIndex;//init min index
    int maxIndex;//init max index
    for(int i = 0; i < myArray.length; i++){//prints array as is
    System.out.print(myArray[i] + " ");
    }
    System.out.println("");
    minIndex = findMinIndex(myArray);//calls find index of min val method
    System.out.println(minIndex);
    System.out.println("");
    maxIndex = findMaxIndex(myArray);
    System.out.println(maxIndex);
    int temp = myArray[minIndex];//initializes temp variable as the minimum value
    myArray[minIndex] = myArray[maxIndex];//swaps min value with max value
    myArray[maxIndex] = temp;//swaps max value with temp (now set as min value)
    for(int k = 0; k < myArray.length; k++){
    System.out.print(myArray[k] + " ");//prints final swapped array
    }
    
  }

  public static int findMinIndex(int[] myArray){
    int min = myArray[0];
    int minIndex = 0;
    for(int i = 0; i<myArray.length; i++){
      if (min> myArray[i]){
        min = myArray[i];
        minIndex = i;
      }
    }return(minIndex);
  }
  public static int findMaxIndex(int[] myArray){//method finds index of max value within myArray
   int max = myArray[0];//initializes max value within method
   int maxIndex = 0;//initializes index of max val
    for(int j = 0; j<myArray.length; j++){
      if (max < myArray[j]){
        max = myArray[j];
        maxIndex = j;//uses j as a temp variable to set index value where max value is found
      	}
    }return(maxIndex);
  } 
}