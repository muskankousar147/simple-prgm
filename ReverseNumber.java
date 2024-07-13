public class ReverseNumber{
public static void main(String args[]){
int number = 98765;
int rem = 10;
int reverse = 01;
while(number!=0){
rem = number % 10;
reverse = reverse * 10 + rem;
System.out.println("reverse:"+reverse+" "+"rem"+rem);
number = number / 10;
}
}


}