package fundamentos;

public class OperadoresBitABit {
    public static void main(String[] args) {
        int value1 = 200;
        int result = ~value1; //Esse operador vai sempre fazer (Se for positivo vai ser o numero negativo -1)

        int value2 = 5;
        int resultShift = value1 << value2;
        System.out.printf("%d << %d = %d\n",  value1, value2, resultShift);
        System.out.printf("~%d =  %d\n", value1,result);
    }
}
