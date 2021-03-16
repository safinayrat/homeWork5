package com.safin.steps;

import com.safin.pages.ProductsPage;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;

public class ProductsPageDef {
  ProductsPage productsPage = new ProductsPage();

  @Тогда("активирован чекбокс только с доставкой")
  public void активированЧекбоксТолькоСДоставкой() {
    productsPage.selectDeliveryFilter();
    productsPage.clickSubmitButton();
  }

  @И("в выпадающем списке сортировка выбрано значение (.*)$")
  public void вВыпадающемСпискеСортировкаВыбраноЗначениеДороже(String arg0) {
    productsPage.sortProductsInOrder(arg0);
  }

  @И("в консоль выведено значение названия и цены {int} первых товаров")
  public void вКонсольВыведеноЗначениеНазванияИЦеныПервыхТоваров(int arg0) {
    productsPage.outputTheNamesOfThreeProducts(arg0);
  }
}
