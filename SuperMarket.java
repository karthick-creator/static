class SuperMarket
{
static String name = "Karthick SuperMarket";
static int offer =10; // Declaration and Initialization
int price; //non static --- variable declaration
public static void main(String[] args)
{
SuperMarket product1 = new SuperMarket();
SuperMarket product2 = new SuperMarket();
product1.price = 100; // Initialization
product2.price = 120;
product1.sell(); //Method calling statement
product2.sell();
System.out.println(product1.price);
System.out.println(product2.price);
System.out.println(SuperMarket.name);
//We can access static values using class name
System.out.println(product1.name);
//We can access static values using instance name
System.out.println(name);
//We can access static values directly in the same class
give_offer();//static
}
void sell() //method signatute, sell -method
// () -arguments
{ //Method Body - Definition
System.out.println("Product price is"+ price);
// + means concatenation symbol
}
static void give_offer()
{
System.out.println("Offer % is"+ offer );
}
}
