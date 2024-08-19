public class Main {

    public static void main(String[] args)
    {
        /*
            1) Написать метод, возвращающий количество чётных элементов массива.
                    countEvens([2, 1, 2, 3, 4]) → 3
                    countEvens([2, 2, 0]) → 3
                    countEvens([1, 3, 5]) → 0
         */
        System.out.println(countEvens(new int[] {2, 1, 2, 3, 4}));
        System.out.println(countEvens(new int[] {2, 2, 0}));
        System.out.println(countEvens(new int[] {1, 3, 5}));

        /*
            2) Написать функцию, возвращающую разницу между самым большим и самым маленьким
               элементами переданного не пустого массива.
         */
        System.out.println("range: " + getRange(new int[] {2, 1, 2, 3, 4}));

        /*
            3) Написать функцию, возвращающую истину, если в переданном массиве
               есть два соседних элемента, с нулевым значением.
         */
        System.out.println("is two zero: " + isZero(new int[] {2, 1, 2, 3, 4, 0}));
        System.out.println("is two zero: " + isZero(new int[] {2, 1, 2, 3, 4, 0, 0}));

    }

    static int countEvens(int[] array)
    {
        int count = 0;
        for (int i : array)
        {
            if ((i & 0x01) == 0)
                count++;
        }
        return count;
    }

    static int getRange(int[] array)
    {
        int min = array[0], max = array[0];
        for (int i : array)
        {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return max - min;
    }

    private static boolean isZero(int[] array)
    {
        for (int i = 0; i < array.length-1; i++)
        {
            if (array[i] == 0 && array[i+1] == 0)
                return true;
        }
        return false;
    }

}