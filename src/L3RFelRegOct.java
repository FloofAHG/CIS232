public class L3RFelRegOct extends Shape {
    public L3RFelRegOct(double s) {
        side = s;
    }

    private double side;

    @Override
    public double area() {
        return (2 * (1 + Math.sqrt(2)) * side * side);
    }

    @Override
    public double perimeter() {
        return (side * 8);
    }

    @Override
    public String toString() {
        return "Side: " + side + ", Perimeter: " + this.perimeter() + ", Area: " + this.area();
    }

    // Made this sort entirely by myself using past knowledge; I am not sure if it
    // has a name.
    public static void lab3sort(L3RFelRegOct[] input) {
        for (int i = 0; i < 20; i++) {
            L3RFelRegOct temp = new L3RFelRegOct((double) Integer.MAX_VALUE);
            for (int j = i; j < 20; j++) {
                if (input[j].compareTo(temp) < 0) {
                    temp = input[j];
                    input[j] = input[i];
                    input[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        L3RFelRegOct a[] = new L3RFelRegOct[20];
        for (int i = 0; i < 20; i++) {
            a[i] = new L3RFelRegOct(Math.floor(Math.random() * 20 * 100) / 100);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("Octagon " + (i + 1) + ": " + a[i]);
        }
        System.out.println("\n" + "Sorted Octagon Array:" + "\n");
        lab3sort(a);
        for (int i = 0; i < 20; i++) {
            System.out.println("Octagon " + (i + 1) + ": " + a[i]);
        }
    }
}
