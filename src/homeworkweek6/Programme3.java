package homeworkweek6;
/*3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme*/

import java.lang.reflect.Method;

public class Programme3 {

    int iVar = 10;

    static String sVar = "My Name";

    public static void main(String[] args) {
        Programme3 twoVar = new Programme3();
        twoVar.myInstant();
        myStatic();
    }

    void myInstant() {
        System.out.println(sVar);
        System.out.println(iVar);
    }

        static void myStatic () {
        Programme3 statVar = new Programme3();
            System.out.println(sVar);
            System.out.println(statVar.iVar);
        }
    }