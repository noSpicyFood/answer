public class FruitStore {  
    private static final int APPLE_PRICE_PER_JIN = 8;  
    private static final int STRAWBERRY_PRICE_PER_JIN = 13;  
    private static final int MANGO_PRICE_PER_JIN = 20;  
    private static final double STRAWBERRY_DISCOUNT = 0.8; // 8折  
    private static final int DISCOUNT_THRESHOLD = 100;  
    private static final int DISCOUNT_AMOUNT = 10;  
  
    // 计算顾客A购买苹果和草莓的总价  
    public static int calculateTotalPriceForCustomerA(int applesJin, int strawberriesJin) {  
        return applesJin * APPLE_PRICE_PER_JIN + strawberriesJin * STRAWBERRY_PRICE_PER_JIN;  
    }  
  
    // 计算顾客B购买苹果、草莓和芒果的总价  
    public static int calculateTotalPriceForCustomerB(int applesJin, int strawberriesJin, int mangoesJin) {  
        return applesJin * APPLE_PRICE_PER_JIN + strawberriesJin * STRAWBERRY_PRICE_PER_JIN + mangoesJin * MANGO_PRICE_PER_JIN;  
    }  
  
    // 计算顾客C购买苹果、草莓和芒果的总价（草莓限时打8折）  
    public static int calculateTotalPriceForCustomerC(int applesJin, int strawberriesJin, int mangoesJin) {  
        int discountedStrawberriesPrice = (int) (strawberriesJin * STRAWBERRY_PRICE_PER_JIN * STRAWBERRY_DISCOUNT);  
        return applesJin * APPLE_PRICE_PER_JIN + discountedStrawberriesPrice + mangoesJin * MANGO_PRICE_PER_JIN;  
    }  
  
    // 计算顾客D购买苹果、草莓和芒果的总价（购物满100减10块）  
    public static int calculateTotalPriceForCustomerD(int applesJin, int strawberriesJin, int mangoesJin) {  
        int totalPrice = calculateTotalPriceForCustomerC(applesJin, strawberriesJin, mangoesJin);  
        if (totalPrice >= DISCOUNT_THRESHOLD) {  
            totalPrice -= DISCOUNT_AMOUNT;  
        }  
        return totalPrice;  
    }  
   
    public static void main(String[] args) {  
        // 顾客A 5斤苹果和3斤草莓  
        int totalPriceA = calculateTotalPriceForCustomerA(5, 3);  
        System.out.println("Customer A total price: " + totalPriceA + " yuan");  
  
        // 顾客B 2斤苹果、4斤草莓和1斤芒果  
        int totalPriceB = calculateTotalPriceForCustomerB(2, 4, 1);  
        System.out.println("Customer B total price: " + totalPriceB + " yuan");  
  
        // 顾客C 3斤苹果、2斤草莓（打8折）和1斤芒果  
        int totalPriceC = calculateTotalPriceForCustomerC(3, 2, 1);  
        System.out.println("Customer C total price: " + totalPriceC + " yuan");  
  
        // 顾客D 4斤苹果、3斤草莓（打8折）和2斤芒果，总价超过100元，享受10元优惠  
        int totalPriceD = calculateTotalPriceForCustomerD(4, 3, 2);  
        System.out.println("Customer D total price: " + totalPriceD + " yuan");  
    }  
}