package cn.true123.lottery.fragment.view;

import java.util.List;

import cn.true123.lottery.model.News;

/**
 * Created by junbo on 14/11/2016.
 */

public interface NewsView<T extends News> extends BaseView {
    public void update(List<T> list, boolean isAdd);
}
