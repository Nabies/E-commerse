import java.util.Scanner;

public class productDetailTest
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("PRODUCT ID:");
        String productid=sc.nextLine();
        System.out.println("PRODUCT NAME:");
        String productname=sc.nextLine();
        System.out.println("PRODUCT PRICE:");
        String productprice=sc.nextLine();
        System.out.println("PRODUCT COLOR:");
        String productcolor=sc.nextLine();
        System.out.println("PRODUCT MODEL:");
        String productmodel=sc.nextLine();

        productDetail pd =new productDetail();
        pd.setID(productid);
        pd.setName(productname);
        pd.setPrice(productprice);
        pd.setColor(productcolor);
        pd.setModel(productmodel);

        System.out.println("-------------------");
        System.out.println(pd.getID());
        System.out.println(pd.getName());
        System.out.println(pd.getPrice());
        System.out.println(pd.getColor());
        System.out.println(pd.getModel());
    }
}
