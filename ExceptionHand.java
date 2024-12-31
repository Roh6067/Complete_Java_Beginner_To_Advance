
class ExceptionHand {

    public static void main(String[] args) throws MyException{
        //     ExceptionHand obj = new ExceptionHand(); // Create an instance to call the method
        //     try {
        //         obj.print(); // Call method 
        //     } catch (Exception e) {
        //         System.out.println("Exception caught: " + e.getMessage());
        //     }
        // }

        // public void print() throws Exception {
        //     System.out.println("Throws exception");
        //     throw new Exception("This is a test exception."); // Explicitly throwing an exception

        int age = 500;
        
        if(age < 100){
            throw new MyException();
        }


        class MyException extends RuntimeException {

        }
    }

    private static class MyException extends Exception {

        public MyException() {
        }
    }
}
