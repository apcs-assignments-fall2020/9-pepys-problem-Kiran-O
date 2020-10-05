public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int c = 0;
        double jt = 0.0;
        for (int k = 0; k < 10000; k++){
            for (int m = 0; m < 6; m++){
                c = (int) ((Math.random()*6) + 1);
                if ( c == 6){
                    jt += 1;
                    break;
                }

            }
        }
        double goooba = (jt / 10000.0) * 100.0;
        return (goooba);
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int c = 0;
        double jt = 0.0;
        int qwe = 0;
        for (int k = 0; k < 10000; k++){
            qwe = 0;
            for (int m = 0; m < 12; m++){
                c = (int) ((Math.random()*6) + 1);
                if (c == 6){
                    qwe += 1;
                }
                if ( qwe == 2){
                    jt += 1;
                    break;
                }

            }
            
        }
        double gooooba = (jt / 10000.0) * 100.0;
        return (gooooba);
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
       int c = 0; 
       double jt = 0.0;
       int qwe = 0;
       for (int k = 0; k < 10000; k++){
           qwe = 0;
           for (int m = 0; m < 18; m++){
               c = (int) ((Math.random()*6) + 1);
               if (c == 6){
                qwe += 1;
               }
               if (qwe == 3){
                   jt += 1;
                   break;
               }

           }
       }
       double goooooba = (jt / 10000.0) * 100.0;
        return (goooooba);
    }


    public static void main(String[] args) {
        System.out.println("Probability of at least 1 six in 6 rolls: " + probabilityOneSix());
        System.out.println("Probability of at least 2 six in 12 rolls: " + probabilityTwoSixes());
        System.out.println("Probability of at least 3 six in 18 rolls: " + probabilityThreeSixes());

    }
}
