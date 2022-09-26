public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int rday,rmon,ryr; //returned
        int  aday,amon,ayr; //actual
        int fine =0;
        
        Scanner sc = new Scanner(System.in);
        rday = sc.nextInt();
        rmon = sc.nextInt();
        ryr=sc.nextInt();
        
        aday = sc.nextInt();
        amon = sc.nextInt();
        ayr=sc.nextInt();
        
        if(ryr>ayr)
            fine=10000; 
        else if(ryr==ayr && rmon>amon)
            fine=500*(rmon-amon);
        else if(ryr==ayr && rmon==amon && rday>aday)
            fine=15*(rday-aday);
        else if(ryr==ayr && rmon==amon && rday<=aday)
            fine=0;
        else if(ryr==ayr && rmon<=amon)
            fine=0; 
        else if(ryr<=ayr) // return early
            fine=0;   
           
            
        
        System.out.println(fine);
    }
    
}
