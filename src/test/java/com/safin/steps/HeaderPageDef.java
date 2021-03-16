package com.safin.steps;

import com.safin.pages.HeaderPage;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;

public class HeaderPageDef {
  HeaderPage headerPage = new HeaderPage();

  @И("в выпадающем списке категорий выбрана оргтехника")
  public void вВыпадающемСпискеКатегорийВыбранаОргтехника() {
    headerPage.selectCategory("Оргтехника и расходники");
  }

  @И("в поле поиска введено значение (.*)$")
  public void вПолеПоискаВведеноЗначениеПринтер(String search) {
    headerPage.suggestSearch(search);
  }

  @Тогда("кликнуть по выпадающему списку региона")
  public void кликнутьПоВыпадающемуСпискуРегиона() {
    headerPage.clickSelectLocation();
  }
}
