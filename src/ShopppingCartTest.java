class ShoppingCartTest
{
    public static void main(String[] args)
    {
        // creates new items with product name, quantity and unit price
        Item i1 = new Item("Acer laptop",2 , 50000.0);
        Item i2 = new Item("HP laptop", 3, 70000.0);
        Item i3 = new Item("USB", 10, 750.0);
        Item i4 = new Item("Adapator", 10, 100.0);
        Item i5 = new Item("pendrive", 20, 1000.0);

        ShoppingCart cart = new ShoppingCart();

        // add the item to the cart
        cart.addToCart(i1);
        cart.addToCart(i2);
        cart.addToCart(i3);
        cart.addToCart(i4);
        cart.addToCart(i5);

        /*
         * shows the list of items in the cart with quantity
         * Expected Output to the console:
         * Acer laptop:2
         * HP latop:3
         * USB:10
         * Adapator:10
         * pendrive:20
         */
        System.out.println("--------------------------------------------");
        System.out.println("SHOPPED ITEM");
        System.out.println("--------------------------------------------");
        cart.showCart();
        System.out.println("--------------------------------------------");

        System.out.println("Removed item");
        cart.removeFromCart(i3);
        System.out.println("----------------------------------------------");

        /*
         * shows the list of items in the cart with quantity
         * Expected Output to the console:
         * Acer laptop:3
         * HP latop:2
         * Adapator:10
         * pendrive:20
         */
        cart.showCart();

        System.out.println("-------------------------------------");
        //gets the total amount for the items in the cart

        double totalAmount = cart.getTotalAmount();
        System.out.println("TOTAL AMOUNT:"+totalAmount);

        // Gets the payable amount

        double payableAmount = cart.getPayableAmount();
        System.out.println("PAYABLE AMOUNT:"+payableAmount);
        System.out.println("--------------------------------------");
        // apply a coupon code
        cart.applyCoupon("BABU");

        /*
         * print the items with the quanity, unit price, total amount
         * apply coupon if valid
         * add tax to the total amount after discount
         * Expected Output to the console:
         * Acer laptop	2	50000.0	100000.0
         * HP laptop	3	70000.0	210000.0
         * Adapator	   10	100.0	1000.0
         * pendrive	   20	1000.0	20000.0
                        Total    : 331000.0
                        Discount : 33100.0
                        Tax      : 44685.0
                        Total    : 342585.0
         */
        cart.printInvoice();
        System.out.println("----------------------------------------");
        cart.applyCoupon("BABU");

        /*
         * print the items with the quanity, unit price, total amount
         * apply coupon if valid
         * add tax to the total amount after discount
         * Expected Output to the console:
         * Acer laptop	2	50000.0	100000.0
         * HP laptop	3	70000.0	210000.0
         * Adapator	   10	100.0	1000.0
         * pendrive	   20	1000.0	20000.0
                     Total    : 331000.0
                     Discount : 33100.0
                     Tax      : 44685.0
                     Total    : 342585.0
         */
        cart.printInvoice();
        System.out.println("-------------------------------------");
        System.out.println("ADD ITEMS");
        System.out.println("-------------------------------------");
        cart.addToCart(new Item("Mi note 9", 50, 30000.00));
        /*
         * print the items with the quanity, unit price, total amount
         * apply coupon if valid
         * add tax to the total amount after discount
         * Expected Output to the console:
         * Acer laptop	2	50000.0	100000.0
         * HP laptop	3	70000.0	210000.0
         * Adapator	10	100.0	1000.0
         * pendrive	20	1000.0	20000.0
         * Mi note 9	50	30000.0	1500000.0
			                    Total    : 1831000.0
			                    Discount : 183100.0
			                    Tax      : 247185.0
			                    Total    : 1895085.0
         */
        cart.printInvoice();
    }
}