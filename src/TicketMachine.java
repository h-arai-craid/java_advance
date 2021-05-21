import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class TicketMachine
 {
    List<String> basket = new ArrayList <>();
    int sizeCountS = 0;
    int sizeCountM = 0;
    int sizeCountL = 0;

    final int PRICE_S = -50;
    final int PRICE_M = 0;
    final int PRICE_L = 100;


    public void getAllMenu(Menu[] arrayAllMenu)
    {
        System.out.println("・全てのメニュー");

        for(Menu menu : arrayAllMenu)
        {
            for(String key : menu.menuMap.keySet())
            {
                System.out.println(key + ":" + menu.menuMap.get(key) + "円");
            }
        }
    }


    public void getMainMenu(MainMenu[] arrayMainMenu)
    {
        System.out.println("・メインメニュー");

        for(Menu mainMenu : arrayMainMenu)
        {
            for(String key : mainMenu.menuMap.keySet())
            {
                System.out.println(key + ":" + mainMenu.menuMap.get(key) + "円");
            }
        }

        System.out.println("※メインメニューはS、M、Lからサイズを選んでください");
    }


    public void getSideMenu(SideMenu[] arraySideMenu)
    {
        System.out.println("・サイドメニュー");

        for(Menu sideMenu : arraySideMenu)
        {
            for(String key : sideMenu.menuMap.keySet())
            {
                System.out.println(key + ":" + sideMenu.menuMap.get(key) + "円");
            }
        }
    }


    public void selectMainMenu()
    {
        System.out.println("メインメニューを選んでください");
        Scanner sc = new Scanner(System.in);
        basket.add(sc.next());

        System.out.println("サイズをS、M、Lの中から選んでください");
        switch(sc.next())
        {
            case "S":
            sizeCountS++;
            break;

            case "M":
            sizeCountM++;
            break;

            case "L":
            sizeCountL++;
            break;
        }
    }

    public void selectSideMenu()
    {
        System.out.println("サイドメニューを選んでください");
        Scanner sc = new Scanner(System.in);
        basket.add(sc.next());
    }


    public int calcTotal(Menu arrayAllMenu)
    {
        int total = 0;

        for(String menu : basket)
        {
            total += arrayAllMenu.menuMap.get(menu);
        }

        total += (sizeCountS * PRICE_S) + (sizeCountM * PRICE_M) + (sizeCountL * PRICE_L);

        return total;
    }

    public int pay(int total, int payment)
    {
        int change = payment - total;

        return change;
    }
}
