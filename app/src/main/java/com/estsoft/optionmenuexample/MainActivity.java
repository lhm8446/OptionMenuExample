package com.estsoft.optionmenuexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // context menu를 위한 초기화
        registerForContextMenu( findViewById( android.R.id.content ));

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_context,menu);
//        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        String title = item.getTitle().toString();

        switch (id){
            case R.id.menu_refresh : {
                Toast.makeText(this, title+"selected", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.menu_search: {
                Toast.makeText(this, title+"selected", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.menu_copy: {
                Toast.makeText(this, title+"selected", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.menu_cut: {
                Toast.makeText(this, title+"selected", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.menu_paste: {
                Toast.makeText(this, title+"selected", Toast.LENGTH_LONG).show();
                break;
            }
            default:
        }
        return super.onOptionsItemSelected(item);
    }
}
