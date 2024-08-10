class Bankaccount{
int total = 1000;
void withdraw(String name, int withdraw){
   if (total>= withdraw){
   System.out.println(name + " withdrawn " + withdraw);
   total = total - withdraw;
   System.out.println("Balance after withdrawal:" + total);
   }
   else{
   System.out.println(name + " You can not withdraw " + withdraw);
   System.out.println(" Your balance is:" + total);
   }}
void deposit(String name, int deposit){
   System.out.println(name + " deposited " + deposit);
   total = total + deposit;
   System.out.println("Balance after Deposition:" + total);
}}
class Amount{
   public static void main(String [] args){
   Bankaccount obj = new Bankaccount();
   obj.withdraw("Tiya",200);
   obj.withdraw("Teesha",400);
   obj.deposit("Vansh",350);
   obj.withdraw("Tamanna",200);
   obj.withdraw("Diya",800);
   obj.withdraw("Prerna",400);
}
}