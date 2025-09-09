Buying a ticket with a ticket machine using BlueJ

### Code
```
/**
 * Write a description of class ticketmachine here.
 *
 * @author Rafi Aqila Maulana
 * @version 09/09/2025
 */
public class ticketmachine
{
    // instance variables - replace the example below with your own
    private int price;
    private int balance;
    private int total;

    /**
     * Constructor for objects of class ticketmachine
     */
    public ticketmachine(int ticketcost)
    {
        price = ticketcost;
        balance = 0;
        total = 0;
        
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public int getBalance()
    {
        return balance;
    }
    
    public void insertMoney(int money)
    {
        if (money >0)
        {
            balance = balance + money;
        }
        else
        {
            System.out.println("Please insert again");
        }
    }
    
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        if (balance >= price)
        {
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();
            // Update the total collected with the balance.
            total = total + price;
            // Clear the balance.
            balance = balance - price;
        }
    }
}
```
### Ticket cost input
<img width="528" height="358" alt="image" src="https://github.com/user-attachments/assets/4aa7bd27-8654-438d-b961-e43d5e58f17b" />

Successfully creating the object with ticket price of 100 cents
<img width="712" height="365" alt="image" src="https://github.com/user-attachments/assets/3c06d60b-d423-40b2-bfbb-0f079d01ebd1" />

### Insert money to the machine
<img width="529" height="286" alt="image" src="https://github.com/user-attachments/assets/c35d1a34-825e-417d-9747-6c96bf5ec17e" />

After we inserted the money now we have a balance of 1000 cents
<img width="711" height="362" alt="image" src="https://github.com/user-attachments/assets/40bee921-f6cd-4046-b6fd-ac49adb0a6b9" />

### Print the ticket
<img width="707" height="486" alt="image" src="https://github.com/user-attachments/assets/cd25ec18-6334-48b2-963d-ff7c39255839" />

Succesfully printed out  ticket
<img width="705" height="616" alt="image" src="https://github.com/user-attachments/assets/70a7e258-cf87-47d9-86fc-79972b5a4d1e" />

Our balance now decrease and we can see the total amount of money that we spent
<img width="706" height="344" alt="image" src="https://github.com/user-attachments/assets/4c8b166b-c42e-42a7-83e0-2ece680d6c48" />




