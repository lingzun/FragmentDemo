package com.my.myapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button aBtn,bBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        aBtn= (Button) findViewById(R.id.add_fragement_a);
        bBtn= (Button) findViewById(R.id.add_fragement_b);
        aBtn.setOnClickListener(this);
        bBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        switch (view.getId()){
            case R.id.add_fragement_a:
                transaction.replace(R.id.fragment_container,new AFragment());
                break;
            case R.id.add_fragement_b:
                transaction.replace(R.id.fragment_container,new BFragment());
                break;
        }
        transaction.commit();
    }
}
