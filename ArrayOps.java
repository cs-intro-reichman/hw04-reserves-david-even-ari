public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        boolean flag =false;
        int a =0;
        for (int i=0; i<= (array.length);i++){
            for (int j=0; j<= (array.length);j++){
                if( array[j]==i){flag=true;}
                } 
                if(!flag){ a += i ;}
            }
            return a;
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
