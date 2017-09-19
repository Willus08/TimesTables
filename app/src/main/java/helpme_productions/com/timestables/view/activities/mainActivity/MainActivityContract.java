package helpme_productions.com.timestables.view.activities.mainActivity;


import java.util.List;

import helpme_productions.com.timestables.BasePresenter;
import helpme_productions.com.timestables.BaseView;
import helpme_productions.com.timestables.model.Multiples;

interface MainActivityContract {
    interface View extends BaseView{
        void setupAdapter(List<Multiples> multiplesList);
    }
    interface Presenter extends BasePresenter<View>{
        void fillList(int seekPosition) ;
    }
}
