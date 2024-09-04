package placement.day8;

import java.util.HashMap;

public class program2 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> ha = new HashMap<>();

        int pos =0;
        int sizeOfArray =4;
        int hashSize =10;
        int arr[]={4,14,24,44};

        for (int i = 0; i <hashSize ; i++) {
            ha.put(pos,arr[i]);

        }
        for (int i = 0; i < sizeOfArray; i++) {
            pos=arr[i]%hashSize;

            if(ha.get(pos)==-1){
                ha.put(pos,arr[i]);
            }
            else {
                pos=(arr[i]+1)%hashSize;
                ha.put(pos,arr[i]);
            }
        }

    }
}
