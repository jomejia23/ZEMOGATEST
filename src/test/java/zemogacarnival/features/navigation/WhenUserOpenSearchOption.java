package zemogacarnival.features.navigation;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import zemogacarnival.model.Category;
import zemogacarnival.steps.NavigatingUser;


@RunWith(SerenityRunner.class)
public class WhenUserOpenSearchOption {

    @Steps
    NavigatingUser user;

    @Managed
    WebDriver browser;

    @Test
    public void ShouldBeableToCruisesCategory(){
        //Given
        user.isOnTheHomePage();

        //When
        user.navigatesToCategoryAndSearch();
        user.selectSailFrom();
        user.dates();

        //Then
        user.shouldSeeTheResouldbyAllCruises("Bahamas");
    }

    @Test
    public void ShouldbeAbleToFilterByPrice(){
        //Given
       // user.isOnTheHomePage();
        //When
       // user.seeAndFilterByPrice();
        //Then
       // user.shouldAbleSeeTheGridByPrice();
        //.
        //.
        //.
        //.
        //.
    }

    @Test
    public void  ShouldAbleToSortByPriceAndSeesDefaultValueWillBeCheapestFirst(){
        //Given
       //  user.isOnTheHomePage();
        //When

        //Then
        //.
        //.
        //.
        //.
        //.
    }

}
