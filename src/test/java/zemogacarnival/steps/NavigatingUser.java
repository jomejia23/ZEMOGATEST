package zemogacarnival.steps;

import net.thucydides.core.annotations.Step;
import zemogacarnival.model.Category;
import zemogacarnival.ui.CarnivalHomePage;
import zemogacarnival.ui.CategoryNavigationBar;
import zemogacarnival.ui.CurrentPage;
import zemogacarnival.ui.FilterCategoryPrice;

import static org.assertj.core.api.Assertions.assertThat;

public class NavigatingUser {

    CarnivalHomePage carnivalHomePage;
    CurrentPage currentPage;
    CategoryNavigationBar categoryNavigationBar;
    FilterCategoryPrice filterCategoryPrice;

    @Step
    public void isOnTheHomePage() {
        carnivalHomePage.open();
    }

    @Step
    public void shouldSeeTheResouldbyAllCruises(String expectedCruises) {
        assertThat(currentPage.getTitle()).containsIgnoringCase(expectedCruises);
    }

    @Step
    public void navigatesToCategoryAndSearch() {
        categoryNavigationBar.selectSail();
    }

    public void seeAndFilterByPrice() {
        filterCategoryPrice.selectPice();
    }

    public void shouldAbleSeeTheGridByPrice() {
    }

    public void selectSailFrom() {
        categoryNavigationBar.selectFrom();
    }

    public void dates() {
        categoryNavigationBar.date();
    }
}
