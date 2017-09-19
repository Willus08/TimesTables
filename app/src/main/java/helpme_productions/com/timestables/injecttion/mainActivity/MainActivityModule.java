package helpme_productions.com.timestables.injecttion.mainActivity;

import dagger.Module;
import dagger.Provides;
import helpme_productions.com.timestables.view.activities.mainActivity.MainActivityPresenter;

@Module
class MainActivityModule {
    @Provides
    MainActivityPresenter mainActivityPresenterProvider(){
        return new MainActivityPresenter();
    }
}
