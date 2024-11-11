class Solution {
    
    public static void find(int[] primes){
        int n=primes.length;
        for(int i=2;i*i<=n;i++){
           for(int j=i+1;j<n;j++){
             if(j%i==0 && primes[j]!=1){
                primes[j]=1;
             }
           }
        }

    }
    
    public boolean primeSubOperation(int[] nums) {
        
        int n=nums.length;

        int k=0;
        for(int i=0;i<n;i++){
            k=Math.max(k,nums[i]);
        }
        int[] primes=new int[k+1];
        find(primes);


        for(int i=n-2;i>=0;i--){
            if(nums[i]>=nums[i+1]){
                for(int j=2;j<=k;j++){
                    if(primes[j]==0 && nums[i]>j && nums[i]-j<nums[i+1]){
                        nums[i]=nums[i]-j;
                        break;
                    }
                }
                if(nums[i]>=nums[i+1]){
                    return false;
                }
            }
        }

        return true;
        
    }
    
    
    
    
    
}