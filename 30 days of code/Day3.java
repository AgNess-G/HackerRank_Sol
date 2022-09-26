public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
//      not even number (ie. is odd)
        if(N%2!=0)
            System.out.println("Weird");
//       even number between 6 and 20
        else if(N%2==0 && N<=20 && N>=6)
            System.out.println("Weird");
//       even number not between 6 and 20
        else
            System.out.println("Not Weird");
    }
}
