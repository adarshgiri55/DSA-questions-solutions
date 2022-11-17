//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().countPairsWithDiffK(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    int countPairsWithDiffK(int[] arr, int n, int k) {
        // code here
        HashMap<Integer,Integer>hm = new HashMap<>();
        int cnt =0;
        //map all elemnts with frequency
        if(k!=0){
          for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i]-k)){
                cnt+= hm.get(arr[i]-k);
            }
             if(hm.containsKey(arr[i]+k)){
                cnt+= hm.get(arr[i]+k);
            }
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            
        }  
        }else {
            for(int i=0;i<n;i++){
                if(hm.containsKey(arr[i]))cnt+=hm.get(arr[i]);
                  hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            }
        }
        
        return cnt ;
    }
}