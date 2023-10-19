import java.math.BigDecimal;
class Main {
    public static void main(String[] args) {
        //Lab2, Task5
        double netVal =9.99;
        double VAT=0.23;
        double grossVal=netVal*(1+VAT);
        int productsAmount=10_000;
        double totalValueExcludingVAT=netVal*productsAmount;
        System.out.println("Net value of products: "+netVal);
        System.out.println("Gross value (including VAT): "+grossVal);
        System.out.println("Products Quantity: "+productsAmount);
        System.out.println("Total value excluding VAT is: "+totalValueExcludingVAT);
        //Using BigDecimal class
        System.out.println();
        System.out.println("After using Big decimal: ");

        BigDecimal netPrice=new BigDecimal("9.99");
        BigDecimal vatRate=new BigDecimal("0.23");
        BigDecimal pdQuantity=new BigDecimal(10000);
        BigDecimal gValue=netPrice.multiply(BigDecimal.ONE.add(vatRate));
        BigDecimal valueExcludingVAT=netPrice.multiply(pdQuantity);

//Display results
        System.out.println("Net value of products: "+netPrice);
        System.out.println("Gross value of products: "+gValue);
        System.out.println("Products Quantity: "+pdQuantity);
        System.out.println("Total value excluding VAT is: "+valueExcludingVAT);

    }
}