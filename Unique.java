import java.io.*;   
  
    
class Unique {     
    public static void main (String[] args)    
    {     
        int a[] = { 1,1,3,2,4,2,3,4,5,2,5,9,2,3,4,9 };     
        int len = a.length;      
        int u[] = new int[20];   
        int index = 0;  
         
        for (int i = 0; i < len; i++)   
        {   
            int flag = 0;    
            for (int j = 0; j < i; j++){  
                if (a[i] == a[j]){   
                    flag = 1;  
                    break;   
                }  
            }  
             
            if (flag == 0){   
                u[index] = a[i];  
                index++;     
            }  
        }  
         
        for(int i = 0; i < index; i++)  
            System.out.print( u[i] + " ");   
    }         
      
}   