public class TabularOutput{
    public static void main(String[] args){

int number = 1;

while(number <= 5){
int number2 = number * number;
int number3 = number * number * number;
int number4 = number * number * number * number;
int number5 = number * number * number * number * number;
System.out.printf("%d\t%d\t%d\t%d\t%d%n", number, number2, number3, number4, number5);
number++;
        }
    }
}
