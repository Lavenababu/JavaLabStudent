public class CalcBox {
    double height;
    double depth;
    double width;
    double weight;
}
    class NewBox{
        public static void main(String[] args) {
            CalcBox a = new CalcBox();
            CalcBox b = new CalcBox();

            double volume1, volume2;

            a.height = 10;
            a.depth = 10;
            a.width = 10;
            a.weight = 10;

            b.height = 10;
            b.depth = 5;
            b.width = 10;
            b.weight = 15;

            volume1 = a.height * a.width * a.depth * a.weight;
            volume2 = b.height * b.width * b.depth * b.weight;

            System.out.println("Volume "+volume1);
            System.out.println("Volume "+volume2);

        }
    }
