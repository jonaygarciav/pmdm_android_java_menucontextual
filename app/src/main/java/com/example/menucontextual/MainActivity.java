package com.example.menucontextual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSaludo = findViewById(R.id.tv_saludo);
        registerForContextMenu(tvSaludo);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        String mensaje;
        Toast aviso;

        switch (item.getItemId()) {
            case R.id.MenuOpc1:

                mensaje = "Opcion 1 pulsada!";
                aviso = Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_SHORT);
                aviso.show();

                return true;

            case R.id.MenuOpc2:

                mensaje = "Opcion 2 pulsada!";
                aviso = Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_SHORT);
                aviso.show();

                return true;

            case R.id.MenuOpc3:

                mensaje = "Opcion 3 pulsada!";
                aviso = Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_SHORT);
                aviso.show();

                return true;

            default:
                return super.onContextItemSelected(item);
        }
    }

}
