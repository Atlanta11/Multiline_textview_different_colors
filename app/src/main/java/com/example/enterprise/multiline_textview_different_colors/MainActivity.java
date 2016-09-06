package com.example.enterprise.multiline_textview_different_colors;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.text.Html;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void perform_action(View v) {
        TextView tv1 = (TextView) findViewById(R.id.text_view1);
        //define multiline by \n line separator
        tv1.setText("Line number 1 \nLine number 2 \nLine number 3");

        TextView tv2 = (TextView) findViewById(R.id.text_view2);
        tv2.setText("Line number 1");
        //define new line by append android system line separator
        tv2.append(System.getProperty("line.separator"));
        tv2.append("Line number 2");

        TextView tv3 = (TextView) findViewById(R.id.text_view3);
        String str = "Line number 1"
                + System.getProperty("line.separator")
                + "Line number 2";
        //define new line by android system line separator
        tv3.setText(str);

        TextView tv4 = (TextView) findViewById(R.id.text_view4);
        //define new line by html <br />tag
        String str2 = "Line number 1 <br /> Line number 2";
        //need to import android.text.Html class
        tv4.setText(Html.fromHtml(str2));

        TextView tv5 = (TextView) findViewById(R.id.text_view5);
        tv5.setText(R.string.Multiline_Text_By_N);
    }

}