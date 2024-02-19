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
        int max1 =MaxValue(array);
        int[] narray = new int[(array.length-1)];
        for(int i =0 ; i< array.length-1 ;i++){
            if(array[i]!= max1){
                narray[i]=array[i]; }
                else{
                    i--;
                }
        }
        
        int max2 =MaxValue(narray);
        return max2;
    }
    public static int MaxValue(int [] array) {
        int max =array[0] ;
        for (int i = 1 ; i< array.length ; i++){
            if (max<= array[i]){
                max=array[i];
            }

        }
        return max;
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
