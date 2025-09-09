
public class MaddnessWithMethods {
    public static void main(String[] args) {

        String aName = "Chany";

        helloThere(aName);

        int Num1 = 34;
        int Pepperoni = 4;

        int z = addTwoInts(Num1,Pepperoni);
        System.out.println(z);
    }

    static void helloThere(String aName) {
        System.out.println("Hello there " + aName);
    }
    static int addTwoInts(int Num1, int Pepperoni) {
        int z = Num1 + Pepperoni;
        return z;
    }
}

