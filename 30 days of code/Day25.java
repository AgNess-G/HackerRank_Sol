public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int n,flag=0;
        for(int i=0;i<N;i++){
            
            n=sc.nextInt();
            flag=0;
            
            if(n==1)
                flag=1;
            
            else if(n%2==0)
                if(n==2)
                    flag=0; 
                else
                    flag=1;
                    
            else
                for(int j=3;j<=Math.pow(n,0.5);j=j+2){
                    if(n%j==0){
                        flag=1;
                        break;
                    }
                }

            if(flag==0)
             System.out.println("Prime");
            else
             System.out.println("Not prime");
        }
    }
}
