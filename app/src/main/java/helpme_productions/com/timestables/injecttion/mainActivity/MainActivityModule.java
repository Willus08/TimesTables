package helpme_productions.com.timestables.injecttion.mainActivity;

import dagger.Module;
import dagger.Provides;
import helpme_productions.com.timestables.view.activities.mainActivity.MainActivityPresenter;

@Module
public class MainActivityModule {
    @Provides
    public MainActivityPresenter mainActivityPresenterProvider(){
        return new MainActivityPresenter();
    }
}
