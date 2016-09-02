package permission.auron.com.samplemarshmallowpermissionhelper;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import permission.auron.com.samplemarshmallowpermissionhelper.fragment.FragmentSinglePermission;

/**
 * Created by luca on 9/2/16.
 */
public class ActivityContainer extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.app_name);
        getSupportActionBar().setSubtitle(R.string.askSingleFragment);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.content_frame, Fragment.instantiate(ActivityContainer.this, FragmentSinglePermission.class.getName()))
                .commit();

    }
}
