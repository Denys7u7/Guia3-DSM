package sv.edu.udb.dsm.g03.ejemplo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class ejemplo_table_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_table_layout);
    }
    public void finalizarActividad(View v){
        finish();
    }
}