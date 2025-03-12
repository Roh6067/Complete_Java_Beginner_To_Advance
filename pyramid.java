class pyramid {

    public static void main(String[] args) {
        // 1 to n no's
        int num = 4;

        for (int i = 0; i < num; i++) {
            // spaces : num - i - 1
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }

            // num1 : i+1
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("*");
            }

            // num2
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
