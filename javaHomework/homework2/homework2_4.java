public class homework2_4 {
    public static void main(String[] args) {
        int x=30;
        for(int mod=2;mod<=x;mod++){

            while(x % mod == 0){
                    System.out.println(":"+mod);
                    x/=mod;
            }
        }
    }
}
