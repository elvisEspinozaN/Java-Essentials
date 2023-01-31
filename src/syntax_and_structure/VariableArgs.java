package syntax_and_structure;

public class VariableArgs {

    /*
    Variable Arguments
    only one varargs parameter
    save yourself a lot of boilerplate coding
     */

    public static void main(String[] args) {
        calculateSum();
        calculateSum(2, 3);
        calculateSum(2, 3, 4, 5, 6);
        calculateSum(new int[]{1, 2, 3 , 4, 5});
    }

    public static void calculateSum(int ...a) {
        int sum = 0;

        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        System.out.println(sum);
    }
}
