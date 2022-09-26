public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int hc=0,d,h=0;
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        while(n>0){
          d=n%2;           //generate binary digit
          if(d==1)
            hc++;         //count 1s
          else{
            if(hc>h)      //decide highest count
                h=hc;
            hc=0;         //reset 
          }
          n=n/2;  
        }
        if(hc>h)
            h=hc;
        System.out.println(h);
        bufferedReader.close();
    }
}
