package permission.auron.com.samplemarshmallowpermissionhelper.checkPermission;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import permission.auron.com.samplemarshmallowpermissionhelper.R;

/**
 * Created by luca on 5/15/16.
 */
public class ActivityCheckPermission extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
}
