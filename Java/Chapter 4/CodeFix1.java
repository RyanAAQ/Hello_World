public class CodeFix1{
    public static void main(String[] args){
//Previous code

//if (age >= 65);
//System.out.println("Age is greater than or equal to 65");
//else
//System.out.println("Age is less than 65)";
//(a)
int age = 70;
if (age >= 65){
System.out.println("Age is greater than or equal to 65");
}
else
System.out.println("Age is less than 65");

//(b)
//int x == 1, total == 0;
//while (x <= 10) {
//total ++x;
//System.out.println(x);
//}

int x = 0; int total = 0;
while (x < 10) {
total = x++;
System.out.println(x);
}

//(c)
//while (x <= 100)
//total += x;
//++x;

int x1 = 0;
while (x1 < 100){
total += x1;
++x1;
System.out.println(x1);
}

//(d)
//while (y =! 0)
//{
//System.out.println (y);

int y = 1;
while (y != 0)
{
System.out.println(y);
y++;
break;
}
    }
}

