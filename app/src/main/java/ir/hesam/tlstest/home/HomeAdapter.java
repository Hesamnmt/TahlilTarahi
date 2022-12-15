package ir.hesam.tlstest.home;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.jakewharton.rxrelay2.BehaviorRelay;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import ir.hesam.tlstest.R;
import ir.hesam.tlstest.module.HomeItem;

public class HomeAdapter  extends  RecyclerView.Adapter<HomeAdapter.VersionViewHolder> {

    Context context;

    public HomeAdapter(Context context ) {
        this.context = context;

    }

    public BehaviorRelay<ArrayList<HomeItem>> versionModels = BehaviorRelay.createDefault(new ArrayList<>());

    {
        versionModels.observeOn(AndroidSchedulers.mainThread()).
                subscribe(new Observer<ArrayList<HomeItem>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ArrayList<HomeItem> homeItems) {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }



    @Override
    public VersionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_base, parent, false);
        HomeAdapter.VersionViewHolder viewHolder = new HomeAdapter.VersionViewHolder(view);

        return viewHolder;
    }



    @RequiresApi(api = Build.VERSION_CODES.O)
    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(final VersionViewHolder holder, final int position) {
        //position -> current item





    }


    @Override
    public int getItemCount() {
        return versionModels.getValue() == null ? 0 : versionModels.getValue().size();
    }

    public class VersionViewHolder extends RecyclerView.ViewHolder {


        public VersionViewHolder(View itemView) {
            super(itemView);

        }
    }


}
