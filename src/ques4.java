public class ques4 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {4, 5}};
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of row" + sum);
        }
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            System.out.println("Sum of column" + sum);
        }
    }
}
