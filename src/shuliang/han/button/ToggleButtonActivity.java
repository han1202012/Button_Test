package shuliang.han.button;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.toggle_button);
		
		ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggle);
		
		toggleButton.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if(isChecked)
					Toast.makeText(getApplicationContext(), "为了联盟", Toast.LENGTH_LONG).show();
				else
					Toast.makeText(getApplicationContext(), "为了部落", Toast.LENGTH_LONG).show();
			}
		});
	}
	
}
