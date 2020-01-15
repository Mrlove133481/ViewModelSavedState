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
        viewModel = new ViewModelProvider(this).get(MyViewModel.class);//新的方式获取ViewModel实例
        binding.setData(viewModel);//给前台data绑定数据
        binding.setLifecycleOwner(this);//观察者
    }
}
