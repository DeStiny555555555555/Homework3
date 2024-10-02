//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
int cat = 200000;
System.out.println("Значение переменной cat с типом int равно" + cat);
byte dog = 127;
System.out.println("Значение переменной dog с типом byte равно" + dog);
short frog = 20000;
System.out.println("Значение переменной frog с типом short равно" + frog);
long tiger = 900000000;
System.out.println("Значение переменной tiger с типом long равно" + tiger);
float fox = 3.75f;
System.out.println("Значение переменной fox с типом float равно" + fox);
double bird = 25.12;
System.out.println("Значение переменной bird с типом double равно" + bird);


double a = 27.12;
long b = 987678965549L;
float c = 2.786f;
short d = 569;
short e = -159;
short f = 27897;
byte g = 67;


byte one = 23;
byte two = 27;
byte three = 30;
short allPaper = 480;
int total = one + two + three;
int paper = allPaper / total;
System.out.println("На каждого ученика рассчитано" + paper + "листов бумаги");


byte machine = 16;
byte time = 20;
short time1 = 1440;
short time2 = 4320;
int time3 = 44640;
int speedMin = machine / 2;
int and = time * speedMin;
System.out.println("За" + time +  "машина произвела" + and + "штук бутылок");
int and2 = time1 * speedMin;
System.out.println("За" + time1 + "машина произвела" + and2 + "штук бутылок");
int and3 = time2 * speedMin;
System.out.println("За" + time2 + "машина произвела" + and3 + "штук бутылок");
int and4 = time3 * speedMin;
System.out.println("За" + time3 + "машина произвела" + and4 + "штук бутылок");


byte color = 120;
byte white = 2;
byte brown = 4;
int allColor = white + brown;
int allClass = color / allColor;
int needWhite = allClass * white;
int needBrown = allClass * brown;
System.out.println("В школе,где" + allClass + "классов,нужно" + needWhite + "банок белой крски и" + needBrown + "банок коричневой краски");



int bananas = 80 * 5;
int milk = 105 * 2;
int iceCream = 100 * 2;
int egg = 70 * 4;
float allWeight = bananas + milk + iceCream + egg;
float allWeightKg = allWeight / 1000;
System.out.println("Вес в граммах" + allWeight + "Вес в килограммах" + allWeightKg + "кг");


byte weight = 7;
short minWeight = 250;
short maxWeight = 500;
int needWeight = weight * 1000;
int averageWeight = minWeight + maxWeight;
System.out.println(averageWeight);
float averageDayWeight = averageWeight / 2;
System.out.println("Худеет в день" + averageDayWeight);
float dayAverage = needWeight / averageDayWeight;
System.out.println("Понадобится дней в среднем" + dayAverage);


int masha = 67760;
int denis = 83690;
int kristina = 76230;
double up = 1.1;
int mounts = 12;
int upMasha = masha * mounts;
double upYear = upMasha * up;
double averageYear = upYear - upMasha;
System.out.println("Маша теперь получает" + upYear + "рублей. Годовой доход вырос на" + averageYear + "рублей");
int upDenis = denis * mounts;
double upYear1 = upDenis * up;
double averageYear1 = upYear1 - upDenis;
System.out.println("Маша теперь получает" + upYear1 + "рублей. Годовой доход вырос на" + averageYear1 + "рублей");
int upKristina = kristina * mounts;
double upYear2 = upKristina * up;
double averageYear2 = upYear2 - upKristina;
System.out.println("Кристина теперь получает" + upYear2 + "рублей. Годовой доход вырос на" + averageYear2 + "рублей");





for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}