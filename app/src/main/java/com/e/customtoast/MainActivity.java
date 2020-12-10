package com.e.customtoast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button) findViewById(R.id.showLayoutToast);
        button2=(Button) findViewById(R.id.showCustomToastLib);
        button3=(Button) findViewById(R.id.showCustomToastLib1);
        button4=(Button) findViewById(R.id.showCustomToastLib2);
        button5=(Button) findViewById(R.id.showCustomToastLib3);
        button6=(Button) findViewById(R.id.showCustomToastLib4);


    }

    public void showToast(View view) {
            int id =view.getId();
            // using method 1
            if(id==R.id.showLayoutToast) {
                View view1 = LayoutInflater.from(getApplicationContext()).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.layout));
                Toast toast = new Toast(getApplicationContext());
                toast.setView(view1);
             //   toast.setGravity(Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }

            // using method 2 external library (Toasty)
        if(id==R.id.showCustomToastLib){
            Toasty.success(getApplicationContext(),"This is success toast",Toast.LENGTH_LONG).show();

        }
        if(id==R.id.showCustomToastLib1){
            Toasty.error(getApplicationContext(),"This is error toast",Toast.LENGTH_LONG).show();
        }
        if(id==R.id.showCustomToastLib2){
            Toasty.info(getApplicationContext(),"This is info toast",Toast.LENGTH_LONG).show();
        }
        if(id==R.id.showCustomToastLib3){
            Toasty.warning(getApplicationContext(),"This is warning toast",Toast.LENGTH_LONG).show();
        }
        if(id==R.id.showCustomToastLib4){
            Toasty.normal(getApplicationContext(),"This is custom toast",Toast.LENGTH_LONG, ContextCompat.getDrawable(this,R.drawable.ic_baseline_check_circle_outline_24)).show();
        }
    }
}