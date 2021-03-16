package com.safin.steps;

import com.safin.pages.LocationChoosePage;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;

public class LocationChoosePageDef {
  LocationChoosePage locationChoosePage = new LocationChoosePage();

  @Тогда("в поле регион введено значение (.*)$")
  public void вПолеРегионВведеноЗначение(String location) {
    locationChoosePage.selectLocation(location);
  }

  @И("нажата кнопка показать объявления")
  public void нажатаКнопкаПоказатьОбъявления() {
    locationChoosePage.clickLocationButtonSave();
  }
}
