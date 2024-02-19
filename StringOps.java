public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    String test = args[0];
    System.err.println(capVowelsLowRest(test));   
    String test2 = args[1];
    System.err.println(camelCase(test2));  
    String test3 = args[2];
    String test33 = args[3];
    char test4 = (char)(test33.indexOf(0));
    System.err.println(allIndexOf(test3,test4)); 
   
    }
      
   
    public static String capVowelsLowRest (String string) {
        String ans = "";
        for(int i = 0 ; i < string.length() ; i++ ){
            char ch =string.charAt(i);
            if (ch<96 && 64<ch){
                ch +=32;
                ans +=ch;

            }else{
                ans +=ch;
            }

        }
        String answer ="";
        for(int i = 0 ; i < ans.length(); i++ ){
            char ch =ans.charAt(i);
            if (ch==97 || ch==101 || ch==105 || ch==111 || ch==117){
               ch = (char) (ch-32);
               answer += ch;
            }else{
                answer += ch;
            }


        }
        return answer;
    }
    
    public static String camelCase (String string) {
        String ans = "";
        for(int i = 0 ; i < string.length() ; i++ ){
            char ch =string.charAt(i);
            if (ch<96 && 64<ch){
                ch +=32;
                ans +=ch;

            }else{
                ans +=ch;
            }

        }
        String answer ="";
        int i = 0;
        while (i< ans.length()) {
            char ch =ans.charAt(i);
            
        if (ch==32 && i< (int)(ans.length()-1)&& ans.charAt(i+1)!=32){
            answer = answer +(char)(ans.charAt(i+1)-32);
            i++;   
        }else{
        answer = answer + ch; }
        i++;  
            
        }
      
 
    String answerfin ="";
    for(int j = 0 ; j < answer.length() ; j++ ){
        char ch = answer.charAt(j);
        if (ch!=32 ){
            answerfin +=ch;
        }

    }
    char firstChar =(char)(answerfin.charAt(0)+32);
     String answerfin1= firstChar + answerfin.substring(1);
    return answerfin1;
}


  
    public static int[] allIndexOf (String string, char chr) {
          

        String stringindex ="";
        for(int j = 0 ; j < string.length() ; j++ ){
            char ch = string.charAt(j);
            if (ch == chr){
                stringindex += j;
            } }
            int [] index = new int[stringindex.length()];
            for(int j=0; j<stringindex.length();j++){
                int num =(int)((stringindex.charAt(j)-48));
                 index[j]= num ; 
            }

        
        return index ;
    }
}