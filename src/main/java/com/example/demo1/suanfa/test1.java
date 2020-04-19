package com.example.demo1.suanfa;

import java.util.Scanner;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数：");
        int num2 = scanner.nextInt();
        System.out.println(reservedresult(num1,num2));

    }
    public static int reservedresult(int num1,int num2){
        if(num1>70000||num1<1||num2>70000||num2<1){
            return -1;
        }
        String res1 = "";
        String res2 = "";
        //int count = 0;
        boolean flag = false;
        while(num1!=0){
            //boolean flag = false;
            int i = num1 % 10;
            num1 = num1/10;
            if(i==0&&flag==false){
                continue;
            }else {
                res1 = res1 + i;
                flag = true;
            }
        }
        flag = false;
        while(num2!=0){
            int i = num2% 10;
            num2 = num2/10;
           // boolean flag = false;
            if(i==0&&flag==false){
                continue;
            }else {
                res2 =res2 + i;
                flag=true;
            }
        }
        int i = Integer.parseInt(res1);
        int j = Integer.parseInt(res2);
        int sum = i+j;
        return sum;
    }
}
