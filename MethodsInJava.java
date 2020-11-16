package methodsinjava;


public class MethodsInJava {
    
    
    static void orderStarter() {
        String starterMenu = "Caesar Salad";
        System.out.println(starterMenu + " with light cheese");
    }
    
    static void orderMain() {
        String menu = "Penne Rosa";
        System.out.println(menu + " with extra cheese");
    }
    
    static void orderDesert() {
        String desertMenu = "Caramel Brownie";
        System.out.println(desertMenu);
    }
    
    static void paymentMethod() {
        String paymentMethod = "Do you accept credit?";
        System.out.println(paymentMethod);
    }
    
    public static void main(String[] args) {
        //Starter code 
        paymentMethod();
        orderMain();
        orderStarter();
        orderDesert();
    }
    
}
