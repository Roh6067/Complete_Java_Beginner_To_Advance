
class exception {

    public static void main(String[] args) {

        System.out.println("Hello Thread");

        try {
        throw new ArithmeticException("/ by zero");
            
        } catch (ArithmeticException e) {
            System.out.println("Catch by throw");
        }
        
        // try {
        //     System.out.println(20 / 0);
        // } catch (ArithmeticException e) {
        //     throw new ArithmeticException("Divide by zero exception throw");
        // } finally {
        //     System.out.println("I am always here!");  // always run
        // }

    }
}
