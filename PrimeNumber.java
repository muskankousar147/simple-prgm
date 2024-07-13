public class PrimeNumber{
public static void main(String args[]){
	int count = 0;
	int number = 8; 
if(number<2){
System.out.println("its not a prime number");
}
for(int i=2; i<=number; i++){
if(number%i == 0){
count++;
}
}
if(count<2){
System.out.println("it is a prime number");
}
else{
	System.out.println("its not a prime number");
}
}

}