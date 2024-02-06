public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int[] c = new int[9];

        for(int i = 0; i < c.length; ++i) {
            c[i] = 23 - 2 * i;
        }

        double[] x = new double[12];
        double min = -14.0;
        double max = 2.0;

        for(int i = 0; i < x.length; ++i) {
            x[i] = Math.random() * Math.abs(min) + (Math.abs(max) - Math.abs(min));
        }

        double[][] p = new double[9][12];

        int j;
        for(int i = 0; i < c.length; ++i) {
            for(j = 0; j < x.length; ++j) {
                if (c[i] == 23) {
                    double degree1 = Math.pow(x[j], x[j] / (1.0 - x[j]));
                    double degree2 = Math.pow(0.25 * (degree1 - 1.0), 2.0);
                    p[i][j] = Math.pow(Math.E, degree2);
                }

                if (c[i] != 7 && c[i] != 9 && c[i] != 11 && c[i] != 17) {
                    double numerator = Math.cbrt(Math.pow(x[j], 2.0 / x[j])) - 4.0;
                    double denominator = Math.asin(Math.pow(Math.E, -Math.abs(x[j])));
                    p[i][j] = Math.cbrt(Math.pow(numerator / denominator, 2.0));
                } else {
                    double degree21 = Math.pow(Math.E, x[j] / 1.0 / 4.0);
                    p[i][j] = Math.cos(degree21);
                }
            }
        }

        double[][] var30 = p;
        j = p.length;

        for(int var20 = 0; var20 < j; ++var20) {
            double[] result = var30[var20];
            double[] var22 = result;
            int var23 = result.length;

            for(int var24 = 0; var24 < var23; ++var24) {
                double i = var22[var24];
                String str = String.format("%3f", i);
                System.out.printf("%8s", str);
                System.out.print("\t");
            }

            System.out.println();
        }

    }
}
