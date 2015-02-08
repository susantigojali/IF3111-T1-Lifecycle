package explicit.intent.android.sg.com.ex2;

/**
 * Created by susanti_2 on 07-Feb-15.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class ResultActivity extends Activity{

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);

        Bundle mybundle=getIntent().getExtras();
        String textKey=mybundle.getString("textKey");

        TextView textview= (TextView) findViewById(R.id.displayintentextra);
        textview.setText(textKey);
    }

    @Override
    public void finish()
    {
        EditText editText=(EditText) findViewById(R.id.returnValue);
        String returnKey=editText.getText().toString();

        Intent intent=new Intent();
        intent.putExtra("returnKey",returnKey);

        setResult(RESULT_OK, intent);
        super.finish();
    }
}
