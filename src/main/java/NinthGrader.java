public class NinthGrader extends Student {

    public NinthGrader() {
        super();
    }

    public NinthGrader(String a, String b) {
        super(a, b, 2024);
    }

    @Override
    public void doSomething() {
        System.out.println("I am preparing for a Harkness discussion!");
    }

    @Override
    public String toString() {
        return super.toString() + " (Ninth Grader)";
    }
}