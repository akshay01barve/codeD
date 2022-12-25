
public class BubbleSort1
{
	public static void main(String[] args) {

        int[] array = {2,7,9,6,5,4};

        for( int i=0 ;i < array.length ;i++){
            //outer loop runs a n-1 times

            for( int j=0 ; j < array.length-i-1 ; j++){
                // inner loop first n,n-1,n-2 and so on

                if(array[j] > array[j+1]){

                    //Swapping
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                }
            }
        }
      for( int i=0 ; i<array.length ; i++){

        System.out.print(array[i] + " ");
      }
        
		

	}
}
