public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 24));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(48, 55));
        System.out.println(hasSharedDigit(51, 55));
    }
    private static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if((firstNumber<10 || firstNumber >99) || (secondNumber<10 || secondNumber>99)) {  // Validación del número dentro de los rangos solicitados.
            return false;
        }
        int originalSecondNumber = secondNumber;  // Creo la variable originalSecondNumber cuyo valor es secondNumber, estableciendo un punto al cual poder retroceder.
        while(firstNumber>0) {  // Uso bucle while, el cual en cada iteración:
            int firstNumberCurrentDigit = firstNumber % 10; // Crea (o reasigna) la variable firstNumberCurrentDigit con el valor del mod 10 de firstNumber.
            while(secondNumber>0) {  // Usa bucle while anidado, el cual en cada iteración:
                int secondNumberCurrentDigit = secondNumber % 10;  // Crea (o reasigna) la variable secondNumberCurrentDigit con el valor del mod 10 de secondNumber.
                if (firstNumberCurrentDigit == secondNumberCurrentDigit) {  //  Condición que retorna true si existe coincidencia en los dígitos.
                    return true;
                }
                secondNumber /= 10;  // Divide secondNumber / 10 para eliminar el último dígito
            }
            firstNumber /= 10;  // Divide firstNumber / 10 para eliminar el último dígito.
            secondNumber = originalSecondNumber;  // Reasigna el valor de secondNumber a originalSecondNumber, reseteando al valor original de secondNumber.
        }
        return false;  // Retorna false si no hay concordancia alguna.
    }
}
