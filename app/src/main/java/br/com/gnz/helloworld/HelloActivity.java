package br.com.gnz.helloworld;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
    }

    public void exibir (View v)
    {
        Toast.makeText(this,R.string.hello_world,Toast.LENGTH_LONG).show();
//        AlertDialog.Builder alert = new AlertDialog.Builder(this);
//        alert.setTitle("Hello Fellows!!");
//        alert.setMessage("Primeiro App Android");
//        alert.setPositiveButton("OK",null);
//        alert.show();
    }
}
