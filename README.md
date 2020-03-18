# ProgramTesting1
Варіант 11 Група В
Програма складається з Package “Program” який містить 2 класи :
	Run
	Function

 Клас Function містить 3 статичних поля Scanner SC яке використовується для введення даних. Pattern EXPRESSION_PATTERN патерн який слугує шаблоном для введення даних типу цілочисельного або числа з плаваючою точкою. Та поле float MyX яке викликає метод для ініціалізації Х.
static Scanner SC = new Scanner(System.in);
private static final Pattern EXPRESSION_PATTERN = Pattern.compile("^(\\d*|\\d*[.]\\d*)$");
static float MyX = GetX();

Метод GetX() слугує для ініціалізації змінної Х і виконує прийом даних з клавіатури, аналізує коректність введених даних та за допомогою бібліотеки Matcher та Pattern за допомогою яких виявляється чи належить введений з клавіатури вираз до потрібного типу даних та його коректність,  та операції if у якій аналізується чи входить даний вираз у діапазон значень
 X<=0.03, X>=140.282. Якщо все вірно програма повертає значення Х якщо ні виводиться повідомлення про некоректні данні та функція повертає 0;
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

Також клас Function є основним та містить 4 функції які слугують для обрахування заданих функцій сепаративно тобто можуть бути викликані не залежно одна від одної 
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

Функції в якості аргумента X приймає число типу Float. А повертає відповідь у чисельному вигляді типу Double. Обрахунки здійснюються за допомогою стандартної бібліотеки Math з якої використовується метод Math.pow(). 

 Типи даних що були використані:
Тип 	Довжина (в байтах)	Діапазон або набір значень
boolean	не визначено	true, false
float	4	-(2-2−23)·2127..(2-2−23)·2127, або приблизно −3.4·1038..3.4·1038, а також -∞,+∞ , NaN

double	8	-(2-2−52)·21023..(2-2−52)·21023, або приблизно −1.8·10308..1.8·10308, а також ∞,+∞ , NaN


