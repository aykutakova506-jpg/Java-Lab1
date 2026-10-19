package game.inventory;

public class Inventory {

    private Item[] items;
    private int count;

    public Inventory() {
        items = new Item[10];
        count = 0;
    }

    // dizi doluysa ekleme yapılmaz
    public void addItem(Item item) {
        if (count < items.length) {
            items[count] = item;
            count++;
        }
    }

    public void displayAll() {
        System.out.println("--- Inventory Listing ---");
        for (int i = 0; i < count; i++) {