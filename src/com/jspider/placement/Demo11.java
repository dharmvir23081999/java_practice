package com.jspider.placement;

public class Demo11 {
    public static void main(String[] args) {
        String s = "cccdjmmmmm";
        m1(s);
       // int i =0;
        String res ="";
        char [] a= s.toCharArray();

      for (int i =0;i<a.length-1;i++)
      {
          if (a[i]==a[i+1])
          {
              res=res+'@';
              i++;

          }
          else res=res+a[i];
      }
        System.out.println(res);


    }

    static void m1(String s)
    {//success
        String res ="";
        int count=0;
        char [] a = s.toCharArray();
        for (int i =0;i<a.length-1;i++)
        {
            for (int j =i+1;j<a.length;j++) {
                if (a[i] == a[j]) {
                    count++;
                }
                else break;
            }
            if(count>0){
                count++;
                while (count>0)
                {
                    res=res+'@';
                    count--;
                    i++;
                }
               i--;

            }else res=res+a[i];
        }
        System.out.println(s);
        System.out.println(res);
    }
}
