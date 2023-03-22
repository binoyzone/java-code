public class largestNumber {

    public static void main(String[] args) {
        int[] k = {3,2,7,9,2,4,8};
        int largestNum = 0;
        for (int i : k)
        {
            if(i>largestNum)
            {
                largestNum = i;
            }
        }

        System.out.println("Largest number in array is : " + largestNum);
    }
}
