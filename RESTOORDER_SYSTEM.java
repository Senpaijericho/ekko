/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restoorder_system;


import java.util.Scanner;
public class RESTOORDER_SYSTEM {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);       
        System.out.println("HI WELCOME TO SIZZLE&SLICE \nGRILLHOUSE SPECIAL.");
               
        System.out.println("\n                    HERES THE MENU!");
        System.out.println("*************************************************************");
        System.out.println("*           [1]SIZZLE SUPREME PLATTE/WITH ICETEA.           *");
        System.out.println("*      -A combination of classic pork sisig                 *");
        System.out.println("*       and tender beefsteak slices, served                 *");
        System.out.println("*       with garlic rice and grilled vegetables.            *");
        System.out.println("*                   ₱950.00.                                *");
        System.out.println("*                                                           *");
        System.out.println("*                                                           *");
        System.out.println("*           [2]STEAKHOUSE SISIG SURPRISE/WITH ICETEA.       *");
        System.out.println("*      -Grilled steak strips topped with a generous         *");
        System.out.println("*       serving of sizzling pork sisig accompanied by       *");
        System.out.println("*             mashed potatoes and buttered corn.            *");
        System.out.println("*                   ₱850.00.                                *");
        System.out.println("*                                                           *");
        System.out.println("*                                                           *");
        System.out.println("*           [3]BEEFY BLISS BOWL/WITH ICETEA.                *");
        System.out.println("*      -A bowl filled with rice, mixed greens, grilled      *");
        System.out.println("*       steak cubes, crispy sisig flakes, and a drizzle     *");
        System.out.println("*                  of tangy dressing.                       *");
        System.out.println("*                   ₱550.00.                                *");
        System.out.println("*                                                           *");
        System.out.println("*                                                           *");
        System.out.println("*           [4]SURF & TURF SKEWERS/WITH ICETEA.             *");
        System.out.println("*      -Skewers alternately threaded with succulent         *");
        System.out.println("*       grilled shrimp and tender beefsteak chunks,         *");
        System.out.println("*        served with garlic rice and dipping sauce.         *");
        System.out.println("*                   ₱900.00.                                *");
        System.out.println("*                                                           *");
        System.out.println("*                                                           *");
        System.out.println("*           [5]STEAKHOUSE SALAD SENSATION/WITH ICETEA.      *");
        System.out.println("*      -A fresh salad featuring mixed greens, cherry        *");
        System.out.println("*       tomatoes, grilled steak strips, crispy sisig        *");
        System.out.println("*          bits, and balsamic vinaigrette dressing.         *");
        System.out.println("*                    ₱650.00.                               *");
        System.out.println("*************************************************************");
        Menu order1 = new Menu("SIZZLE SUPREME PLATTER.", 950);
        Menu order2 = new Menu("STEAKHOUSE SISIG SURPRISE.", 850);
        Menu order3 = new Menu("BEEFY BLISS BOWL.", 550);
        Menu order4 = new Menu("SURF & TURF SKEWERS.", 900);
        Menu order5 = new Menu("STEAKHOUSE SALAD SENSATION.", 650);
        
        System.out.print("Enter your name: ");
        String user = sc.nextLine().toUpperCase();
        CustomerName customer = new CustomerName(user);
        
        System.out.println("Enter number of meal to order(Input number 0/zero to done ordering): ");
        int itemName;
        while ((itemName = sc.nextInt()) != 0) {
            switch (itemName) {
                case 1:
                    customer.addItemToOrder(order1);
                    System.out.println("SIZZLE SUPREME PLATTER.\n₱950.00");
                    break;
                case 2:
                    customer.addItemToOrder(order2);
                    System.out.println("STEAKHOUSE SISIG SURPRISE.\n₱850.00");
                    break;
                case 3:
                    customer.addItemToOrder(order3);
                    System.out.println("BEEFY BLISS BOWL.\n₱550.00");
                    break;
                    case 4:
                    customer.addItemToOrder(order4);
                    System.out.println("SURF & TURF SKEWERS.\n₱900.00");
                    break;
                    case 5:
                    customer.addItemToOrder(order5);
                    System.out.println("STEAKHOUSE SALAD SENSATION.\n₱650.00");
                    break;
                default:
                    System.out.println("Invalid Order!");
            }
        }                                        
        
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Total Order Price: ₱" + customer.getTotalOrderPrice());
        
        System.out.print("\nEnter your Money: ");
        int money= sc.nextInt();
        
        if (money<customer.getTotalOrderPrice()) {
            System.out.println("Your money is not enough to pay the bill");          
        }
        else if (money==customer.getTotalOrderPrice()) {
            System.out.println("Your money is exactly enough to pay the bill");           
        }
        
        else if (money>=customer.getTotalOrderPrice()) {
            System.out.println("Here's your Change: ₱" +  (money-customer.getTotalOrderPrice()));          
        }
        else {
            System.out.println("Something went wrong");
        }
        
        
        
                
    }
}
            
        
        
        
        
        
        



        
  