public class Main {
    public static void main(String[] args) {
        int x;
        int y = 1;
        int z;

        for(x = 1; x <= 12; x++ ){
            y = 1;
            z = x * y;
            System.out.println(x + " x " + y + " = " + z);
            for(y = 2;y <= 12; y++){
                z = x * y;
                System.out.println(x + " x " + y + " = " + z);
            }
    }
    }
}
