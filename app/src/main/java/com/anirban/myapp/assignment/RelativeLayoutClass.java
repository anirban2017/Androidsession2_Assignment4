package com.anirban.myapp.assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class RelativeLayoutClass extends AppCompatActivity implements View.OnClickListener {


    Button bt_display;
    TextView imagedisplay,line1;

    /**
     * Uncomment the codes below and explain
     * different ways of implementing listeners
     * & their scopes.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_example);

         bt_display=(Button)findViewById(R.id.toggleButton);
        imagedisplay=(TextView)findViewById(R.id.txtStatus1);
        line1=(TextView) findViewById(R.id.lineone);
        bt_display.setTag(1);
        bt_display.setText("Hide");
        imagedisplay.setVisibility(View.VISIBLE);
        line1.setVisibility(View.VISIBLE);


        bt_display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        int status=(Integer) v.getTag();
                //hide image and line and change button text to "show"
                if(status==1){
                    bt_display.setText("Show");
                    imagedisplay.setVisibility(View.INVISIBLE);
                    line1.setVisibility(View.INVISIBLE);
                    v.setTag(0);
                }
                //show image and line and change button text to "hide"
                else{
                    bt_display.setText("Hide");
                    imagedisplay.setVisibility(View.VISIBLE);
                    line1.setVisibility(View.VISIBLE);
                    v.setTag(1);
                }


            }
        });
     /*
        View.OnClickListener clickListener= new OnClickListener() {
            @Override
            public void onClick(View v) {
                String message=et_data.getText().toString();
                tv_displayText.setText("Message is : "+message);
               }
        };
        bt_display.setOnClickListener(clickListener);
   */

    }

    @Override
    public void onClick(View v) {
     /* switch (v.getId()){
          case R.id.diplay:
              Toast.makeText(this, "I clicked on button", Toast.LENGTH_SHORT).show();
              break;
      }*/

    }
}

