public class CalculadoraConExcepciones {
    public static void main(String[] args){
        if(args.length !=3){
            System.out.println("Uso correcto: java Calculadora <operando1> <operador> <operando2>");
            System.exit(1);
        }
        int resultado=0;

            int numeroUno= 0;
            int numeroDos= 0;

            try{
                numeroUno=Integer.parseInt(args[0]);
            } catch(NumberFormatException e){
                System.out.println("Entrada incorrecta: " + args[0]);
                System.exit(1);
            }
            try{
                numeroDos= Integer.parseInt(args[2]);
            }catch(NumberFormatException e){
                System.out.println("Entrada incorrecta: "+ args[2]);
                System.exit(1);
            }
            try {
                switch (args[1].charAt(0)) {
                    case '+':
                        resultado = numeroUno + numeroDos;
                        break;
                    case '-':
                        resultado = numeroUno - numeroDos;
                        break;
                    case '.':
                        resultado = numeroUno * numeroDos;
                        break;
                    case '/':
                        resultado = numeroUno / numeroDos;
                        break;
                    default:
                        System.out.println("Error: Operador no valido. Solo se aceptan '+, -, . o /'");
                        System.exit(1);

                }
                System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + resultado);
            } catch (ArithmeticException e){
                System.out.println("Error: No se puede dividir entre 0");
            }


    }
}
