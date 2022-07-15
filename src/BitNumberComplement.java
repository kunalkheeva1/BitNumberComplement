import java.util.ArrayList;

public class BitNumberComplement {

    public static int bitNumberComplement(int n){

        // get the list to add the complement values
        ArrayList<Integer> list = new ArrayList<>();
        // until n is greater
        while(n>0){
            // add their reverses
            if((n&1)>0){
                list.add(0);

            }else{
                list.add(1);
            }
            //move the list
            n >>=1;
        }

        int ans = 0;
        for(int i=0; i<list.size(); i++){
            // ans will add the  ans and the element in the list multiply by 2^i(1<<i)
            ans += list.get(i)*1<<i;
        }return ans;

    }
    public static void main(String[] args) {


    }
}
