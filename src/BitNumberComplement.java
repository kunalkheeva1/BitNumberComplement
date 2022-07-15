import java.util.ArrayList;

public class BitNumberComplement {

    public static int bitNumberComplement(int n){
        ArrayList<Integer> list = new ArrayList<>();

        while(n>0){
            if((n&1)>0){
                list.add(0);

            }else{
                list.add(1);
            }
            n >>=1;
        }
        int ans = 0;
        for(int i=0; i<list.size(); i++){
            ans += list.get(i)*1<<1;
        }return ans;

    }
    public static void main(String[] args) {


    }
}
