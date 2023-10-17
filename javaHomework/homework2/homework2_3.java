package javaHomework.homework2;

public class homework2_3 {
    public static void displayDuration(long seconds) {
                long hours = seconds / 3600;
                long remainingSeconds = seconds % 3600;
                long minutes = remainingSeconds / 60;
                long remainingSeconds2 = remainingSeconds % 60;
                if (remainingSeconds2 == 0 && minutes == 0 && hours==0){
                    System.out.println("Time: "+seconds+" second");
                } else if (remainingSeconds2 == 0 && minutes == 0) {
                    System.out.println("Time: " + hours + " hours ");
                } else if (hours == 0 && minutes == 0) {
                    System.out.println("Time: " + remainingSeconds2 + " seconds");
                } else if (hours == 0 && remainingSeconds2 == 0) {
                    System.out.println("Time: " + minutes + " minutes ");
                } else if (remainingSeconds2 == 0) {
                    System.out.println("Time: " +hours +" hours " + minutes + " minutes");
                } else if (hours == 0) {
                    System.out.println("Time: "  + minutes + " minutes, " + remainingSeconds2 + " seconds");
                } else if (minutes == 0) {
                    System.out.println("Time: " + hours + " hours, " + remainingSeconds2 + " seconds");
                } else {
                    System.out.println("Time: " + hours + " hours, " + minutes + " minutes, " + remainingSeconds2 + " seconds");
                }
            }

            public static void main(String[] args) {
                long durationInSeconds = 3660;
                displayDuration(durationInSeconds);
            }
}        

    

