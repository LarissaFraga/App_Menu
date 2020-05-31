package com.example.codigomenuaula08;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtMensagem;
    private View sview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        txtMensagem = findViewById(R.id.txtMensagem);
        sview = findViewById(R.id.sview);
        toolbar.setTitle("Menu e SnackBar");
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(view, "Replace", Snackbar.LENGTH_LONG);
                snackbar.setActionTextColor(getResources().getColor(R.color.corBranco));
                snackbar.setAction("TOCAR", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Media Player
                        }
                    }).show();
                }
            });
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case R.id.op_tamanho:
                txtMensagem.setTextSize(24);
                return true;
            case R.id.op_corTela:
                sview.setBackgroundColor(getResources().getColor(R.color.corTela));
                return true;
            case R.id.op_corTexto:
                txtMensagem.setTextColor(getResources().getColor(R.color.corTexto));
                return true;
            case R.id.op_abrir:
                Intent it = new Intent(MainActivity.this, Activity2.class);
                it.putExtra("ch_txt", txtMensagem.getText().toString());
                startActivity(it);
                return true;
            case R.id.op_sair:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
