package Program;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Function {
    static Scanner SC = new Scanner(System.in);
    private static final Pattern EXPRESSION_PATTERN = Pattern.compile("^(\\d*|\\d*[.]\\d*)$");
    static float MyX = GetX();

    public static float GetX(){
        System.out.println("Input expression");
        String NewX = SC.next();
        Matcher m;
        float X=0;
        m = EXPRESSION_PATTERN.matcher(NewX);
        boolean check = m.matches();
        if(check ){
            X = Float.parseFloat(m.group(1));
            if((X<=0.03)|(X>=140.282)){
                return X;
            }
            else {
                X=0;
                System.out.println("Not correct data");}
        }
        else {
            System.out.println("Not correct data"); }
        return X;
    }


    public static double Func1(float X){
        double y = Math.pow(X,4*2.514)+Math.pow(X,3*4.712)-Math.pow(X,2*4.59)+Math.pow(X,1.181);
        return y;
    }

    public static double Func2(float X){
        double y = Math.pow(X,3*5.372)-Math.pow(X,2*2.298)+Math.pow(X,2.494);
        return y;
    }

    public static double Func3(float X){
        double y = Math.pow(X,2*2.528)+Math.pow(X,3.393);
        return y;
    }

    public static double Func4(float X){
        double y = Math.pow(X,2.781);
        return y;
    }

}
