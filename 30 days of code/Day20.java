public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        int s=0,t;
        // Write your code here
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(a.get(j)>a.get(j+1)){
                    s=s+1;           //counting swap
                    t=a.get(j);
                    a.set(j,a.get(j+1));
                    a.set(j+1,t);   
                }
            }
        }
        System.out.println("Array is sorted in "+s+" swaps.");
        System.out.println("First Element: "+a.get(0));    
        System.out.println("Last Element: "+a.get(n-1));

        bufferedReader.close();
    }
}
