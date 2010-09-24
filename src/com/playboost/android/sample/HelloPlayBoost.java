package com.playboost.android.sample;

import com.playboost.android.PlayBoost;
import com.playboost.android.PlayBoostOffersActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HelloPlayBoost extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button button = (Button)this.findViewById(R.id.hello);
        button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(HelloPlayBoost.this, PlayBoostOffersActivity.class);
		        intent.putExtra(PlayBoost.API_KEY, "5ac53b81f56c22a-e4da3b7fbbce2345d777-5032087c45af");
		        intent.putExtra(PlayBoost.APP_ID, "5");
		        intent.putExtra(PlayBoost.USER_ID, "1");		
				startActivity(intent);
			}
        	
        });
    }
}