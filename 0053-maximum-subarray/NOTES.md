# Brute force - Kadane's Algorithm 
​
## Brute force : TC = O(n^3), SC=O(1)

maxSum = -INF
sum = 0
for(i = 0; i < n; i++)
{
  for(j = i; j < n; j++)
  {
     for(k = i; k < j; k++)
     {
        sum = sum + arr[k]
     }
     if(max < sum)
         max = sum
  }
}
return max

## A Better Solution (Prfix array/ similar to sliding window) : TC = O(n^2), SC = O(n)

maxSum = -INF
sum = 0
prefix[0] = arr[0]

for(int i = 1; i < n; i++)
{
  prefix[i] = prefix[i-1] + arr[i];
}

for(i = 0; i < n; i++)
{
  for(j = 0; j < n; j++)
  {
    if(i==0) 
      sum = prefix[0];
    else {
      sum = prefix[i-1] + prefix[i] 
    }
    if(max < sum)
      max = sum
  }
}
return max

## Optimal solution (Kadane's algorithm) : TC = O(n), SC = O(1)

maxSum = -INF
sum = 0
for(int i = 0; i < nums.length; i++) 
{
  currentSum += nums[i];
            
  if(max < currentSum)
      max = currentSum;
            
  if(currentSum < 0)
      currentSum = 0;
}
return max;
