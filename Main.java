public class Main {
    public static void main(String[] args) {
        int[] c = new int[9];
        for (int i = 0; i<c.length; i++){  ////заполнение одномерного массива нечётными числами в порядке убывания от 23 до 7
            c[i] = 23-2*i;
        }
        double[] x = new double[12];      //создание нового одномерного массива типа double
        double min = -14.0;
        double max = 2.0;
        for(int i = 0; i<x.length; i++){     //int i от 0; пока i<длинны массива x; при каждом вхождении в цикл добавляется +1 к индксу, используемого элемента
            x[i] = ((double)(Math.random() * Math.abs(min) + (Math.abs(max) - Math.abs(min))));  //разница между модулем макс и мин значения определяет диапазон случайных чисел,
        //а умножение метода Math.random() на модуль мин значения позволяет получить случайное число в диапазоне от 0 до мин значения.
        //Добавление разницы между макс и мин значениями позволяет получить случайное число от 0 до разницы между макс и мин значениями
        }
        double[][] p = new double[9][12]; //создание двумерного массива
        double degree1;   //объявление переменных над циклом(тк если объявить их в самом цикле, то при каждом вхождении переменная пересоздаётся, из-за чего занимается больше памяти)
        double degree2;
        double degree21;
        double numerator;
        double denominator;
        for(int i = 0; i<c.length; i++){   //обозначение переменной i как индекс элемента в массиве c
            for(int j = 0; j<x.length; j++){   //вложенный цикл, обозначение переменной j как индекс элемента в массиве x
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
        for(double result[] : p){    //цикл, который перебирает каждый элемент массива р и присваивает его значение переменной result
            for(double i : result){   //цикл, который перебирает каждый элемент массива result и присваивает его значение переменной i
                String str = String.format("%3f", i);   //форматирование строки с тремя знаками после запятой
                System.out.printf("%8s", str);    //вывод строки с шириной пробела в 8 символов
                System.out.print("\t");   //вывод символа табуляции для разделения значений
            }
            System.out.println();   //перевод строки для перехода на новую строку после вывода всех значений внутри цикла
        }
    }
}