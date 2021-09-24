public class Main {
    public static void main(String[] args) {
        System.out.println("1 big bag and 0 small bags will fill the goal of 4: " + FlourPacker.canPack(1,0,4));
        System.out.println("1 big bag and 0 small bags will fill the goal of 5: " + FlourPacker.canPack(1,0,5));
        System.out.println("0 big bag and 5 small bags will fill the goal of 4: " + FlourPacker.canPack(0,5,4));
        System.out.println("2 big bag and 2 small bags will fill the goal of 11: " + FlourPacker.canPack(2,2,11));
        System.out.println("-3 big bag and 2 small bags will fill the goal of 12: " + FlourPacker.canPack(-3,2,12));
        System.out.println("0 big bag and 5 small bags will fill the goal of 6: " + FlourPacker.canPack(0,5,6));
    }
}
