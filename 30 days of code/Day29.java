class Result {

    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N  
     *  2. INTEGER K  
     */

    public static int bitwiseAnd(int N, int K) {
    // Write your code here
        int ans=0,t;
        for(int i=1;i<N;i++){       //A
            for(int j=N;j>i;j--){  //B
                t=i&j;
                if(t<K && t>ans )
                    ans=t;
            }
        }
        return ans;
    }

}
