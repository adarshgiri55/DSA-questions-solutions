class Solution {
    public int trailingZeroes(int n) {
        
        int cnt=0;
		while(n!=0){
            int temp = n/5;
            cnt+=temp;
            n=temp;
        }
		
		
		return cnt;
    }
}