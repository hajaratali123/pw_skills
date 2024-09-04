package placement.day8;

public class program1 {



    public int canCompleteCircle(int[] pertrol,int[] distance ){
        int n = pertrol.length;
        int totalPetrol =0;
        int totalDistance =0;
        int start =0;
        int currentPertrol=0;

        for (int i = 0; i <n ; i++) {
            totalPetrol+=pertrol[i];
            totalDistance+=distance[i];
        }
        if (totalPetrol<totalDistance){
            return -1;
        }
        for (int i = 0; i <n ; i++) {
            currentPertrol+=pertrol[i]-distance[i];
            if (currentPertrol<0){
            start=i+1;
            currentPertrol=0;
            }
        }
return start;
    }

    public static void main(String[] args) {
        program1 petrolPump = new  program1();
        int[] petrol ={4,6,7,4};
        int[] distance = {3,4,5,6};
    }

}
