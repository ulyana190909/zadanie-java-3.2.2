public class phonebonus {
    public static void main(String[] args) {
        boolean accountreplenishment = true;
        int bonus;
        if (accountreplenishment) {
            bonus = 1;
        } else {
            bonus = 0;
        }
        float pay = 1700;
        float totalbonus = pay * bonus / 100;
        long limit = 1000;
        if (bonus > limit) {
            bonus = limit;
        }
        System.out.println(totalbonus);
    }
}


"C:\Program Files\Java\jdk-11.0.7\bin\java.exe" -javaagent:C:\Users\79269\AppData\Local\JetBrains\Toolbox\apps\IDEA-C\ch-0\201.7846.76\lib\idea_rt.jar=60041:C:\Users\79269\AppData\Local\JetBrains\Toolbox\apps\IDEA-C\ch-0\201.7846.76\bin -Dfile.encoding=UTF-8 -classpath C:\Users\79269\IdeaProjects\untitled\out\production\untitled phonebonus
17.0

Process finished with exit code 0




Public class phonebonus {
    public static void main(String[] args) {
        boolean accountreplenishment = false;
        int bonus;
        if (accountreplenishment) {
            bonus = 1;
        } else {
            bonus = 0;
        }
        float pay = 900;
        float totalbonus = pay * bonus / 100;
        long limit = 1000;
        if (totalbonus > limit) {
            totalbonus = limit;
        }
        System.out.println(totalbonus);
    }
}


"C:\Program Files\Java\jdk-11.0.7\bin\java.exe" -javaagent:C:\Users\79269\AppData\Local\JetBrains\Toolbox\apps\IDEA-C\ch-0\201.7846.76\lib\idea_rt.jar=60229:C:\Users\79269\AppData\Local\JetBrains\Toolbox\apps\IDEA-C\ch-0\201.7846.76\bin -Dfile.encoding=UTF-8 -classpath C:\Users\79269\IdeaProjects\untitled\out\production\untitled phonebonus
0.0

Process finished with exit code 0

