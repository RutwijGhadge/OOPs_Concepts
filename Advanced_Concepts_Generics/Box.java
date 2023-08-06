public class Box {
    public static void main(String[] args) {
        Box<Integer>box=new Box<>();

        int x=10;   //primitive type -> stored in stack

        Integer y=x;//generic type -> stored on heap
       // primitive to generic convert -> autoboxing
        int z=y;
        //generic y to primitive z ->unboxing
    }
}