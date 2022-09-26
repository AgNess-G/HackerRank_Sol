interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum=n;
        for(int i=0;i<(int)n/2;i++)
            if(n%(i+1)==0)
                sum+=i+1;
        return sum;
    }
}
