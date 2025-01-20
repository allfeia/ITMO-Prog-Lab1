public class Main {
    public static void main(String[] args) {
        int[] c = new int[9];
        for (int i = 0; i<c.length; i++){  
            c[i] = 23-2*i;
        }
        double[] x = new double[12];     
        double min = -14.0;
        double max = 2.0;
        for(int i = 0; i<x.length; i++){     
            x[i] = ((double)(Math.random() * Math.abs(min) + (Math.abs(max) - Math.abs(min))));  
        }
        double[][] p = new double[9][12]; 
        double degree1;   
        double degree2;
        double degree21;
        double numerator;
        double denominator;
        for(int i = 0; i<c.length; i++){   
            for(int j = 0; j<x.length; j++){  
                if(c[i] == 23){
                    degree1 = Math.pow(x[j],x[j]/(1-x[j]));
                    degree2 = Math.pow(0.25*(degree1-1),2);
                    p[i][j] = Math.pow(Math.E, degree2);
                }
                if((c[i] == 7) || (c[i] == 9) || (c[i] == 11) || (c[i] == 17)){
                    degree21 = Math.pow(Math.E, (x[j]/1)/4);
                    p[i][j] = Math.cos(degree21);
                } else{
                    numerator = (Math.cbrt(Math.pow(x[j], 2/x[j])))-4;
                    denominator = Math.asin(Math.pow(Math.E,-Math.abs(x[j])));
                    p[i][j] = Math.cbrt(Math.pow(numerator/denominator,2));
                }
            }
        }
        for(double result[] : p){    
            for(double i : result){   
                String str = String.format("%3f", i);   
                System.out.printf("%8s", str);    
                System.out.print("\t");   
            }
            System.out.println();   
        }
    }
}
