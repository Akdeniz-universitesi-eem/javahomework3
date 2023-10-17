package javaHomework.homework2;

public class homework2_2 {
public static void main(String[] args){

        int x =0;
        int y=750 ;
        int z=-60 ;
        int[] greatest = new int[3];

        if(x < y ){
            if(z < y){
                 greatest[0] = y;
                 if(x < z){
                     greatest[1] = z;
                     greatest[2] = x;
                 }else{
                     greatest[1] = x;
                     greatest[2]= z;
                 }
            }else if (x < z) {
                if(y < z){
                    greatest[0] = z;
                    if(x < y){
                        greatest[1]=y;
                        greatest[2]=x;
                    }else{
                        greatest[1]=x;
                        greatest[2]=y;
                    }
                }
            }
        }else{
            if(x<z){
            greatest[0] = z;
                if(x < y){
                    greatest[1]=y;
                    greatest[2]=x;
                }else{
                    greatest[1]=x;
                    greatest[2]=y;
                }
            }
            else{
                greatest[0]=x;
                if(y < z){
                    greatest[1]=z;
                    greatest[2]=y;
                }else{
                    greatest[1]=y;
                    greatest[2]=z;
                }
            }

        }

System.out.println(greatest[0] + ">" +greatest[1] +">"+greatest[2]);

    }
}
