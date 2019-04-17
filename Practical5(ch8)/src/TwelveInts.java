public class TwelveInts {
    public static void main(String[] args){
        int intArray[]={1,6,13,54,26,35,46,53,69,70,94,81};
        System.out.print("First to last:");
        for(int i=0;i<intArray.length;i++){
            System.out.print(intArray[i]+" ");
        }
        System.out.println();
        System.out.print("Last to first: ");
        for(int i=intArray.length;i>0;i--){
            System.out.print(intArray[i-1]+" ");
        }
    }
}
