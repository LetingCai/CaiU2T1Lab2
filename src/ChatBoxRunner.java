public class ChatBoxRunner {
    public static void main(String[] args){
        ChatBox Dong = new ChatBox("Dong",2);

        Dong.greeting("Leting");

        System.out.println("How's the weather?");
        Dong.weather();

        System.out.println("What is 2 feet in meters?");
        System.out.println("It is "+Dong.convertFeetToMeters(2));

        System.out.println("What is your favorite number?");
        Dong.favoriteNumber(10);

        System.out.println("What is 1+2+3");
        System.out.println("The answer is "+ Dong.addNumbers(1,2,3));

        System.out.println("How old are you?");
        System.out.println(Dong.age());

        System.out.println("What is your favorite food?");
        Dong.food();

        System.out.println("Bye!");
        System.out.println(Dong.goodbye());
    }
}
