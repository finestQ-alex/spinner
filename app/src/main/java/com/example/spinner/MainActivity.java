package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

  Spinner spinner;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    spinner = (Spinner) findViewById(R.id.spinner);

    String[] movie = {"범죄와의 전쟁", "신세계", "달콤한 인생", "영웅본색", "베테랑", "악의 연대기",
      "친구", "국가대표", "추격자", "살인의 추억", "죽은 시인의 사회","범죄도시"};

    ArrayAdapter<String> adapter;
    adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, movie);
    spinner.setAdapter(adapter);
  }
}