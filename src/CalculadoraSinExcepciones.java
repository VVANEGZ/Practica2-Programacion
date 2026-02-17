public class CalculadoraSinExcepciones {
    public static void main(String[] args){
        if(args.length !=3){
            System.out.println("Uso: java CalculadorSinExcepcion <operando1> <operador> <operando2>");
            System.exit(1);
        }
        int resultado=0;
        switch(args[1].charAt(0)){
            case '+': resultado= Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
            break;
            case '-': resultado = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
            break;
            case '*': resultado= Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
            break;
            case '/': resultado= Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
            break;
        }
        System.out.println(args[0] + ' '+ args[1]+' '+ args[2]+" = "+ resultado);

    }
}
