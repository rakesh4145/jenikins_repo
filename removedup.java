import java.util.*; 
import java.io.*;
import java.util.stream.Collectors; 
  
public class removedup
 { 
  
    public static void main(String args[]) 
       { 
             List<Integer> l=new ArrayList<Integer>();
             Scanner sc=new Scanner(System.in);
             System.out.println("enter array size --->");
             int length= sc.nextInt();
             int arr[]=new  int[length];
             System.out.println("enter array elements --->");
           
               for(int i=0;i<length;i++)
                  {
                     arr[i]=sc.nextInt();
                  }

             l.add(arr);
             System.out.println("array with duplicate elements---> "+l);
            
             List<Integer> newList = l.stream().distinct().collect(Collectors.toList());

             System.out.println("array with duplicate elements---> "+newList);
      
          
     
       }

} 
