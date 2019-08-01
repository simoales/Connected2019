package com.example.connected2019;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.connected2019.databinding.ActivityBookDetailBinding;

public class BookDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBookDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_book_detail);
        Book book= getIntent().getParcelableExtra("Book");
        binding.setBook(book);
    }


}
