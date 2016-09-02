package permission.auron.com.samplemarshmallowpermissionhelper.checkPermission;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import permission.auron.com.marshmallowpermissionhelper.ActivityManagePermission;
import permission.auron.com.marshmallowpermissionhelper.PermissionUtils;
import permission.auron.com.samplemarshmallowpermissionhelper.R;

/**
 * Created by luca on 5/15/16.
 */
public class ActivityCheckPermission extends ActivityManagePermission {

    private Spinner spinner;
    private Button test;
    private AlertDialog.Builder builder;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkpermission);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.app_name);
        getSupportActionBar().setSubtitle(R.string.checkPermission);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        test = (Button) findViewById(R.id.test);
        spinner = (Spinner) findViewById(R.id.spinner);
        List<String> list = new ArrayList<String>();
        list.add(PermissionUtils.Manifest_ACCESS_COARSE_LOCATION);
        list.add(PermissionUtils.Manifest_WRITE_CALENDAR);
        list.add(PermissionUtils.Manifest_ACCESS_FINE_LOCATION);
        list.add(PermissionUtils.Manifest_GROUP_LOCATION);
        list.add(PermissionUtils.Manifest_READ_SMS);
        list.add(PermissionUtils.Manifest_WRITE_EXTERNAL_STORAGE);
        list.add(PermissionUtils.Manifest_CAMERA);
        list.add(PermissionUtils.Manifest_READ_CONTACTS);


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        builder = new AlertDialog.Builder(ActivityCheckPermission.this, R.style.AppCompatAlertDialogStyle);
        builder.setPositiveButton(R.string.ok, null);

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String permission = spinner.getSelectedItem().toString();

                if (isPermissionGranted(ActivityCheckPermission.this, permission)) {


                    builder.setTitle(R.string.granted);
                    builder.setMessage(R.string.messagegranted);
                    builder.show();


                } else {

                    builder.setTitle(R.string.denied);
                    builder.setMessage(R.string.messagedenied);
                    builder.show();
                }

            }
        });


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettingsApp(ActivityCheckPermission.this);
            }
        });
    }

}
