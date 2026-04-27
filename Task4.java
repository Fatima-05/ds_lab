public class Task4 {
    static void merge(int[] A1,int[] A2){
        int merged_length=A1.length+A2.length;
        int[] mergedArray=new int[merged_length];
        for(int i=0; i<A1.length;i++){
            mergedArray[i]=A1[i];
        }
        for(int i=0; i<A2.length;i++){
            mergedArray[A1.length+i]=A2[i];
        }
        System.out.print("Merged array: ");
        for(int i=0; i<mergedArray.length;i++){
            System.out.print(mergedArray[i]+" ");
        }

    }
    public static void main(String[] args) {
        int[] A1={1,2,3,4,5};
        int[] A2={10,9,8,7,6};
        System.out.print("Array A1:");
        for(int i=0; i<A1.length;i++){
            System.out.print(A1[i]+" ");
        }
        System.out.println();
        System.out.print("Array A2:");
        for(int i=0; i<A2.length;i++){
            System.out.print(A2[i]+" ");
        }
        System.out.println();
        merge(A1, A2);
    }
}
