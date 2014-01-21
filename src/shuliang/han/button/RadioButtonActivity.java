package shuliang.han.button;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class RadioButtonActivity extends Activity {

	RadioGroup radioGroup;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.radio_button);
		
		radioGroup = (RadioGroup) findViewById(R.id.radio_group);
		
		radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				switch (checkedId) {
				case R.id.nan:
					Toast.makeText(getApplicationContext(), "男", Toast.LENGTH_LONG).show();
					break;
				case R.id.nv:
					Toast.makeText(getApplicationContext(), "女", Toast.LENGTH_LONG).show();
					break;
				case R.id.renyao:
					Toast.makeText(getApplicationContext(), "人妖", Toast.LENGTH_LONG).show();
					break;
				case R.id.yaoren:
					Toast.makeText(getApplicationContext(), "妖人", Toast.LENGTH_LONG).show();
					break;
				default:
					break;
				}
			}
		} );
	}
	
	
	
}
