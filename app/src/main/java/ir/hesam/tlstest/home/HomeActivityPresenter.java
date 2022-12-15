package ir.hesam.tlstest.home;

import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

import ir.hesam.tlstest.module.HomeItem;

public class HomeActivityPresenter {

    public static HomeActivityPresenter homeActivityPresenter;

    public static HomeActivityPresenter getInstance() {

        if (homeActivityPresenter == null){
            homeActivityPresenter = new HomeActivityPresenter();
        }
        return homeActivityPresenter;
    }

    public void getAddItem(HomeActivity activity) {
        ArrayList<HomeItem> items =new ArrayList<>();

        items.add(new HomeItem());
        items.add(new HomeItem());
        items.add(new HomeItem());
        items.add(new HomeItem());
        items.add(new HomeItem());
        items.add(new HomeItem());
        activity.recyclerView.setLayoutManager(new LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false));
        activity.recyclerView.setAdapter(activity.adapter);
        activity.adapter.versionModels.accept(items);

    }
}
