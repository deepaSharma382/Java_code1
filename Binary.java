import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Binary 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res[] = new int[(n/2)+1];
        int j,k,i=0;
        while(n>0)
        {
        res[i] = n%2; // Although it stores the binary representation of n in reverse order but that doesn't change the order of 1's
            n = n/2;
            i++;
        }
        int count,temp =0;
        for(j=0;j<i;j++)
        {
            count=0;
          for(k=j;k<i;k++)
          {
              if(res[k]==1){
                  count++;
                  continue;
              }
              else
                  break;
          }
            if(temp<count)
                temp = count;
        }
        System.out.println(temp);
        sc.close();
    }
}