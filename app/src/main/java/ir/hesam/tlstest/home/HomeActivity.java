package ir.hesam.tlstest.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

import ir.hesam.tlstest.R;
import ir.hesam.tlstest.module.HomeItem;

public class HomeActivity extends AppCompatActivity {

    HomeAdapter adapter;
    RecyclerView recyclerView;
    ArrayList<HomeItem> items;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.recycler);

        adapter = new HomeAdapter(this);
        items = new ArrayList<>();







        HomeActivityPresenter.getInstance().getAddItem(this);


    }
}