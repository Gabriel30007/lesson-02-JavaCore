package JavaCore;

public class lesson1 {
    public static void main(String[] args) {
// завдання 1
        boolean b;
        int a=2;
        short c=1;
        long h=3L;
        float m=5F;
        double o=13;

        // завдання 2
        System.out.println("Максимальне значення | Мінімальне значення");
        System.out.println("Byte ="+ Byte.MAX_VALUE+" | "+ Byte.MIN_VALUE);
        System.out.println("Integer ="+ Integer.MAX_VALUE+" | "+ Integer.MIN_VALUE);
        System.out.println("Float ="+ Float.MAX_VALUE+" | "+ Float.MIN_VALUE);
        System.out.println("Short ="+ Short.MAX_VALUE+" | "+ Short.MIN_VALUE);
        System.out.println("Long ="+ Long.MAX_VALUE+" | "+ Long.MIN_VALUE);
        System.out.println("Boolean ="+ "TRUE"+" | "+ "FALSE");

        // завдання 3
        int[] array;
        array = new int[6];

        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 12));
            System.out.println(array[i]);

        }
        int max = array[0], min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Мінімум: "+ min+ "Максимум: "+ max);
    }
}
