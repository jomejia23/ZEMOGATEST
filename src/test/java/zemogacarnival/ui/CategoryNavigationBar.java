package zemogacarnival.ui;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import zemogacarnival.model.Category;

public class CategoryNavigationBar extends PageObject {

    @FindBy(id = ".cdc-filter-body .cdc-filter-button") private WebElementFacade mount;


    public void selectSail() {
        $(".cdc-filters-header *[role=button]").click();
        $(".cdc-filter-cols-wrapper *[aria-label='The Bahamas ']").click();
    }

    public void setFrom() {
        $(".cdc-filters-tab #cdc-ports").click();
        $("//button[contains(@class, 'cdc-filter-button') and contains(text(), 'Baltimore, MD')]").click();

    }

    public void setDate() {
        $("#cdc-dates").click();
        $(".ddc-paged-year__month *[aria-label='February 2020 ']").click();
    }

    public void setDuration() {
        $("#cdc-durations").click();
        $("//button[contains(@class, 'cdc-filter-button') and contains(text(), '6 - 9 Days')]").click();
     }
}
