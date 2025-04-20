import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={1,2,3};
        if(arr1==arr2)
            System.out.println("same");
        else
            System.out.println("not same");


        String st1="Geeks";
        String st2="eeGesk";
        int res=0,i;
        for(i=0;i<st1.length();i++)
            res^=st1.charAt(i);
        for(i=0;i<st2.length();i++)
            res^=st2.charAt(i);
        System.out.print((char)res);
        System.out.println();

        int arr[]={10,20,30,40,50};
        for(int j=0;j<arr.length;j++){
            System.out.print(" "+arr[i]);
        }
    }
}