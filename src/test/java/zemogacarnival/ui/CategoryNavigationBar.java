package zemogacarnival.ui;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import zemogacarnival.model.Category;

public class CategoryNavigationBar extends PageObject {

    public void selectSail() {
        $(".cdc-filters-header *[role=button]").click();
        $(".cdc-filter-cols-wrapper *[aria-label='The Bahamas ']").click();
    }

    public void selectFrom() {
        $(".cdc-filters-tab #cdc-ports").click();
        $(".cdc-filter-5-cols-layout *[aria-label='Charleston, SC ']").click();
    }

    public void date() {
        $("#cdc-dates").click();
        $(".ddc-paged-year__month *[aria-label='February 2020 ']").click();
    }
}
