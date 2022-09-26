public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sr= new Scanner(System.in);
        int n,j=0;
        String strin;
        n=sr.nextInt();
        while(sr.hasNextLine()){
            strin = sr.nextLine();
            if(strin!="\n"){
                for(int i=0;i<strin.length();i+=2)
                    System.out.print(strin.charAt(i));
                System.out.print("  ");    
                for(int i=1;i<strin.length();i+=2)
                    System.out.print(strin.charAt(i));
                System.out.println("");
            }
        }
            
    }
}
