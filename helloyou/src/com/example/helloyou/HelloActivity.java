package com.example.helloyou;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HelloActivity extends Activity {
	
private Button button;
private EditText mEdit;
@Override

protected void onCreate(Bundle savedInstanceState) {
	
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_hello);
button = (Button) findViewById(R.id.btn);
mEdit = (EditText) findViewById(R.id.editText1);

button.setOnClickListener(new OnClickListener() {
	
@Override
public void onClick(View arg0) {
Toast.makeText(getApplicationContext(),
"Hello " + mEdit.getText() + ", this is a Toast!",
Toast.LENGTH_LONG).show();
}
});
}


@Override
public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
getMenuInflater().inflate(R.menu.hello, menu);
return true;
}
}