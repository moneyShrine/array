package arrayAssessment;


public class ArrayAssessment {
	
	/*
	 * returns the smallest non-occurring
	 * integer in a given Array
	 */
	public int smallestMissingNumber(int[] arrayNum){
        int n = arrayNum.length;
  
        //Marks occurrences
        boolean[] present = new boolean[n + 1];
  
        // Mark the occurrences
        for (int i = 0; i < n; i++) {
 
            if (arrayNum[i] > 0 && arrayNum[i] <= n){
            	present[arrayNum[i]] = true;
            }
        }
  
        // Find the first element which didn't
        // appear in the original array
        for (int i = 1; i <= n; i++) {
            if (!present[i]) return i;
        }
  
        return n + 1;
    }
	
	
}
