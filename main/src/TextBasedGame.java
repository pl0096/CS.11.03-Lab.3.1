public class TextBasedGame {
    static void printOptions(String option1, String option2){
        System.out.println("1. " + option1);
        System.out.println("2. " + option2);
    }


    public static void main(String[] args) {

        System.out.println("This game is based on the adventure in Dank Memer (Pepe goes on a vacation!)");
        System.out.println("You are going on a vacation! WooHoo!!!!");
        System.out.println("There will be situations that you will have to face throughout the journey. You can press the number keys 1, 2 to select your option. Your goal is to collect as much money as you can, and don't die in the adventure!");
        System.out.println("Press enter to continue:");
        //initalising variables
        Scanner sc = new Scanner(System.in);
        int money = 0;
        String answer;

        //Begin the game
        //1 a
        System.out.println("A family road trip is a perfect getaway until you end up lost and without cell service. What do you do?\n");
        printOptions("Keep Driving", "Stop for Directions");
        answer = sc.next();
        for (!(answer.equals("1") || answer.equals("2"))){
            System.out.println("This is not a valid option, please choose option 1 or 2. ");
            answer = sc.next();
        }
        if (answer.equals("1")){
            System.out.println("You keep driving your car, with hopes that you will reach your destination. ");
        }
        else{
            money += 200000
            System.out.println("You got 200,000 dollars from the man you asked! And now you are back on your way!");
        }

        //2
        System.out.println("A family vacation can't be complete without a trip to an amusement park. What ride are you dying to try?\n");
        printOptions("Rollercoaster", "Waterslide");
        answer = sc.next();
        for (!(answer.equals("1") || answer.equals("2"))){
            System.out.println("This is not a valid option, please choose option 1 or 2. ");
            answer = sc.next();
        }
        if (answer.equals("1")){
            System.out.println("You keep driving your car, with hopes that you will reach your destination. ");
        }
        else{
            System.out.println("You found some trash on the slide, nothing surprising");
        }








    }


}
