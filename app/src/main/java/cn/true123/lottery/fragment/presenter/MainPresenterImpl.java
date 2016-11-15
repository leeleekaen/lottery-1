package cn.true123.lottery.fragment.presenter;

import java.util.List;

import cn.true123.lottery.fragment.view.BaseView;
import cn.true123.lottery.fragment.view.MainView;
import cn.true123.lottery.model.Lottery;
import cn.true123.lottery.retrofit.LotteryServiceManager;
import rx.Subscriber;

/**
 * Created by junbo on 1/11/2016.
 */

public class MainPresenterImpl extends BasePresenterImpl<MainView> implements MainPresenter<MainView> {

    @Override
    public void refresh() {
        fetchData();
    }

    @Override
    public void start() {
        fetchData();
    }
    private void fetchData(){
        view.showProgress();
        LotteryServiceManager.getInstance().getLastData360(new Subscriber<List<Lottery.IEntity>>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                view.dismissProgress();
            }

            @Override
            public void onNext(List<Lottery.IEntity> list) {
                view.dismissProgress();
                view.update(list);
            }
        });
    }
}
