public abstract class Question1Array {
    public static int findMissingElement (int[] array, int firtElement, int lastElement, int position)
    {
        //sum all the elements in the Aritimetic Progression from 1 to 100 (result is 5050)
        int sum = ((firtElement + lastElement)* position)/2;

        //subtract every element in the array from the sum variable,
        // at the end the sum value will contain the missing element value
        for (int i : array)
            sum -= i;
        return sum;
    }
}
