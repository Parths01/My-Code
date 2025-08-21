class test{
    int a;
    test(int a){
        this.a = a;
    }
    test(int a, int b){
        this(a); // Calls the first constructor
        System.out.println("Value of a: " + this.a);
        System.out.println("Value of b: " + b);
    }
}

class thisDemo {

    public static void main(String[] args) {
        test obj = new test(5);
        System.out.println("Object created with a = " + obj.a);
    }
}
