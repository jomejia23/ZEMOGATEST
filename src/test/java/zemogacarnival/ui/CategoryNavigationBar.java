package zemogacarnival.ui;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import zemogacarnival.model.Category;

public class CategoryNavigationBar extends PageObject {

    public void selectSail(Category plan) {
        $(".cdc-filters-header *[role=button]").click();
        $(".cdc-filter-cols-wrapper").findBy(By.name("The Bahamas")).click();//
    }
}
