public class SideMenu extends Menu
{
    /**
     * サイドメニューのコンストラクタ
     *
     * @param name
     * @param price
     */
    public SideMenu(String name, int price)
    {
        menuMap.put(name, price);
    }
}
