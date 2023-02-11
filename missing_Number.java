package Assignment;

public class missing{
    public static void main(String[] args) {
 
        int[] arr1={7,5,6,1,4,2};
        System.out.println("Missing number from array arr1: "+missingNumber(arr1));
       
 
    }
 
    public static int missingNumber(int[] arr)
    {
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int restSum=0;
        for (int i = 0; i < arr.length; i++) {
            restSum+=arr[i];
        }
        int missingNumber=sum-restSum;
        return missingNumber;
    }
}
