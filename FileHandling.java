import java.io.*;

class FileHandling{
    public static void main(String[] args) {
        File MyFile = new File("Abc.txt");

        // for file creating
        try {
            MyFile.createNewFile();
        } catch (Exception e) {
            System.out.println("Error occured while creating file...");
        }

        // try {
            // Writing something in file
            // try {
            
            //     FileWriter NewWriter = new FileWriter("Abc.txt");
            //     NewWriter.write("Hey World! Write Code for Humans, Not Just Machines.");
            //     NewWriter.close();
            
            // } catch (Exception e) {
            //     System.out.println("Can't write in file");
            // }
            

            // Reading file content
        // try {
        //     FileReader MyReader = new FileReader("Abc.txt");
        //     Scanner sc = new Scanner(MyReader);
        //     while(sc.hasNextLine()){
        //         String read = sc.nextLine();
        //         System.out.println(read);
        //     }
        // } catch (Exception e) {
        // }
        
        // Deleting file 
        // File NFile = new File("Abc.txt");
        // if(NFile.delete()){
        //     System.out.println(NFile.getName() + " is deleted successfully");
        // }else{
        //     System.out.println("Can't delete may , may not present!");
        // }


        try (FileInputStream fis = new FileInputStream("Abc.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}