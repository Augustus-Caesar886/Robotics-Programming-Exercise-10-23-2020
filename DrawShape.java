public class DrawShape {
    public static void main(String[] args) {
        int length = 8; //Length based on max number of . in a line
        printHourglass(length);
        printBox(length);
    }

    private static void printVertical(int length) {
        System.out.print("+");
        for(int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    private static void printHourglass(int length) {
        printVertical(length+2);
        printClosingTriangle(length);

        printOpeningTriangle(length);
        printVertical(length + 2);
    }

    private static void printBox(int length) {
        printVertical(length+2);

        printOpeningTriangle(length);
        printClosingTriangle(length);

        printVertical(length+2);
    }

    private static void printClosingTriangle(int length) {
        for(int i = 0; i <= length/2; i++) {
            System.out.print("|");
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for(int j = 0; j < length - 2 * i; j++) {
                System.out.print(".");
            }
            System.out.print("/");
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    private static void printOpeningTriangle(int length) {
        for(int i = length/2; i >= 0; i--) {
            System.out.print("|");
            for(int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print("/");
            for(int j = 0; j < length - 2 * i; j++) {
                System.out.print(".");
            }
            System.out.print("\\");
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}