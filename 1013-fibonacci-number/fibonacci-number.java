class Solution {
    public int fib(int n) { 
        int arr[]=new int[n+1];
        Arrays.fill(arr,-1);
        int res=fibo(n,arr);
        return res;
    }
    public  int  fibo(int n,int []arr){
        if(n<=1){
            arr[n]=n;
        }
        if(arr[n]!=-1)return arr[n];
        int fnm1=fibo(n-1,arr);
        int fnm2=fibo(n-2,arr);
        int mans=fnm1+fnm2;
        arr[n]=mans;
        return mans;
    }
}