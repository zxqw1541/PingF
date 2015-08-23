package xyz.pingtest.pingf;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.SQLException;


public class AddFriend extends Activity {
    //취소버튼으로 돌아갈 때 전달할 result
    private int basicResult = 99;
    //Return 버튼으로 돌아갈 때 전달할 result
    private int specialResult = 100;
    EditText SearchEdit;
    //mDBopenHelper helper;
    Cursor cursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_friend);
        Toast.makeText(getApplicationContext(), "ADD Friend", Toast.LENGTH_SHORT).show();

        this.setResult(basicResult);
        /*helper = new mDBopenHelper(this);
        try {
            helper.open();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Button btn = (Button) findViewById(R.id.btn2);
        SearchEdit = (EditText)findViewById(R.id.editText2);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cursor = helper.getMatchName(SearchEdit.getText().toString());
                helper.getAllColumns();

                /*Toast.makeText(getApplicationContext(),SearchEdit.getText(), Toast.LENGTH_SHORT).show();
                Intent resultIntent = new Intent();

                resultIntent.putExtra("memo", SearchEdit.getText().toString());
                setResult(specialResult, resultIntent);
                finish();

            }
        });*/
    }
}
