package placement.day8;

public class program3 {

    public int[] linearProbing(int hashSize,int[] arr,int n){
        int[] hashTable = new int[hashSize];
        for (int i = 0; i <hashSize ; i++) {
            hashTable[i]=-1;
        }
        for (int i = 0; i <n ; i++) {
            int index=arr[i]%hashSize;
            while (hashTable[index]!=-1){
                index=(index+1)%hashSize;
            }
            hashTable[index]=arr[i];
        }
        return hashTable;
    }

    public static void main(String[] args) {
        program3 lp = new program3();
        int hs=10;
        int[] arr ={4,14,24,44};
        int n = arr.length;

        int[] hastTable = lp.linearProbing(hs,arr,n);
        System.out.println("Hash table");

        for (int i = 0; i <hs ; i++) {
            System.out.print(hastTable[i]+"   ");

        }

    }


}
