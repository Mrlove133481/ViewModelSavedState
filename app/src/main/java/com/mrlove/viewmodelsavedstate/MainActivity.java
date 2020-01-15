package com.mrlove.viewmodelsavedstate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.mrlove.viewmodelsavedstate.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public final static String KEY_NUMBER = "my_number";
    MyViewModel viewModel;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MyViewModel.class);
        binding.setData(viewModel);
        binding.setLifecycleOwner(this);
    }
}
