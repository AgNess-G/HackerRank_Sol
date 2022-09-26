class Calculator{
    int num;
    int power(int n, int p)throws Exception{
 
            if(n<0 || p<0){ throw new Exception("n and p should be non-negative");              }
            else{
                num = (int)Math.pow(n,p);
                return num;
            }
        }
}
