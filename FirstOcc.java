public class FirstOcc {
    public static void main(String args[]) {
        int arr[] = {2,4,6,8,10,2,6,6};
        int Num = 6;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == Num) {
                System.out.println(i);
                return; // ends main() and the program
            }
        }

        System.out.println("-1");
    }
}