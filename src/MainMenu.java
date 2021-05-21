public class MainMenu extends Menu
{
    /**
     * メインメニュークラスのコンストラクタ
     *
     * @param name 商品名
     * @param price 金額
     */
    public MainMenu(String name, int price)
    {
        menuMap.put(name, price);
    }

}
