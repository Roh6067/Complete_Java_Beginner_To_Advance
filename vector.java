import java.util.Vector;

public class vector{

    public static void main(String[] args) {
        Vector<Integer> v = new  Vector<>(5);
       v.add(44);
       v.add(44);
       v.add(44);
       v.add(44);
       v.add(44);
       System.out.println(v.capacity());
       v.add(44);
       System.out.println(v.capacity());
       v.add(44);
       System.out.println(v.capacity());
       v.add(44);
       v.add(44);
       v.add(44);
       v.add(44);
       System.out.println(v.capacity());
      


        // Adding Elements
        // v.add("Hello");
        // System.out.println(v);
        // v.addElement("Java"); //Add Single Element
        // v.add(1,"Apple");
        // System.out.println(v);  // Print --> Hello, Apple, Java

        // //Accessing Elements
        // System.out.println("Second Element: " + v.get(2)); // Print--> Apple 

        // // Modifying Elements
        // v.remove(2); // remove 2 index element
        // System.out.println(v); // Print --> Hello, Java
        //  v.add(2,"C##");
        // System.out.println(v); // Print --> Hello, Java
        // System.out.println(v.capacity()); // Current Capacity
        // System.out.println(v.size()); // No of Elements 
        // System.out.println(v.contains("Apple")); // 'Contains' return true if existing otherwise false
        
    }
}