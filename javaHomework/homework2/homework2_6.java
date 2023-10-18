public class homework2_6 {
      public static void main(String[] args) {
        int x=40;
        int timer=0;
        int timer1=0;
        if(x%2 == 0 && x>2){
            int y= x/2;
            for(int i=2 ;i<=y;i++){
                for(int z=2 ;z<i;z++){
                    if(i%z==0){
                        timer++;
                    }if(timer1==0){
                        return;
                    }
                }
                for(int k=x;k>=y;k--){

                    if(i+k==x){
                        if(i%2==1 && k%2==1){
                            timer++;
                            if (timer1==0){
                                System.out.println(i+ "+" +k+ "=" +x);
                            }
                        }
                    }
                }
            }
        }
        else{
            System.out.println("Please enter an even number and greater than 2");
        }
    }
}
