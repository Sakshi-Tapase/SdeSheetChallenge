public class Solution
{
public static int findMinimumCoins(int amount)
   {
       // Write your code here.
        int arr[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
       int count = 0;
       int i = 8;
   
   while(amount!=0){
       if(arr[i]>amount){
           i--;
       }
       else{
           amount -= arr[i];
           count++;
       }
   }
   return count;
   }
}
