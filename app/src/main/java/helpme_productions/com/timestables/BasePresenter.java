package helpme_productions.com.timestables;


public interface BasePresenter<V extends BaseView> {
    void addView(V view);
    void removeView();
}
