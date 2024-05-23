
//sobrecarga de metodos
//polimorfismo estatico
public class Calculadora {
    public int somar(int... valores){
        int r = 0;
        for(var v : valores){
            r += v;        
        }
        return r;
    }
    public int somar(int a,int b){
        return a + b;
    }

    public float somar(float a,float b){
        return a - b;
    }
    
    public int somar(String a, String b){
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    public int somar(String a,int b){
        return somar(Integer.parseInt(a),b);
    }

    public int somar(int a, String b){
        return somar(Integer.toString(a),b);
    }

    public int somar(int a, int b,int c){
        return somar(a, somar(b,c));

    }

}