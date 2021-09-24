public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        } else if (bigCount * 5 + smallCount < goal){
            return false;
        } else if (smallCount >= (goal % 5)){
            return true;
        }
        return false;
    }
}

