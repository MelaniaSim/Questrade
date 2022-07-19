public class TwoLargest {
    public static void main(String[] args) {
        int arr[] = {4, 5, 99, 100,88,6};

        if (arr.length > 1) {
            int max1 = arr[0];
            int max2 = arr[1];
            // Swap the first elements of array if the second element is greater than the first.
            if (max1 < max2) {
                max1 = max1 + max2;
                max2 = max1 - max2;
                max1 = max1 - max2;
            }
            // Finding the two greatest elements.
            for (int i = 2; i < arr.length; i++) {
                if (arr[i] > max1) {
                    max2 = max1;
                    max1 = arr[i];
                } else if (arr[i] > max2) {
                    max2 = arr[i];
                }
            }
            System.out.println("The first greatest number is " + max1 +
                    ". The second greatest number is " + max2 + ".");
        } else
            System.out.println("There is no array or only one number!");
    }
}
