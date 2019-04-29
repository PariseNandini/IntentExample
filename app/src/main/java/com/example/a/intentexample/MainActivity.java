package com.example.a.intentexample;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void takemetonext(View view) {
        Intent i=new Intent(this,SecondActivity.class);
        startActivity(i);
    }
    public void openBrowser(View view)
    {
        EditText et;
        et=findViewById(R.id.edit_text);
        String url_text=et.getText().toString();
        Intent in=new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+url_text));
        startActivity(in);

    }

    public void  openDailer(View view)
    {
        EditText et;
        et=findViewById(R.id.num_edit);
        String num=et.getText().toString();
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"+num));
        startActivity(intent);


    }
}
