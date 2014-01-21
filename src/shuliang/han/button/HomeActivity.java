package shuliang.han.button;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class HomeActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.tab_host);
		
		TabHost tabHost = getTabHost();
		
		TabSpec tabSpec1 = tabHost.newTabSpec("tag1");
		tabSpec1.setIndicator("Button");
		Intent intent = new Intent(this, ButtonActivity.class);
		tabSpec1.setContent(intent);
		tabHost.addTab(tabSpec1);
		
		TabSpec tabSpec2 = tabHost.newTabSpec("tag2");
		tabSpec2.setIndicator("9Patch");
		Intent intent2 = new Intent(this, NinePatchActivity.class);
		tabSpec2.setContent(intent2);
		tabHost.addTab(tabSpec2);
		
		TabSpec tabSpec3 = tabHost.newTabSpec("tag3");
		tabSpec3.setIndicator("9PatchButton");
		Intent intent3 = new Intent(this, NinePatchButtonActivity.class);
		tabSpec3.setContent(intent3);
		tabHost.addTab(tabSpec3);
		
		TabSpec tabSpec4 = tabHost.newTabSpec("tag4");
		tabSpec4.setIndicator("RadioButton");
		Intent intent4 = new Intent(this, RadioButtonActivity.class);
		tabSpec4.setContent(intent4);
		tabHost.addTab(tabSpec4);
		
		TabSpec tabSpec5 = tabHost.newTabSpec("tag5");
		tabSpec5.setIndicator("CheckBox");
		Intent intent5 = new Intent(this, CheckBoxActivity.class);
		tabSpec5.setContent(intent5);
		tabHost.addTab(tabSpec5);
		
		TabSpec tabSpec6 = tabHost.newTabSpec("tag6");
		tabSpec6.setIndicator("ToggleButton");
		Intent intent6 = new Intent(this, ToggleButtonActivity.class);
		tabSpec6.setContent(intent6);
		tabHost.addTab(tabSpec6);
		
		TabSpec tabSpec7 = tabHost.newTabSpec("tag7");
		tabSpec7.setIndicator("SwitchButton");
		Intent intent7 = new Intent(this, SwitchButtonActivity.class);
		tabSpec7.setContent(intent7);
		tabHost.addTab(tabSpec7);
	}
	
}
