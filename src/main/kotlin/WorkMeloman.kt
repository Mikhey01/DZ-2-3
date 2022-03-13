fun main() {
    val itemPrice = 100                  // цена товара
    val itemCount = 1000                // количество товара
    val costGoods = itemCount * itemPrice    // общая стоимость товара
    val meloman = true
    val discount = 100                  // стандартная скидка
    val discoutStart = 1_001
    val discountAddStart = 10_001
    val additionalDiscount = costGoods / 100 * 5    // скидка 5%
    val additionalDiscountMeloman = (costGoods - additionalDiscount)/100  // дополнительная скидка 1%

    val amountPurchase  =  if (costGoods in discoutStart until discountAddStart) costGoods - discount
    else if (costGoods >= discountAddStart) costGoods - additionalDiscount
    else if (costGoods >= discountAddStart && meloman) costGoods - additionalDiscount - additionalDiscountMeloman
    else  costGoods


println("Стоимость товара составляет:  $amountPurchase ")
}