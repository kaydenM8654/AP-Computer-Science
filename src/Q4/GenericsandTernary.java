package Q4;

public class GenericsandTernary {
    static class MyBox<T> {
        private T myVal;

        public MyBox(T thing) { myVal = thing; }
        public void setVal(T thing) {myVal = thing;}
        public T getVal() { return myVal; }
    }

    public static void main(String[] args){
        Var box = new MyBox<Integer>(5);
    }
}
