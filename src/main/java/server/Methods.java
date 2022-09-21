package server;

public class Methods {
    public double addition (double num1, double num2) {
        return (num1 + num2);
    }

    public String imc (String name,double peso,double altura){
        double IMC = peso/(altura*altura);
        return"Hola "+name+", tu IMC es de: "+ IMC;
    }
    public String calculator(double num1, double num2, double num3, double num4){
        double addition = num1+num2+num3+num4;
        double avarage = (num1+num2+num3+num4)/4;
        double multiplication = num1*num2*num3*num4;
        return "El producto es: "+multiplication+"\n"+
                "La suma es: "+addition+"\n"+
                "El promedio es: "+avarage;
    }

    public int plus(int base, int limit) {
        int addition = base;
        for (int i =0; i<limit; i++){
            addition += limit;
            limit --;
        }
        return addition;
    }

    public int[] array (int[] counter,int number){
        counter = new int[5];
        for (int i = 0; i < counter.length; i++){
            counter[i] = number;
        }
        for (int i = 0; i < counter.length; i++){
            System.out.println(counter[i]);
        }
        return counter;
    }
}
