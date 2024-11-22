public class MagicJava {
//    public static void main(String[] args) {
        int myNumber = 32;
    /*
    We will refer to myNumber as the original number
     from now on - it might be helpful to document this.
     */
        public int Step() {
            int stepOne = myNumber * myNumber;
            int stepTwo = stepOne + myNumber;
            int stepThree = stepTwo / myNumber;
            int stepFour = stepThree + 17;
            int stepFive = stepFour - myNumber;
            return stepFive;
//        System.out.println(stepFive);
        }
//        int stepOne = myNumber * myNumber;
//        int stepTwo = stepOne + myNumber;
//        int stepThree = stepTwo / myNumber;
//        int stepFour = stepThree + 17;
//        int stepFive = stepFour - myNumber;
//        int StepFive = stepSix;
//        System.out.println(stepFive);
    }
//}
