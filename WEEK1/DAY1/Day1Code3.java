class Day1Code3{
    public static void main(String[] args)
    {
        // declares an Array of integers.
        int[] arr = new int[5];;

        // initialize the elements of the array, first to last(fifth) element
      	arr[0] = 2;
		arr[1] = 4;
        arr[2] = 8;
        arr[3] = 12;
        arr[4] = 16;

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i + " : " + arr[i]);
    }
}
