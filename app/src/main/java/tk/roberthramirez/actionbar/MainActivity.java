package tk.roberthramirez.actionbar;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bBoton;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        bBoton = findViewById(R.id.bBoton);

        /*if(getSupportActionBar().isShowing()){
            bBoton.setText("Ocultar");
        }else {
            bBoton.setText("Mostrar");
        }*/
        bBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getSupportActionBar().isShowing()){
                    bBoton.setText("Mostrar");
                    getSupportActionBar().hide();
                }else{
                    bBoton.setText("Ocultar");
                    getSupportActionBar().show();
                }
            }
        });
    }

    //@Override
    /*public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_activity, menu);
        return true;
    }*/
}
