package helpme_productions.com.timestables.injecttion.mainActivity;


import dagger.Component;
import helpme_productions.com.timestables.view.activities.mainActivity.MainActivity;

@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}
