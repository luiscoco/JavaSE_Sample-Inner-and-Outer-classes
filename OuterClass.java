public class OuterClass {
    private int outerField;

    public OuterClass(int outerField) {
        this.outerField = outerField;
    }

    public void outerMethod() {
        System.out.println("Outer Method");
    }

    public class InnerClass {
        private int innerField;

        public InnerClass(int innerField) {
            this.innerField = innerField;
        }

        public void innerMethod() {
            System.out.println("Inner Method");
            System.out.println("Accessing outerField: " + outerField);
            outerMethod();
        }
    }

    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass(10);
        OuterClass.InnerClass innerObj = outerObj.new InnerClass(20);

        innerObj.innerMethod();
    }
}
