import java.lang.Math;
public class CalculadoraCientifica {
    double raiz(int a,int b){
        return Math.pow(a,1/b);
    }

    double raiz(double a,double b){
        return Math.pow(a,1/b);
    }

    double raiz(String a,String b){
        return Math.pow(Double.parseDouble(a),1/Double.parseDouble(b));
    }

    double potencia(int a,int b){
        return Math.pow(a,b);
    }

    double potencia(double a,double b){
        return Math.pow(a,b);
    }

    double potencia(String a,String b){
        return Math.pow(Double.parseDouble(a),Double.parseDouble(b));
    }

}
