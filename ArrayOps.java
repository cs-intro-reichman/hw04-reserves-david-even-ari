public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        
        int n = array.length;
        int expected =n*(n+1)/2 ;
        int actual =0;

       
        for (int i=0; i< (array.length);i++){
             actual += array[i];
            }
            int end =(expected-actual);
            return end;
        }
  

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        return 0;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
