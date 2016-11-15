package cn.true123.lottery.activities;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import butterknife.BindView;
import cn.true123.lottery.R;
import cn.true123.lottery.activities.BaseActivity;
import cn.true123.lottery.fragment.NavFragment;
import cn.true123.lottery.listener.OnTagChangedListener;

public class MainActivity extends BaseActivity implements OnTagChangedListener {
    //    @BindView(R.id.viewPager)
//    ViewPager viewPager;
//    @BindView(R.id.tabLayout)
//    TabLayout tabLayout;
//    MainAdapter adapter;
//    List<BaseFragment> fragmentList;
    @BindView(R.id.content)
    FrameLayout frameLayout;

    NavFragment fragment;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initIntent() {

    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void iniView() {
        fragment = (NavFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        fragment.setOnTagChangedListener(this);
        fragment.setUp(this, getSupportFragmentManager(), R.id.content);

//        MainFragment t1 = MainFragment.getInstance();
//        HistoryFragment t2 = HistoryFragment.getInstance();
//        MainFragment t3 = MainFragment.getInstance();
//        MainFragment t4 = MainFragment.getInstance();
//
//        fragmentList = new ArrayList<>();
//        fragmentList.add(t1);
//        fragmentList.add(t2);
//        fragmentList.add(t3);
//        fragmentList.add(t4);
//        adapter = new MainAdapter(getSupportFragmentManager(), fragmentList, this);
//        viewPager.setOffscreenPageLimit(4);
//        viewPager.setAdapter(adapter);
//
//        tabLayout.setSelectedTabIndicatorHeight(0);
//        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void setTitle(String title) {
        toolbar.setTitle(title);
    }


}
