package ter.android_project;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView titreApp, legendApp;
	private Button bPlay, bHighScore, bHelp, bExit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
			

		bPlay = (Button) findViewById(R.id.buttonPlay);
		bHighScore = (Button) findViewById(R.id.buttonHighScore);
		bHelp = (Button) findViewById(R.id.buttonHelp);
		bExit = (Button) findViewById(R.id.buttonExit);
		//titreApp = (TextView) findViewById
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
