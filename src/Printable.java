public interface Printable {
    void print();
    private void my(){
        System.out.println("my private method");
    }
    public static void mystatic(){
        System.out.println("This is my static method");
    }
}