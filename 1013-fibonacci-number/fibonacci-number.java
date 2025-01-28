class Solution {
    public int fib(int n) {  
        int res=fibo(n);
        return res;
    }
    public  int  fibo(int n){
        if(n<=1)return n;
        int fnm1=fibo(n-1);
        int fnm2=fibo(n-2);
        int mans=fnm1+fnm2;
        return mans;
    }
}