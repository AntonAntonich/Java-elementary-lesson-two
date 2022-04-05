public class Challenge {
    public static void main(String[] args) {
        int myAge = 33;
        String myName = "Anton";
        String messageOne = "My name is ";
        String messageTwo = " i am ";
        String messageThree = "years old";
        String messageFour = "In a year my age will be: ";


        System.out.println(messageOne + myName + messageTwo + myAge + messageThree);

        myAge++;

        System.out.println(messageFour + myAge);

    }
}
