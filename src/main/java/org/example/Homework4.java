package org.example;

public class Homework4 {
    public static void main(String[] args) {
            int[] scores = {67, 54, 90, 88, 35, 50, 60, 77, 64, 82};
        Sort s = new Sort();
        s.SelectSort(scores);
        for (int i=0;i< scores.length;i++){
            System.out.print(scores[i]+" ");
        }
//        Arrays.sort(scores);

        System.out.println();
        System.out.println(scores[1]);
        System.out.println(scores[scores.length-2]);
    }
}

class Sort{
    void SelectSort(int[] array){
        int min,temp;

        for(int i=0;i<array.length - 1;i++){
            min=i;
            for (int j = i+1;j<array.length;j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }
            temp=array[i];
            array[i]=array[min];
            array[min]=temp;
        }
    }

}