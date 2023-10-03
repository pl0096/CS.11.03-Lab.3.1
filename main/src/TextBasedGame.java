import java.util.Scanner;

public class TextBasedGame {
    public static void printOptions(String option1, String option2){
        System.out.println("1. " + option1);
        System.out.println("2. " + option2);
    }

    public static int mainmain(){
        Scanner sc = new Scanner(System.in);
        //1 a
        int m = 0;
        System.out.println("You have " + m + " dollars!");
        System.out.println("A family road trip is a perfect getaway until you end up lost and without cell service. What do you do?\n");
        printOptions("Keep Driving", "Stop for Directions");
        String answer = sc.next();

        for (boolean t = answer.equals("1") || answer.equals("2"); !t; t = answer.equals("1") || answer.equals("2")){

            System.out.println("This is not a valid option, please choose option 1 or 2. ");
            answer = sc.next();
        }
        if (answer.equals("1")){
            System.out.println("You keep driving your car, with hopes that you will reach your destination. ");
        }
        else{
            m += 200000;
            System.out.println("You got 200,000 dollars from the man you asked! And now you are back on your way!");
        }
        System.out.println("_________________________________________");

        //2
        System.out.println("You have " + m + " dollars!");
        System.out.println("A family vacation can't be complete without a trip to an amusement park. What ride are you dying to try?\n");
        printOptions("Rollercoaster", "Waterslide");
        answer = sc.next();
        for (boolean t = answer.equals("1") || answer.equals("2"); !t; t = answer.equals("1") || answer.equals("2")){
            System.out.println("This is not a valid option, please choose option 1 or 2. ");
            answer = sc.next();
        }
        if (answer.equals("1")){
            System.out.println("You wanted to vomit, ewwww you threw up on the roller coaster! Now everyone hates you, took all your money and your journey is over. ");

            return 0;
        }
        else{
            System.out.println("You found some trash on the slide, nothing surprising");
        }
        System.out.println("_________________________________________");

        //3
        System.out.println("You have " + m + " dollars!");
        System.out.println("A friend tells you about a quaint mountain resort, so you decide to spend a few days enjoying the snow. What do you do after you arrive?");
        printOptions("Go Skiing", "Visit the Hotel Bar");
        answer = sc.next();
        for (boolean t = answer.equals("1") || answer.equals("2"); !t; t = answer.equals("1") || answer.equals("2")){
            System.out.println("This is not a valid option, please choose option 1 or 2. ");
            answer = sc.next();
        }
        if (answer.equals("1")){
            m += 50000;
            System.out.println("You had a great time skiing with your friends! You got to play with the snow! And your friend gave you 50,000 as a thank you fee!");

        }
        else{
            System.out.println("You got so drunk, that you lost all your money and died. ");
        }
        System.out.println("_________________________________________");

        //4
        System.out.println("You have " + m + " dollars!");
        System.out.println("Camping has always relaxed you, so you decide to vacation in the wilderness. What sort of camping do you prefer?\n");
        printOptions("Rent an RV", "Use a Tent");
        answer = sc.next();
        for (boolean t = answer.equals("1") || answer.equals("2"); !t; t = answer.equals("1") || answer.equals("2")){
            System.out.println("This is not a valid option, please choose option 1 or 2. ");
            answer = sc.next();
        }
        if (answer.equals("1")){
            m -= 100000;
            if (m < 0){
                System.out.println("You don't have enough money to rent one! So you can only stay outdoors for the night... Brrr it's sooo coldddd.... You froze to death!");
                return 0;
            }
            System.out.println("You paid 100,000 to rent one, sweet!");

        }
        else{
            System.out.println("It was a great camping experience! You saw so many wild animals, woah!");
        }
        System.out.println("_________________________________________");

        //5
        System.out.println("You have " + m + " dollars!");
        System.out.println("During your vacation in Lisbon, the hotel offers you a small pastry for breakfast. What do you do?\n");
        printOptions("Eat it", "Pass");
        answer = sc.next();
        for (boolean t = answer.equals("1") || answer.equals("2"); !t; t = answer.equals("1") || answer.equals("2")){
            System.out.println("This is not a valid option, please choose option 1 or 2. ");
            answer = sc.next();
        }
        if (answer.equals("1")){
            if (m < 30000){
                System.out.println("You don't have enough money to buy it!");
            }
            else {
                System.out.println("You paid 30,000 to buy one, tasty!");
                m -= 30000;
            }

        }
        else{
            System.out.println("You skipped breakfast and moved on. ");
        }
        System.out.println("_________________________________________");

        //6
        System.out.println("You have " + m + " dollars!");
        System.out.println("Nothing can beat a romantic vacation in Paris. What do you want to do first?\n");
        printOptions("The Eiffel Tower", "The Louvre");
        answer = sc.next();
        for (boolean t = answer.equals("1") || answer.equals("2"); !t; t = answer.equals("1") || answer.equals("2")){
            System.out.println("This is not a valid option, please choose option 1 or 2. ");
            answer = sc.next();
        }
        if (answer.equals("1")){
            System.out.println("A tourist left a wallet here, you picked up 1,000,000 dollars!");
            m += 1000000;

        }
        else{
            System.out.println("There was so muchh to see in the Museum! So fascinatingggg!!!");
        }
        System.out.println("_________________________________________");

        //7
        System.out.println("You have " + m + " dollars!");
        System.out.println("While vacationing in Rome, you visit the Colosseum and run into a group of people handing out friendship bracelets. What do you do?\n");
        printOptions("Take a Bracelet", "Say No");
        answer = sc.next();
        for (boolean t = answer.equals("1") || answer.equals("2"); !t; t = answer.equals("1") || answer.equals("2")){
            System.out.println("This is not a valid option, please choose option 1 or 2. ");
            answer = sc.next();
        }
        if (answer.equals("1")){
            System.out.println("You got a nice bracelet, and they also gave you another 10,000 dollars for appreciating them!");
            m += 10000;

        }
        else{
            System.out.println("The people were not happy, and they chased you off the Colosseum. You died.");
            return 0;
        }
        System.out.println("_________________________________________");

        //8
        System.out.println("You have " + m + " dollars!");
        System.out.println("You can't go on vacation without doing a little sightseeing. What do you want to see?\n");
        printOptions("Museum", "Concert");
        answer = sc.next();
        for (boolean t = answer.equals("1") || answer.equals("2"); !t; t = answer.equals("1") || answer.equals("2")){
            System.out.println("This is not a valid option, please choose option 1 or 2. ");
            answer = sc.next();
        }
        if (m < 500){
            System.out.println("You didn't have enough money... Your vacation has ended. Too bad!");
            return 0;
        }
        m -= 500;
        if (answer.equals("1")){
            System.out.println("You paid 500 dollars to go to the museum! Woahhh! There are so many fossils of ancient dinosaurs!");

        }
        else{
            System.out.println("You paid 500 dollars to go to the concert of your favourite music group! They are too gooddddddd!!!");
        }
        System.out.println("_________________________________________");

        //9
        System.out.println("You have " + m + " dollars!");
        System.out.println("You decide it's time to visit some famous landmarks in the United States. Which do you visit first?\n");
        printOptions("The Grand Canyon", "Mt. Rushmore");
        answer = sc.next();
        for (boolean t = answer.equals("1") || answer.equals("2"); !t; t = answer.equals("1") || answer.equals("2")){
            System.out.println("This is not a valid option, please choose option 1 or 2. ");
            answer = sc.next();
        }
        if (answer.equals("1")){
            System.out.println("Oohhhh! The Grand Canyon is sooo bigggggg!!! HUGEEEE");

        }
        else{
            System.out.println("You climbed up the mountain, and you were unable to go up further due to lack of oxygen, you died. ");
            return 0;
        }
        System.out.println("_________________________________________");

        //10
        System.out.println("You have " + m + " dollars!");
        System.out.println("You decide the beach sounds like a perfect choice for a weekend away. Which beach do you want to visit?\n");
        printOptions("Daytona Beach, Florida", "Santa Monica, California");
        answer = sc.next();
        for (boolean t = answer.equals("1") || answer.equals("2"); !t; t = answer.equals("1") || answer.equals("2")){
            System.out.println("This is not a valid option, please choose option 1 or 2. ");
            answer = sc.next();
        }
        if (answer.equals("1")){
            System.out.println("Congratulations! You happened to be the 1,000,000th person to visit this beach! To honour you, you received 1,000,000 dollars as a reward!");
            m += 1000000;
        }
        else{
            System.out.println("Ah- The beach is sooo funnnn! You swam and built sandcastles all day long!");
        }
        System.out.println("_________________________________________");

        //11
        System.out.println("You have " + m + " dollars!");
        System.out.println("You decide to pick up Badosz and spend the weekend at Legoland. What do you look at first?\n");
        printOptions("Mini Lego City", "Gift Shop");
        answer = sc.next();
        for (boolean t = answer.equals("1") || answer.equals("2"); !t; t = answer.equals("1") || answer.equals("2")){
            System.out.println("This is not a valid option, please choose option 1 or 2. ");
            answer = sc.next();
        }
        if (answer.equals("1")){
            System.out.println("You had so much fun playing with lego all day long! Reliving your childhood dreams!");
        }
        else{
            m -= 500000;
            if (m <0){
                int add = m + 500000;
                m = 0;
                System.out.println("You used " + add + " dollars to buy goodies for your friends");
            }
            else{
                System.out.println("You used 500000 dollars to buy goodies for your friends");
            }

        }
        System.out.println("_________________________________________");

        //12
        System.out.println("You have " + m + " dollars!");
        System.out.println("You find a discounted whale watching tour and decide to give it a go, but the deal is for two. Who do you take with you?\n");
        printOptions("Your mom", "Your wife");
        answer = sc.next();
        for (boolean t = answer.equals("1") || answer.equals("2"); !t; t = answer.equals("1") || answer.equals("2")){
            System.out.println("This is not a valid option, please choose option 1 or 2. ");
            answer = sc.next();
        }
        if (answer.equals("1")){
            System.out.println("Your mom was so happy she decided to give you 1,000,000 as a reward for bringing her!");
            m += 1000000;
        }
        else{
            System.out.println("Your wife spent so much money on shopping!");
            m -= 1000000;
            if (m<0){
                m = 0;
            }

        }
        System.out.println("_________________________________________");

        //13
        System.out.println("You have " + m + " dollars!");
        System.out.println("Your cruise ship docks at a small island for a day of sun and swimming. What do you do?\n");
        printOptions("Swim", "Sunbathe");
        answer = sc.next();
        for (boolean t = answer.equals("1") || answer.equals("2"); !t; t = answer.equals("1") || answer.equals("2")){
            System.out.println("This is not a valid option, please choose option 1 or 2. ");
            answer = sc.next();
        }
        if (answer.equals("1")){
            System.out.println("You drowned and died LOL!");
            return 0;
        }
        else{
            System.out.println("You forgot to put on sunscreen and so you got sunburns LOL, you had to buy those cream stuff for 100 dollars");
            m -= 100;
            if (m<0){
                m = 0;
            }

        }
        System.out.println("_________________________________________");

        //14
        System.out.println("You have " + m + " dollars!");
        System.out.println("You get a flyer for some discount cruises that sound wonderful. Which destination do you choose?\n");
        printOptions("Mediterranean", "Caribbean");
        answer = sc.next();
        for (boolean t = answer.equals("1") || answer.equals("2"); !t; t = answer.equals("1") || answer.equals("2")){
            System.out.println("This is not a valid option, please choose option 1 or 2. ");
            answer = sc.next();
        }
        if (answer.equals("1")){
            System.out.println("It's funnnnn hehe!");
        }
        else{
            System.out.println("Oof too bad there were still pirates of the Caribbean out there.... You lost all your money!");
            m = 0;
        }
        System.out.println("_________________________________________");

        //15
        System.out.println("You have " + m + " dollars!");
        System.out.println("You decide to go stargazing in the Chilean desert, and you see a shooting star! What do you do?\n");
        printOptions("Take a picture", "Wish at it");
        answer = sc.next();
        for (boolean t = answer.equals("1") || answer.equals("2"); !t; t = answer.equals("1") || answer.equals("2")){
            System.out.println("This is not a valid option, please choose option 1 or 2. ");
            answer = sc.next();
        }
        if (answer.equals("1")){
            System.out.println("You posted it on the internet and got 10000 dollars!");
            m += 10000;
        }
        else{
            System.out.println("OMG! YOUR WISH CAME TRUE! The shooting star gave you 5,000,000! Lucky bean!");
            m += 5000000;

        }
        System.out.println("_________________________________________");

        return m;
    }


    public static void main(String[] args) {

        //print statements on the start of the game
        System.out.println("This game is based on the adventure in Dank Memer (Pepe goes on a vacation!)");
        System.out.println("You are going on a vacation! WooHoo!!!!");
        System.out.println("There will be situations that you will have to face throughout the journey. You can press the number keys 1, 2 to select your option. Your goal is to collect as much money as you can, and don't die in the adventure!");
        System.out.println("**************************************");


        //Begin the game
        int money = mainmain();

        //ending the game
        if (money > 0){
            System.out.println("Congratulations! You got " + money + " on your vacation! But can you do better next time?");
        }
        else{
            System.out.println("Aww you didn't get any money on your trip... Don't worry, you can always replay it to see if you can get more money this time!");
        }

        System.out.println("***********************************************");








    }


}
