import java.util.Scanner;

abstract class Restaurant
{
    abstract void Main_Menu();
//    abstract void Generate_Bill();
//    abstract void Your_Order();
//    abstract void Show_Menu();
//    abstract void About_Me();
}

class Zomato extends Restaurant
{
    int bitem, pitem, aitem, Total_Items, Amount_Per_Item;
    float Total_Price;
    int citem,cmagi;
    Scanner s = new Scanner(System.in);

    void Sleep() {
        System.out.println("\n\tPress Any Character To Continue !!!");
        s.next();
    }
void About()
{
   System.out.println("\n<---  MY INTRODUCTION  --->\n");
   System.out.println("\nHi Folks, I'm Abhinit From Siwan ( Bihar ). Currently I am Pursuing Btech In Computer Science And Engineering\n");
   System.out.println("From Lovely Professional University Jalandhar ( Phagwara, Punjab ) And recently I done a Machine Learning Bassed\n");
   System.out.println("Project Which will help the peaples to identify their Faces As well as Emotions");

}
    void Main_Menu()
    {
        System.out.println("\n\n\t\t\t\t***** Main__Menu *****");
        System.out.println("\n1. Show Menu\n2. Your Order\n3. Generate Bill\n4. About us\n5. EXIT\n");
        System.out.println("\tSelect Your Option.......\t");
        int a = s.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("\nWhich all Items You Want To See:    \n\n1. Veg.\n2. Non Veg.\n3. Back_TO_Main_Menu.\n4. EXIT\n");
                int b= s.nextInt();
                switch (b)
                {
                    case 1:
                        System.out.println("\n1. Veg Burger\n2. Veg Pizza\n3. Aloo Prantha\n4. Main_Menu\n5. EXIT\n");
                        int c= s.nextInt();
                        switch (c)
                        {
                            case 1:
                                System.out.println("\nHow many Veg Burger You Want ? ( Price = 150rs/piece )\n");
                                try {
                                    bitem = s.nextInt();
                                    if (bitem<=0)
                                        throw new ArithmeticException("Item Should not be zero");
                                }
                                catch (Exception e){System.out.println("Exception Raise as "+e);}

                                    System.out.println("\n Congratulations !!! Your Order have been sent\n");
                                    Main_Menu();




                                break;
                            case 2:
                                System.out.println("\nHow many Veg Pizza You Want ? ( Price = 199rs/piece )\n");
                                try {
                                    pitem = s.nextInt();
                                    if (pitem<=0)
                                        throw new ArithmeticException("Item Should not be zero");

                                }
                                catch (Exception e){System.out.println("Exception Raise as "+e);}

                                System.out.println("\n Congratulations !!! Your Order have been sent\n");
                                Main_Menu();
                                break;
                            case 3:
                                System.out.println("\nHow many Aloo Prantha You Want ? ( Price = 50rs/piece )\n");
                                try {
                                    aitem = s.nextInt();
                                    if (aitem<=0)
                                        throw new ArithmeticException("Item Should not be zero");


                                }
                                catch (Exception e){System.out.println("Exception Raise as "+e);}

                                System.out.println("\n Congratulations !!! Your Order have been sent\n");
                                Main_Menu();
                                break;
                            case 4:
                                System.exit(0);
                            default:
                                System.out.println("\n !!!  Wrong Input , So Please Try Again !!!\n");
                                Sleep();
                                Main_Menu();
                        }
                        break;
                    case 2:
                        System.out.println("\n1. Chicken Popcorn\n2. Chicken Maggi\n3. Main Menu\n4. EXIT\n");
                        int f=s.nextInt();
                        switch (f)
                        {
                            case 1:
                                System.out.println("\nHow many Chicken Popcorn You Want ? ( Price = 160rs/piece )");
                                try {
                                    citem = s.nextInt();
                                    if (citem<=0)
                                        throw new ArithmeticException("Item Should not be zero");



                                }
                                catch (Exception e){System.out.println("Exception Raise as "+e);}

                                System.out.println("\n Congratulations !!! Your Order have been sent\n");
                                Main_Menu();
                                break;
                            case 2:
                                System.out.println("\nHow many Chicken Maggi You Want ? ( Price = 120rs/plate )");

                                try {
                                    cmagi = s.nextInt();
                                    if (cmagi<=0)
                                        throw new ArithmeticException("Item Should not be zero");


                                }
                                catch (Exception e){System.out.println("Exception Raise as "+e);}

                                System.out.println("\n Congratulations !!! Your Order have been sent\n");
                                Main_Menu();
                                break;
                            case 3:
                                Main_Menu();
                            case 4:
                                System.exit(0);
                            default:
                                System.out.println("\n !!!  Wrong Input , So Please Try Again !!!\n");
                                Sleep();
                                Main_Menu();

                        }
                        break;
                    case 3:
                        Main_Menu();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("\n !!!  Wrong Input , So Please Try Again !!!\n");
                        Sleep();
                        Main_Menu();

                }
                break;
            case 2:
                System.out.println("\n**********************************************************************************************************************\n");
                System.out.println("\tYOU ORDER HISTORY\n");
                System.out.println("Veg Burger = "+bitem);
                System.out.println("Veg Pizza = "+pitem);
                System.out.println("Aloo Prantha = "+aitem);
                System.out.println("Chicken Popcorn = "+citem);
                System.out.println("Chicken Magi = "+cmagi);

                System.out.println("\n**********************************************************************************************************************\n");
                Sleep();
                Main_Menu();



                break;
            case 3:
                System.out.println("\nYour Total Amount for Veg Burger = "+(150*bitem));
                System.out.println("\nYour Total Amount for Veg Pizza = "+(199*pitem));
                System.out.println("\nYour Total Amount for Aloo Prantha = "+(50*aitem));
                System.out.println("\nYour Total Amount for Chicken Popcorn = "+(160*citem));
                System.out.println("\nYour Total Amount for Chicken Maggi = "+(120*cmagi));
                System.out.println("\n**********************************************************************************************************************\n");
                System.out.println("\t<----- Your Reciepts ---->");
                System.out.println("Total Items = "+ (bitem+pitem+aitem+cmagi+citem));
                System.out.println("\nTotal Amount = "+((150*bitem)+(199*pitem)+(50*aitem)+(160*citem)+(120*cmagi)));
                System.out.println("\n**********************************************************************************************************************\n");



                Sleep();
                Main_Menu();


                break;
            case 4:
                About();


                Main_Menu();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("\n !!!  Wrong Input , So Please Try Again !!!\n");
                Sleep();
                Main_Menu();

        }
    }


}








public class Restaurant_Management_System
{
public static void main(String[] args)
{
Restaurant s=new Zomato();
s.Main_Menu();
//   4

}
}
