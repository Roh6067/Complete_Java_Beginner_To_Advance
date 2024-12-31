class Prev{
    public static void main(String[] args) {
        System.out.println("String Builder...");

        String name = "I am ";
        boolean i = name.endsWith(" ");
        // // char i = name.charAt(0);
        // String i = name.substring(0, 4);
        System.out.println(i);
       

       StringBuilder sb = new StringBuilder("I am ");
       sb.append("Jack");
        //sb.reverse();
       sb.insert(4, " InsertAt4");
        //sb.delete(4, 14);
        String in = "Hyy ".concat("This is Me");
        
      System.out.println(sb);
      System.out.println(in);
       
    }
}

