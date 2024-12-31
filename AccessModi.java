// class animal{
//     protected  int i = 10;

//     public int s(){
//         return i;
//     }
// }

// class b extends animal{
//     void show(){
//     System.out.println("this will show: " + s());
//     System.out.println(i);
//     }
// }


class ExampleModifiers{
    public int sum(int x, int y){
        return x + y;
    }

    private void Pshow(){
        System.out.println("Private method");
    }

}

class AccessModi{
    public static void main(String[] args) {
        ExampleModifiers obj = new ExampleModifiers();
        System.out.println(obj.sum(5,8));
        
    }
}