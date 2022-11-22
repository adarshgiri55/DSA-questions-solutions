class Solution {
    public int trailingZeroes(int n) {
        long fact =1;
        int cnt=0,nnt=0;
		while(n!=0){
            int temp = n/5;
            cnt+=temp;
            n=temp;
        }
		
		
		return cnt;
    }
}