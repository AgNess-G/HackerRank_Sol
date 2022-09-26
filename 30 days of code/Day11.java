public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        // code here
        
        int h=-70,sum;
        for(int i=0;i<=3;i++)
            for(int j=0;j<=3;j++){
                sum=arr.get(i).get(j)+ arr.get(i).get(j+1)  + arr.get(i).get(j+2)
                                     + arr.get(i+1).get(j+1)
                 +arr.get(i+2).get(j)+arr.get(i+2).get(j+1) +arr.get(i+2).get(j+2);
                if(sum>h)
                    h=sum;
            }
            System.out.println(h);
            
        bufferedReader.close();
    }
}
