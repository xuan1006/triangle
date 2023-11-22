package org.example;

public class Homework6 {
    public static void main(String[] args) {
        String[] name={"銷售員","產品A","產品B","產品C","產品D","產品E"};
        int[][] num = {{1,33,32,56,45,33},{2,77,33,68,45,23},{3,43,55,43,67,65}};

        for (int i=0;i< name.length;i++){
            System.out.print(" | "+name[i]);
            if (i == name.length-1){
                System.out.println(" |");
            }
        }
        for(int i=0;i<num.length;i++){
            for (int j=0;j<num[i].length;j++){
                System.out.print(" | "+num[i][j]);
                if (j== num[i].length-1){
                    System.out.print(" |");
                }
            }
            System.out.println();
        }
//        ---------------------------------------------------------
        System.out.println("a");
        int[] money=new int[3];
        int[] m={12,16,10,14,15};
        for (int i=0;i<3;i++){
            for(int j=1;j<6;j++){
                money[i]+=(num[i][j] * m[j-1]);
            }
            System.out.println("銷售員"+(i+1)+"總額為:"+money[i]);
        }
//        -----------------------------------------------------------
        System.out.println("b");
        int[] sum=new int[5];
        for(int i=1;i<6;i++){
            for(int j=0;j<3;j++){
                sum[i-1] += num[j][i]*m[i-1];
            }
            System.out.println("產品"+(char)(i+65-1)+"銷售總額為:"+sum[i-1]);
        }
//          -------------------------------------------------------------
        System.out.println("c");
        int max=0;
        for(int i=1;i<money.length;i++){
            if(max<money[i]) {
                max = i;
            }
        }
        System.out.println("有最好業績的銷售是:"+ (max+1));
//        -----------------------------------------------------------------
        System.out.println("d");
        int mun=0;
        for(int i=1;i< sum.length;i++){
            if(mun<sum[i]){
                mun = i;
            }
        }
        System.out.println("銷售金額最多的產品是:"+(char)(mun+64));
    }

}

