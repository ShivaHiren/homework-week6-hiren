package homeworkweek6;
//4.1 Declare two instance and two static variables.
//4.2 Declare one instance method.
//4.3 Declare one static method.
//4.4 Call all four instance and static variables into both instance and static methods inside the
//print statement.
//4.5 Declare the Main method.
//4.6 Call both instance and static methods into the Main method and run the programme

public class Programme4 {

    int a = 10; //iVar1
    int b = 20;//Ivar2

    static String xy = "Hi"; // sVar1
    static String zx = "how are you"; // sVar2
    public static void main(String[] args) {
        Programme4 programme4 = new Programme4();
        Programme4.instMethod();
        statMethod();
    }

    static void instMethod() {
        System.out.println(xy);
        System.out.println(zx);
        System.out.println(xy);
        System.out.println(zx);
    }
    static void statMethod(){
        Programme4 statVar = new Programme4();
        System.out.println(statVar.a);
        System.out.println(statVar.b);
        System.out.println(statVar.xy);
        System.out.println(statVar.zx);

    }
}
