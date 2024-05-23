public class ExibirNaturais {
    public static void main(String[] args) {
        //exibir naturais de 1 a 10 com for
        for(var count = 1;count<=10;count++){
            System.out.println(count);
        }
        //exibir naturais de 1 a 10 com while, apenas pares
        var counter = 2; 
        while (counter <= 10){
            System.out.println(counter);
            counter = counter + 2;
        }
        //exibir os naturais de 5 a 1 com for nesta ordem
        for(var count = 5;count>=1;count= count -1){
            System.out.println(count);
        }
    }
    
}
