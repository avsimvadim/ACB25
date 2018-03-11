package week2.day2;

public class BreakContinue {
    public static void main(String[] args) {
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            if (i == 6 || i == 13) {
                continue;
            }
            System.out.print(array[i] + ", ");

        }
    }
}
