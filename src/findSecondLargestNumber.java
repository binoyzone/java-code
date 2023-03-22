public class findSecondLargestNumber {

    public static void main(String[] args) {

        int[] k = {3,2,7,9,2,4,8};
        int largestNum = 0;
        int secondLargestNum = 0;
        for (int i : k)
        {
            if(i>largestNum)
            {
                secondLargestNum = largestNum;
                largestNum = i;
            }
            else if (i > secondLargestNum)
            {
                secondLargestNum = i;
            }
        }

        System.out.println("Second largest number in array is : " + secondLargestNum);
    }
}
